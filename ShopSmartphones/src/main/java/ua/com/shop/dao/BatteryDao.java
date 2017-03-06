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

	@Query("SELECT b FROM Battery b WHERE b.batteryCapacity=?1 and b.hoursOfTalkTime=?2 and b.hoursStandByTime=?3 and b.measuringSystem.id=?4 and b.measuringSystem2.id=?5 and b.measuringSystem3.id=?6")
	Battery findUnique(Integer batteryCapacity, Integer hoursOfTalkTime, Integer hoursStandByTime,
			int measuringSystemId, int measuringSystem2Id, int measuringSystem3Id);
	
			
}
