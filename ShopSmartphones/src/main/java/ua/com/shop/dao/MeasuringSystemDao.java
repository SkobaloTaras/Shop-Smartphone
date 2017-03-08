package ua.com.shop.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import ua.com.shop.entity.MeasuringSystem;

public interface MeasuringSystemDao extends JpaRepository<MeasuringSystem, Integer>, JpaSpecificationExecutor<MeasuringSystem>{

	MeasuringSystem findByUnitsOfMeasurement(String unitsOfMeasurement);

}
