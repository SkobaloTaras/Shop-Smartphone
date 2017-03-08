package ua.com.shop.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import ua.com.shop.entity.OperatingSystem;

public interface OperatingSystemDao extends
		JpaRepository<OperatingSystem, Integer>, JpaSpecificationExecutor<OperatingSystem> {

	OperatingSystem findByNameOfOperationSystem(String nameOfOperationSystem);

}
