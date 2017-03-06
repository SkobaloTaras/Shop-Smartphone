package ua.com.shop.editor;

import java.beans.PropertyEditorSupport;

import ua.com.shop.entity.Battery;
import ua.com.shop.service.BatteryService;

public class BatteryEditor extends PropertyEditorSupport{

	private final BatteryService batteryService;

	public BatteryEditor(BatteryService batteryService) {
		this.batteryService = batteryService;
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		Battery battery = batteryService.findOne(Integer.valueOf(text));
		setValue(battery);
	}
	
	

	 
	
	
	
	
}
