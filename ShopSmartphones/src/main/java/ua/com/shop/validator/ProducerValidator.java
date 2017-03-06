package ua.com.shop.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import ua.com.shop.entity.Producer;
import ua.com.shop.service.ProducerService;


public class ProducerValidator implements Validator{
	
	private final ProducerService producerService;
	
	public ProducerValidator(ProducerService producerService) {
		this.producerService = producerService;
	}

	public boolean supports(Class<?> clazz) {
		return Producer.class.equals(clazz);
	}

	public void validate(Object target, Errors errors) {
		Producer producer = (Producer) target;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nameOfBrand", "", "Can't be empty");
		if(producerService.findByNameOfBrand(producer.getNameOfBrand())!=null){
			errors.rejectValue("nameOfBrand", "", "Already exist");
		}
	}

}
