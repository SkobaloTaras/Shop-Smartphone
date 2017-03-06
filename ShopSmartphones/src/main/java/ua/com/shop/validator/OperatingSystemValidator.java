package ua.com.shop.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import ua.com.shop.entity.OperatingSystem;
import ua.com.shop.service.OperatingSystemService;

public class OperatingSystemValidator implements Validator{

	private final OperatingSystemService operatingSystemService;

	public OperatingSystemValidator(
			OperatingSystemService operatingSystemService) {
		this.operatingSystemService = operatingSystemService;
	}

	public boolean supports(Class<?> clazz) {
		return OperatingSystem.class.equals(clazz);
	}

	public void validate(Object target, Errors errors) {
		OperatingSystem operatingSystem = (OperatingSystem) target;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nameOfOperationSystem", "", "Can't be empty");
		if(operatingSystemService.findByNameOfOperationSystem(operatingSystem.getNameOfOperationSystem())!=null){
			errors.rejectValue("nameOfOperationSystem", "", "Already exist");
		}
	}
	
	

}	
