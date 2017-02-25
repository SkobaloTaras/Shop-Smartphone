package ua.com.shop.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ua.com.shop.entity.Camera;

public interface CameraDao extends JpaRepository<Camera, Integer>{

	@Query("SELECT c FROM Camera c LEFT JOIN FETCH c.measuringSystem JOIN FETCH c.measuringSystem2 JOIN FETCH c.measuringSystem3")
	List<Camera> findAll();
	
	@Query("SELECT c FROM Camera c LEFT JOIN FETCH c.measuringSystem JOIN FETCH c.measuringSystem2 JOIN FETCH c.measuringSystem3 WHERE c.id = ?1")
	Camera findOne(Integer id);
}
