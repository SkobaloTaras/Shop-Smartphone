package ua.com.shop.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import ua.com.shop.entity.MeasuringSystem;
import ua.com.shop.service.MeasuringSystemService;

public class MeasuringSystemValidator implements Validator {

	private final MeasuringSystemService measuringSystemService;

	public MeasuringSystemValidator(
			MeasuringSystemService measuringSystemService) {
		this.measuringSystemService = measuringSystemService;
	}

	public boolean supports(Class<?> clazz) {
		return MeasuringSystem.class.equals(clazz);
	}

	public void validate(Object target, Errors errors) {
		MeasuringSystem measuringSystem = (MeasuringSystem) target;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "unitsOfMeasurement", "", "Can't be empty");
		if(measuringSystemService.findByUnitsOfMeasurement(measuringSystem.getUnitsOfMeasurement())!=null){
			errors.rejectValue("unitsOfMeasurement", "", "Already exist");
		}
	}
	
	

}
