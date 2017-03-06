package ua.com.shop.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ua.com.shop.dto.form.ScreenForm;
import ua.com.shop.entity.Screen;

public interface ScreenDao extends JpaRepository<Screen, Integer>{

	@Query("SELECT s FROM Screen s LEFT JOIN FETCH s.measuringSystem JOIN FETCH s.measuringSystem2")
	List<Screen> findAll();
	
	@Query("SELECT s FROM Screen s LEFT JOIN FETCH s.measuringSystem JOIN FETCH s.measuringSystem2 WHERE s.id = ?1")
	Screen findOne(Integer id);

	@Query("SELECT s FROM Screen s WHERE s.diagonalDisplay=?1 and s.screenResolution=?2 and s.screenType=?3 and s.displayNumberOfColors=?4 and s.protectiveGlass=?5 and s.measuringSystem.id=?6 and s.measuringSystem2.id=?7")
	ScreenForm findUnique(Double diagonalDisplay, Integer screenResolution, String screenType,
			Double displayNumberOfColors, String protectiveGlass, int measuringSystemId, int measuringSystem2Id);
}
