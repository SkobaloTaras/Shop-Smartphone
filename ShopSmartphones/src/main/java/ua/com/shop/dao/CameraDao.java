package ua.com.shop.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ua.com.shop.entity.Camera;

public interface CameraDao extends JpaRepository<Camera, Integer> {

	@Query("SELECT c FROM Camera c LEFT JOIN FETCH c.measuringSystem JOIN FETCH c.measuringSystem2 JOIN FETCH c.measuringSystem3")
	List<Camera> findAll();

	@Query("SELECT c FROM Camera c LEFT JOIN FETCH c.measuringSystem JOIN FETCH c.measuringSystem2 JOIN FETCH c.measuringSystem3 WHERE c.id = ?1")
	Camera findOne(Integer id);

	@Query("SELECT c FROM Camera c WHERE c.mainCamera=?1 and c.videoResolution=?2 and c.frontCamera=?3 and c.flash=?4 and c.measuringSystem.id=?5 and c.measuringSystem2.id=?6 and c.measuringSystem3.id=?7")
	Camera findUnique(Integer mainCamera, Integer videoResolution,
			Integer frontCamera, String flash, int measuringSystemId,
			int measuringSystem2Id, int measuringSystem3Id);

}
