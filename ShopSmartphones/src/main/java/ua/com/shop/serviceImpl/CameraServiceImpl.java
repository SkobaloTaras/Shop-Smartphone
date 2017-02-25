package ua.com.shop.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.shop.dao.CameraDao;
import ua.com.shop.entity.Camera;
import ua.com.shop.service.CameraService;
@Service
public class CameraServiceImpl implements CameraService{
	@Autowired
	private CameraDao cameraDao;
	
	public void save(Camera camera) {
		cameraDao.save(camera);
	}

	public List<Camera> findAll() {
		return cameraDao.findAll();
	}

	public Camera findOne(int id) {
		return cameraDao.findOne(id);
	}

	public void delete(int id) {
		cameraDao.delete(id);
	}

}
