package ua.com.shop.validator;

import java.util.regex.Pattern;





import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import ua.com.shop.dto.form.CameraForm;
import ua.com.shop.service.CameraService;

public class CameraValidator implements Validator {

	private final static Pattern REG = Pattern
			.compile("^([0-9]{1,17}\\.[0-9]{1,2})|([0-9]{1,17}\\,[0-9]{1,2})|([0-9]{1,17})$");

	private final CameraService cameraService;
	
	

	public CameraValidator(CameraService cameraService) {
		this.cameraService = cameraService;
	}

	public boolean supports(Class<?> clazz) {
		return CameraForm.class.equals(clazz);
	}

	public void validate(Object target, Errors errors) {
		CameraForm form = (CameraForm) target;
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "mainCamera", "", "Can't be empty");
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "videoResolution", "", "Can't be empty");
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "frontCamera", "", "Can't be empty");
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "flash", "", "Can't be empty");
		
		
		if(!REG.matcher(String.valueOf(form.getMainCamera())).matches()){
			errors.rejectValue("mainCamera", "", "Enter numbers!");
		}
		if(!REG.matcher(String.valueOf(form.getVideoResolution())).matches()){
			errors.rejectValue("videoResolution", "", "Enter numbers!");
		}
		if(!REG.matcher(String.valueOf(form.getFrontCamera())).matches()){
			errors.rejectValue("frontCamera", "", "Enter numbers!");
		}
		
		
		if (errors.getFieldError("mainCamera") == null && errors.getFieldError("videoResolution") == null && errors.getFieldError("frontCamera") == null && errors.getFieldError("flash") == null) {
			if (cameraService.findUnique(form.getMainCamera(), form.getVideoResolution(), form.getFrontCamera(),form.getFlash() , form.getMeasuringSystem(), form.getMeasuringSystem2(), form.getMeasuringSystem3()) != null) {
				errors.rejectValue("mainCamera", "", "Already exist!");
			}
		}
		
	}

}
