package ua.com.shop.validator;

import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import ua.com.shop.dto.form.CorpsForm;
import ua.com.shop.service.CorpsService;

public class CorpsValidator implements Validator {

	private final static Pattern REG = Pattern
			.compile("^([0-9]{1,17}\\.[0-9]{1,2})|([0-9]{1,17}\\,[0-9]{1,2})|([0-9]{1,17})$");

	private final CorpsService corpsService;

	public CorpsValidator(CorpsService corpsService) {
		this.corpsService = corpsService;
	}

	public boolean supports(Class<?> clazz) {
		return CorpsForm.class.equals(clazz);
	}

	public void validate(Object target, Errors errors) {
		CorpsForm form = (CorpsForm) target;

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "options", "",
				"Can't be empty");

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "caseMaterial", "",
				"Can't be empty");

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "height", "",
				"Can't be empty");

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "width", "",
				"Can't be empty");

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "depth", "",
				"Can't be empty");

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "weight", "",
				"Can't be empty");

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "warranty", "",
				"Can't be empty");

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "touchId", "",
				"Can't be empty");

		if (!REG.matcher(String.valueOf(form.getHeight())).matches()) {
			errors.rejectValue("height", "", "Enter numbers!");
		}
		if (!REG.matcher(String.valueOf(form.getWidth())).matches()) {
			errors.rejectValue("width", "", "Enter numbers!");
		}
		if (!REG.matcher(String.valueOf(form.getDepth())).matches()) {
			errors.rejectValue("depth", "", "Enter numbers!");
		}
		if (!REG.matcher(String.valueOf(form.getWeight())).matches()) {
			errors.rejectValue("weight", "", "Enter numbers!");
		}
		if (!REG.matcher(String.valueOf(form.getWarranty())).matches()) {
			errors.rejectValue("warranty", "", "Enter numbers!");
		}

		if (errors.getFieldError("options") == null
				&& errors.getFieldError("caseMaterial") == null
				&& errors.getFieldError("height") == null
				&& errors.getFieldError("width") == null
				&& errors.getFieldError("depth") == null
				&& errors.getFieldError("weight") == null
				&& errors.getFieldError("warranty") == null
				&& errors.getFieldError("touchId") == null) {
			if (corpsService.findUnique(form.getOptions(),
					form.getCaseMaterial(), form.getHeight(),
					form.getWidth(), form.getDepth(),
					form.getWeight(), form.getWarranty(),
					form.getTouchId(), form.getMeasuringSystem(),
					form.getMeasuringSystem2(), form.getMeasuringSystem3(),
					form.getMeasuringSystem4(), form.getMeasuringSystem5(), form.getCountryProducing(), form.getProducer(), form.getColor()) != null) {
				errors.rejectValue("options", "", "Already exist!");
			}
		}
	}

}
