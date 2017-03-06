package ua.com.shop.editor;

import java.beans.PropertyEditorSupport;

import ua.com.shop.entity.MeasuringSystem;
import ua.com.shop.service.MeasuringSystemService;

public class MeasuringSystemEditor extends PropertyEditorSupport{

	private final MeasuringSystemService measuringSystemService;

	public MeasuringSystemEditor(MeasuringSystemService systemService) {
		this.measuringSystemService = systemService;
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		MeasuringSystem measuringSystem = measuringSystemService.findOne(Integer.valueOf(text));
		setValue(measuringSystem);
	}
}
