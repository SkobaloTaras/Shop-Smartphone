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

	@Query("SELECT p FROM Processor p WHERE p.modelCPU=?1 and p.numberOfCores=?2 and p.frequencyOfCPU=?3 and p.gpuModel=?4 and p.measuringSystem.id=?5 and p.measuringSystem2.id=?6") 
	Processor findUnique(String modelCPU, Integer numberOfCores, Double frequencyOfCPU,
			String gpuModel, int measuringSystemId, int measuringSystem2Id);

	
}
