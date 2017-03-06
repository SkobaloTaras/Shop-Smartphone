package ua.com.shop.editor;

import java.beans.PropertyEditorSupport;

import ua.com.shop.entity.InterfacesConnectors;
import ua.com.shop.service.InterfacesConnectorsService;

public class InterfacesConnectorsEditor extends PropertyEditorSupport{

	private final InterfacesConnectorsService interfacesConnectorsService;

	public InterfacesConnectorsEditor(
			InterfacesConnectorsService interfacesConnectorsService) {
		this.interfacesConnectorsService = interfacesConnectorsService;
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		InterfacesConnectors interfacesConnectors = interfacesConnectorsService.findOne(Integer.valueOf(text));
		setValue(interfacesConnectors);
	}
	
	
}
