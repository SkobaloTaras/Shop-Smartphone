package ua.com.shop.editor;

import java.beans.PropertyEditorSupport;

import ua.com.shop.entity.Smartphone;
import ua.com.shop.service.SmartphoneService;

public class SmartphoneEditor extends PropertyEditorSupport{

	private final SmartphoneService smartphoneService;

	public SmartphoneEditor(SmartphoneService smartphoneService) {
		this.smartphoneService = smartphoneService;
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		Smartphone smartphone = smartphoneService.findOne(Integer.valueOf(text));
		setValue(smartphone);
	}
	
	
}
