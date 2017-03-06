package ua.com.shop.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import ua.com.shop.entity.CountryProducing;
import ua.com.shop.service.CountryProducingService;


public class CountryProducingValidator implements Validator {

	private final CountryProducingService countryProducingService;
	
	
	
	public CountryProducingValidator(
			CountryProducingService countryProducingService) {
		this.countryProducingService = countryProducingService;
	}

	public boolean supports(Class<?> clazz) {
		return CountryProducing.class.equals(clazz);
	}

	public void validate(Object target, Errors errors) {
		CountryProducing countryProducing = (CountryProducing) target;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nameOfCountry", "", "Can't be empty");
		if(countryProducingService.findByNameOfCountry(countryProducing.getNameOfCountry())!=null){
			errors.rejectValue("nameOfCountry", "", "Already exist");
		}
	}

	

}
