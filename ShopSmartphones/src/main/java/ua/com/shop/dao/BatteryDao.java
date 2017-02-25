package ua.com.shop.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ua.com.shop.entity.Battery;

public interface BatteryDao extends JpaRepository<Battery, Integer>{

	@Query("SELECT b FROM Battery b LEFT JOIN FETCH b.measuringSystem JOIN FETCH b.measuringSystem2 JOIN FETCH b.measuringSystem3")
	List<Battery> findAll();

	@Query("SELECT b FROM Battery b LEFT JOIN FETCH b.measuringSystem JOIN FETCH b.measuringSystem2 JOIN FETCH b.measuringSystem3 WHERE b.id = ?1")
	Battery findOne(Integer id);
}
