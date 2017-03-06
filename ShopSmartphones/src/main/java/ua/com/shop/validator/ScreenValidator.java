package ua.com.shop.validator;

import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import ua.com.shop.dto.form.ScreenForm;
import ua.com.shop.service.ScreenService;

public class ScreenValidator implements Validator {

	private final static Pattern REG = Pattern
			.compile("^([0-9]{1,17}\\.[0-9]{1,2})|([0-9]{1,17}\\,[0-9]{1,2})|([0-9]{1,17})$");

	private final ScreenService screenService;
	
	public ScreenValidator(ScreenService screenService) {
		this.screenService = screenService;
	}

	public boolean supports(Class<?> clazz) {
		return ScreenForm.class.equals(clazz);
	}

	public void validate(Object target, Errors errors) {
		ScreenForm form = (ScreenForm) target;
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "diagonalDisplay", "", "Can't be empty");
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "screenResolution", "", "Can't be empty");
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "screenType", "", "Can't be empty");
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "displayNumberOfColors", "", "Can't be empty");
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "protectiveGlass", "", "Can't be empty");
		
		
		if(!REG.matcher(String.valueOf(form.getDiagonalDisplay())).matches()){
			errors.rejectValue("numberOfCores", "", "Enter numbers!");
		}
		if(!REG.matcher(String.valueOf(form.getScreenResolution())).matches()){
			errors.rejectValue("frequencyOfCPU", "", "Enter numbers!");
		}
		if(!REG.matcher(String.valueOf(form.getDisplayNumberOfColors())).matches()){
			errors.rejectValue("frequencyOfCPU", "", "Enter numbers!");
		}
		
		
		if (errors.getFieldError("diagonalDisplay") == null && errors.getFieldError("screenResolution") == null && errors.getFieldError("screenType") == null && errors.getFieldError("displayNumberOfColors") == null && errors.getFieldError("protectiveGlass") == null) {
			if (screenService.findUnique(form.getDiagonalDisplay(), form.getScreenResolution(), form.getScreenType(), form.getDisplayNumberOfColors(), form.getProtectiveGlass(), form.getMeasuringSystem(), form.getMeasuringSystem2()) != null) {
				errors.rejectValue("mainCamera", "", "Already exist!");
			}
		}
		
	}

}
