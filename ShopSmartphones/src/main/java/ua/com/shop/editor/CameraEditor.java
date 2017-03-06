package ua.com.shop.editor;

import java.beans.PropertyEditorSupport;

import ua.com.shop.entity.Camera;
import ua.com.shop.service.CameraService;

public class CameraEditor extends PropertyEditorSupport{

	private final CameraService cameraService;

	public CameraEditor(CameraService cameraService) {
		this.cameraService = cameraService;
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		Camera camera = cameraService.findOne(Integer.valueOf(text));
		setValue(camera);
	}
	
	
}
