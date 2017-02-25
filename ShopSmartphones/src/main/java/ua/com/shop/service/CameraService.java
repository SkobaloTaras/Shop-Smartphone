package ua.com.shop.service;

import java.util.List;

import ua.com.shop.entity.Camera;

public interface CameraService {

	void save(Camera camera);
	List<Camera> findAll();
	Camera findOne(int id);
	void delete(int id);
}
