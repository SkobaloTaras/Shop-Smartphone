package ua.com.shop.editor;

import java.beans.PropertyEditorSupport;

import ua.com.shop.entity.Connectivity;
import ua.com.shop.service.ConnectivityService;

public class ConnectivityEditor extends PropertyEditorSupport{

	private final ConnectivityService connectivityService;

	public ConnectivityEditor(ConnectivityService connectivityService) {
		this.connectivityService = connectivityService;
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		Connectivity connectivity = connectivityService.findOne(Integer.valueOf(text));
		setValue(connectivity);
	}
	
	
	
}
