package ua.com.shop.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ua.com.shop.entity.Processor;

public interface ProcessorDao extends JpaRepository<Processor, Integer>{

	@Query("SELECT p FROM Processor p LEFT JOIN FETCH p.measuringSystem JOIN FETCH p.measuringSystem2")
	List<Processor> findAll();
	
	@Query("SELECT p FROM Processor p LEFT JOIN FETCH p.measuringSystem JOIN FETCH p.measuringSystem2 WHERE p.id = ?1")
	Processor findOne(Integer id);
}
