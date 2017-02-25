package ua.com.shop.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ua.com.shop.entity.Memory;

public interface MemoryDao extends JpaRepository<Memory, Integer>{

	@Query("SELECT m FROM Memory m LEFT JOIN FETCH m.measuringSystem JOIN FETCH m.measuringSystem2 JOIN FETCH m.measuringSystem3")
	List<Memory> findAll();
	
	@Query("SELECT m FROM Memory m LEFT JOIN FETCH m.measuringSystem JOIN FETCH m.measuringSystem2 JOIN FETCH m.measuringSystem3 WHERE m.id = ?1")
	Memory findOne(Integer id);
}
