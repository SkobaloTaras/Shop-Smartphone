package ua.com.shop.dao;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ua.com.shop.entity.Corps;

public interface CorpsDao extends JpaRepository<Corps, Integer>{

	@Query("SELECT c FROM Corps c LEFT JOIN FETCH c.measuringSystem JOIN FETCH c.measuringSystem2 JOIN FETCH c.measuringSystem3 JOIN FETCH c.measuringSystem4 JOIN FETCH c.measuringSystem5  JOIN FETCH c.color JOIN FETCH c.producer  JOIN FETCH c.countryProducing")
	List<Corps> findAll();
	
	@Query("SELECT c FROM Corps c LEFT JOIN FETCH c.measuringSystem JOIN FETCH c.measuringSystem2 JOIN FETCH c.measuringSystem3 JOIN FETCH c.measuringSystem4 JOIN FETCH c.measuringSystem5  JOIN FETCH c.color JOIN FETCH c.producer JOIN FETCH c.countryProducing WHERE c.id = ?1")
	Corps findOne(Integer id);

	@Query("SELECT c FROM Corps c WHERE c.options=?1 and c.caseMaterial=?2 and c.height=?3 and c.width=?4 and c.depth=?5 and c.weight=?6 and c.warranty=?7 and c.touchId=?8 and c.measuringSystem.id=?9 and c.measuringSystem2.id=?10 and c.measuringSystem3.id=?11 and c.measuringSystem4.id=?12 and c.measuringSystem5.id=?13 and c.countryProducing.id=?14 and c.producer.id=?15 and c.color.id=?16")                           
	Corps findUnique(String options, String caseMaterial, Double height,
			Double width, Double depth, Double weight, Double warranty,
			String touchId, int measuringSystemId, int measuringSystem2Id, int measuringSystem3Id, int measuringSystem4Id, int measuringSystem5Id,
			int countryProducingId, int producerId, int colorId);

	

}


