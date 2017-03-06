package ua.com.shop.editor;

import java.beans.PropertyEditorSupport;

import ua.com.shop.entity.Screen;
import ua.com.shop.service.ScreenService;

public class ScreenEditor extends PropertyEditorSupport{

	private final ScreenService screenService;

	public ScreenEditor(ScreenService screenService) {
		this.screenService = screenService;
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		Screen screen = screenService.findOne(Integer.valueOf(text));
		setValue(screen);
	}
	
	
}
