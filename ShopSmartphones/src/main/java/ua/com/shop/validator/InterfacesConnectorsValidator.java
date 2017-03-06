package ua.com.shop.validator;

import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import ua.com.shop.dto.form.InterfacesConnectorsForm;
import ua.com.shop.service.InterfacesConnectorsService;

public class InterfacesConnectorsValidator implements Validator {

	private final static Pattern REG = Pattern
			.compile("^([0-9]{1,17}\\.[0-9]{1,2})|([0-9]{1,17}\\,[0-9]{1,2})|([0-9]{1,17})$");

	private final InterfacesConnectorsService interfacesConnectorsService;
	
	public InterfacesConnectorsValidator(
			InterfacesConnectorsService interfacesConnectorsService) {
		this.interfacesConnectorsService = interfacesConnectorsService;
	}

	
	public boolean supports(Class<?> clazz) {
		return InterfacesConnectorsForm.class.equals(clazz);
	}

	public void validate(Object target, Errors errors) {
		InterfacesConnectorsForm form = (InterfacesConnectorsForm) target;
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "wifi", "", "Can't be empty");
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "bluetooth", "", "Can't be empty");
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "navigationSystem", "", "Can't be empty");
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "fmTuner", "", "Can't be empty");
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nfc", "", "Can't be empty");
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "usbInterface", "", "Can't be empty");
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "jack", "", "Can't be empty");
		
		
		if(!REG.matcher(String.valueOf(form.getWifi())).matches()){
			errors.rejectValue("wifi", "", "Enter numbers!");
		}
		if(!REG.matcher(String.valueOf(form.getBluetooth())).matches()){
			errors.rejectValue("bluetooth", "", "Enter numbers!");
		
		
		if (errors.getFieldError("wifi") == null && errors.getFieldError("bluetooth") == null && errors.getFieldError("navigationSystem") == null && errors.getFieldError("fmTuner") == null && errors.getFieldError("nfc") == null && errors.getFieldError("usbInterface") == null && errors.getFieldError("jack") == null) {
			if (interfacesConnectorsService.findUnique(form.getWifi(), form.getBluetooth(), form.getNavigationSystem(),form.getFmTuner() , form.getNfc(), form.getUsbInterface(), form.getJack()) != null) {
					errors.rejectValue("mainCamera", "", "Already exist!");
			}
		}
		
		
		
		
		
		
		}
		
	}

}
