package ua.com.shop.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ua.com.shop.entity.Connectivity;

public interface ConnectivityDao extends JpaRepository<Connectivity, Integer>{

	@Query("SELECT c FROM Connectivity c LEFT JOIN FETCH c.measuringSystem ")
	List<Connectivity> findAll();
	
	@Query("SELECT c FROM Connectivity c LEFT JOIN FETCH c.measuringSystem WHERE c.id = ?1")
	Connectivity findOne(Integer id);
}
