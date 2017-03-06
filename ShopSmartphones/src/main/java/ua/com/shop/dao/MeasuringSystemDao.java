package ua.com.shop.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.com.shop.entity.MeasuringSystem;

public interface MeasuringSystemDao extends JpaRepository<MeasuringSystem, Integer>{

	MeasuringSystem findByUnitsOfMeasurement(String unitsOfMeasurement);

}
