package ua.com.shop.editor;

import java.beans.PropertyEditorSupport;

import ua.com.shop.entity.MeasuringSystem;
import ua.com.shop.service.MeasuringSystemService;

public class MeasuringSystemEditor extends PropertyEditorSupport{

	private final MeasuringSystemService systemService;

	public MeasuringSystemEditor(MeasuringSystemService systemService) {
		this.systemService = systemService;
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		MeasuringSystem system = systemService.findOne(Integer.valueOf(text));
		setValue(system);
	}
}
