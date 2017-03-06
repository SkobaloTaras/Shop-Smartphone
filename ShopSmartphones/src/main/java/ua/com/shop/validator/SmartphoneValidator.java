package ua.com.shop.validator;




import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import ua.com.shop.dto.form.SmartphoneForm;
import ua.com.shop.service.SmartphoneService;

public class SmartphoneValidator implements Validator {

	private final static Pattern REG = Pattern
			.compile("^([0-9]{1,17}\\.[0-9]{1,2})|([0-9]{1,17}\\,[0-9]{1,2})|([0-9]{1,17})$");

	private final SmartphoneService smartphoneService;

	public SmartphoneValidator(SmartphoneService smartphoneService) {
		this.smartphoneService = smartphoneService;
	}

	public boolean supports(Class<?> clazz) {
		return SmartphoneForm.class.equals(clazz);
	}

	public void validate(Object target, Errors errors) {
		SmartphoneForm form = (SmartphoneForm) target;

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "model", "",
				"Can't be empty");

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "price", "",
				"Can't be empty");

		if (!REG.matcher(String.valueOf(form.getPrice())).matches()) {
			errors.rejectValue("price", "", "Enter numbers!");
		}

		if (errors.getFieldError("model") == null
				&& errors.getFieldError("price") == null) {
			if (smartphoneService.findUnique(form.getModel(), form.getPrice(),
					form.getConnectivity(), form.getOperatingSystem(),
					form.getScreen(), form.getProcessor(), form.getMemory(),
					form.getCamera(), form.getInterfacesConnectors(),
					form.getBattery(), form.getCorps()) != null) {
				errors.rejectValue("model", "", "Already exist!");
			}
		}
	}
}
