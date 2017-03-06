package ua.com.shop.validator;

import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import ua.com.shop.dto.form.BatteryForm;
import ua.com.shop.service.BatteryService;

public class BatteryValidator implements Validator {

	private final static Pattern REG = Pattern.compile("^([0-9]{1,17}\\.[0-9]{1,2})|([0-9]{1,17}\\,[0-9]{1,2})|([0-9]{1,17})$");
	
	private final BatteryService batteryService;
	
	public BatteryValidator(BatteryService batteryService) {
		this.batteryService = batteryService;
	}
	
	public boolean supports(Class<?> clazz) {
		return BatteryForm.class.equals(clazz);
	}

	public void validate(Object target, Errors errors) {
		BatteryForm form = (BatteryForm) target;
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "batteryCapacity", "", "Can't be empty");
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "hoursOfTalkTime", "", "Can't be empty");
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "hoursStandByTime", "", "Can't be empty");
		
		
		if(!REG.matcher(form.getBatteryCapacity()).matches()){
			errors.rejectValue("batteryCapacity", "", "Enter number with . or , or only numbers");
		}
		
		if(!REG.matcher(form.getHoursOfTalkTime()).matches()){
			errors.rejectValue("hoursOfTalkTime", "", "Enter number with . or , or only numbers");
		}
		
		if(!REG.matcher(form.getHoursStandByTime()).matches()){
			errors.rejectValue("hoursStandByTime", "", "Enter number with . or , or only numbers");
		}
		
		if (errors.getFieldError("batteryCapacity") == null && errors.getFieldError("hoursOfTalkTime") == null && errors.getFieldError("hoursStandByTime") == null) {
			if (batteryService.findUnique(form.getBatteryCapacity(), form.getHoursOfTalkTime(), form.getHoursStandByTime(), form.getMeasuringSystem(), form.getMeasuringSystem2(), form.getMeasuringSystem3()) != null) {
				errors.rejectValue("batteryCapacity", "", "Already exist!");
			}
		}
	}

}
