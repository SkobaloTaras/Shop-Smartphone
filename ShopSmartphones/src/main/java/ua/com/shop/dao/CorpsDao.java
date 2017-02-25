package ua.com.shop.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ua.com.shop.entity.Corps;

public interface CorpsDao extends JpaRepository<Corps, Integer>{

	@Query("SELECT c FROM Corps c LEFT JOIN FETCH c.measuringSystem JOIN FETCH c.measuringSystem2 JOIN FETCH c.measuringSystem3 JOIN FETCH c.measuringSystem4 JOIN FETCH c.measuringSystem5  JOIN FETCH c.color JOIN FETCH c.producer")
	List<Corps> findAll();
	
	@Query("SELECT c FROM Corps c LEFT JOIN FETCH c.measuringSystem JOIN FETCH c.measuringSystem2 JOIN FETCH c.measuringSystem3 JOIN FETCH c.measuringSystem4 JOIN FETCH c.measuringSystem5  JOIN FETCH c.color JOIN FETCH c.producer WHERE c.id = ?1")
	Corps findOne(Integer id);
}
