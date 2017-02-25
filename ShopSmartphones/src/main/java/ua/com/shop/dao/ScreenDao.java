package ua.com.shop.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ua.com.shop.entity.Screen;

public interface ScreenDao extends JpaRepository<Screen, Integer>{

	@Query("SELECT s FROM Screen s LEFT JOIN FETCH s.measuringSystem JOIN FETCH s.measuringSystem2")
	List<Screen> findAll();
	
	@Query("SELECT s FROM Screen s LEFT JOIN FETCH s.measuringSystem JOIN FETCH s.measuringSystem2 WHERE s.id = ?1")
	Screen findOne(Integer id);
}
