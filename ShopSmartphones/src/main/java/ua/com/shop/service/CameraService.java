package ua.com.shop.service;

import java.util.List;

import ua.com.shop.dto.form.CameraForm;
import ua.com.shop.entity.Camera;
import ua.com.shop.entity.MeasuringSystem;

public interface CameraService {

	List<Camera> findAll();
	Camera findOne(int id);
	void delete(int id);
	CameraForm findForm(int id);
	Camera findUnique(String mainCamera, String videoResolution,
			String frontCamera, String flash, MeasuringSystem measuringSystem,
			MeasuringSystem measuringSystem2, MeasuringSystem measuringSystem3);
	void save(CameraForm cameraForm);
	
}
