package ua.com.shop.validator;

import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import ua.com.shop.dto.form.ConnectivityForm;
import ua.com.shop.service.ConnectivityService;

public class ConnectivityValidator implements Validator {

	private final static Pattern REG = Pattern
			.compile("^([0-9]{1,17}\\.[0-9]{1,2})|([0-9]{1,17}\\,[0-9]{1,2})|([0-9]{1,17})$");

	private final ConnectivityService connectivityService;
	
	public ConnectivityValidator(ConnectivityService connectivityService) {
		this.connectivityService = connectivityService;
	}

	public boolean supports(Class<?> clazz) {
		return ConnectivityForm.class.equals(clazz);
	}

	public void validate(Object target, Errors errors) {
		ConnectivityForm form = (ConnectivityForm) target;
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "communicationStandards", "", "Can't be empty");
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "numberOfSIM", "", "Can't be empty");
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "sizeOfSIM", "", "Can't be empty");
	
		
		if(!REG.matcher(String.valueOf(form.getNumberOfSIM())).matches()){
			errors.rejectValue("numberOfSIM", "", "Enter numbers!");
		}
		
		if (errors.getFieldError("communicationStandards") == null && errors.getFieldError("numberOfSIM") == null && errors.getFieldError("sizeOfSIM") == null) {
			if (connectivityService.findUnique(form.getCommunicationStandards(), form.getNumberOfSIM(), form.getSizeOfSIM()) != null) {
				errors.rejectValue("communicationStandards", "", "Already exist!");
			}
		}
	}

}
