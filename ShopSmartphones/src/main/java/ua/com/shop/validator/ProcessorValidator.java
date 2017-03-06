package ua.com.shop.validator;

import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import ua.com.shop.dto.form.ProcessorForm;
import ua.com.shop.service.ProcessorService;

public class ProcessorValidator implements Validator {

	private final static Pattern REG = Pattern
			.compile("^([0-9]{1,17}\\.[0-9]{1,2})|([0-9]{1,17}\\,[0-9]{1,2})|([0-9]{1,17})$");

	private final ProcessorService processorService;
	
	public ProcessorValidator(ProcessorService processorService) {
		this.processorService = processorService;
	}

	public boolean supports(Class<?> clazz) {
		return ProcessorForm.class.equals(clazz);
	}

	public void validate(Object target, Errors errors) {
		ProcessorForm form = (ProcessorForm) target;
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "modelCPU", "", "Can't be empty");
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "numberOfCores", "", "Can't be empty");
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "frequencyOfCPU", "", "Can't be empty");
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "gpuModel", "", "Can't be empty");
		
		
		if(!REG.matcher(String.valueOf(form.getNumberOfCores())).matches()){
			errors.rejectValue("numberOfCores", "", "Enter numbers!");
		}
		if(!REG.matcher(String.valueOf(form.getFrequencyOfCPU())).matches()){
			errors.rejectValue("frequencyOfCPU", "", "Enter numbers!");
		}
		
		
		if (errors.getFieldError("modelCPU") == null && errors.getFieldError("numberOfCores") == null && errors.getFieldError("frequencyOfCPU") == null && errors.getFieldError("gpuModel") == null) {
			if (processorService.findUnique(form.getModelCPU(), form.getNumberOfCores(), form.getFrequencyOfCPU(),form.getGpuModel() , form.getMeasuringSystem(), form.getMeasuringSystem2()) != null) {
				errors.rejectValue("mainCamera", "", "Already exist!");
			}
		}
		
		
		
		
		
		
	}
	
}
