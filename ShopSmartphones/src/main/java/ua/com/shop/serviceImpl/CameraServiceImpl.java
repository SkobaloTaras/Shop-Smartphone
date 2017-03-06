package ua.com.shop.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.shop.dao.CameraDao;
import ua.com.shop.dto.form.CameraForm;
import ua.com.shop.entity.Camera;
import ua.com.shop.entity.MeasuringSystem;
import ua.com.shop.service.CameraService;
@Service
public class CameraServiceImpl implements CameraService{
	@Autowired
	private CameraDao cameraDao;
	
	public List<Camera> findAll() {
		return cameraDao.findAll();
	}

	public Camera findOne(int id) {
		return cameraDao.findOne(id);
	}

	public void delete(int id) {
		cameraDao.delete(id);
	}

	public CameraForm findForm(int id) {
		CameraForm form = new CameraForm();
		Camera entity = cameraDao.findOne(id);
		form.setId(entity.getId());
		form.setMainCamera(String.valueOf(entity.getMainCamera()));
		form.setVideoResolution(String.valueOf(entity.getVideoResolution()));
		form.setFrontCamera(String.valueOf(entity.getFrontCamera()));
		form.setFlash(String.valueOf(entity.getFlash()));
		return form;
	}

	public Camera findUnique(String mainCamera, String videoResolution,
			String frontCamera, String flash, MeasuringSystem measuringSystem,
			MeasuringSystem measuringSystem2, MeasuringSystem measuringSystem3) {
		return cameraDao.findUnique(Integer.valueOf(mainCamera), Integer.valueOf(videoResolution), Integer.valueOf(frontCamera), String.valueOf(flash), measuringSystem.getId(),  measuringSystem2.getId(),  measuringSystem3.getId());
	}
	
	public void save(CameraForm form) {
		Camera entity = new Camera();
		entity.setId(form.getId());
		entity.setMainCamera(Integer.valueOf(form.getMainCamera()));
		entity.setVideoResolution(Integer.valueOf(form.getVideoResolution()));
		entity.setFrontCamera(Integer.valueOf(form.getFrontCamera()));
		entity.setFlash(String.valueOf(form.getFlash()));
		entity.setMeasuringSystem(form.getMeasuringSystem());
		entity.setMeasuringSystem2(form.getMeasuringSystem2());
		entity.setMeasuringSystem3(form.getMeasuringSystem3());
		cameraDao.save(entity);
	}

}
