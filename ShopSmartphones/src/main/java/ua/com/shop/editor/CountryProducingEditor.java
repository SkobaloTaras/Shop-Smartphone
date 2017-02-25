package ua.com.shop.editor;

import java.beans.PropertyEditorSupport;

import ua.com.shop.entity.CountryProducing;
import ua.com.shop.service.CountryProducingService;

public class CountryProducingEditor extends PropertyEditorSupport{

	private final CountryProducingService countryProducingService;
	
	public CountryProducingEditor(CountryProducingService countryProducingService){
		this.countryProducingService = countryProducingService;
	}
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		CountryProducing countryProducing  = countryProducingService.findOne(Integer.valueOf(text));
		setValue(countryProducing);
	}
}
