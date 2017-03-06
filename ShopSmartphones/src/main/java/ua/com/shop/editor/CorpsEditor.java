package ua.com.shop.editor;

import java.beans.PropertyEditorSupport;

import ua.com.shop.entity.Corps;
import ua.com.shop.service.CorpsService;

public class CorpsEditor extends PropertyEditorSupport{

	private final CorpsService corpsService;

	public CorpsEditor(CorpsService corpsService) {
		this.corpsService = corpsService;
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		Corps corps = corpsService.findOne(Integer.valueOf(text));
		setValue(corps);
	
	}
	
	
}
