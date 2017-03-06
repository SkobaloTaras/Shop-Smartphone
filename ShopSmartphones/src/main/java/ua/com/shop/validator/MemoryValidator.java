package ua.com.shop.validator;

import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import ua.com.shop.dto.form.MemoryForm;
import ua.com.shop.service.MemoryService;

public class MemoryValidator implements Validator{
	
	private final static Pattern REG = Pattern
			.compile("^([0-9]{1,17}\\.[0-9]{1,2})|([0-9]{1,17}\\,[0-9]{1,2})|([0-9]{1,17})$");

	private final MemoryService memoryService;
	
	

	public MemoryValidator(MemoryService memoryService) {
		this.memoryService = memoryService;
	}

	public boolean supports(Class<?> clazz) {
		return MemoryForm.class.equals(clazz);
	}

	public void validate(Object target, Errors errors) {
		MemoryForm form = (MemoryForm) target;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "ram", "", "Can't be empty");
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "inbiltMemory", "", "Can't be empty");
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "expandedMemory", "", "Can't be empty");
		
		if(!REG.matcher(String.valueOf(form.getRam())).matches()){
			errors.rejectValue("ram", "", "Enter numbers!");
		}
		if(!REG.matcher(String.valueOf(form.getInbiltMemory())).matches()){
			errors.rejectValue("inbiltMemory", "", "Enter numbers!");
		}
		if(!REG.matcher(String.valueOf(form.getExpandedMemory())).matches()){
			errors.rejectValue("expandedMemory", "", "Enter numbers!");
		}
		
		if (errors.getFieldError("ram") == null && errors.getFieldError("inbiltMemory") == null && errors.getFieldError("expandedMemory") == null) {
			if (memoryService.findUnique(form.getRam(), form.getInbiltMemory(), form.getExpandedMemory(), form.getMeasuringSystem(), form.getMeasuringSystem2(), form.getMeasuringSystem3()) != null) {
				errors.rejectValue("ram", "", "Already exist!");
			}
		}
	}



}
