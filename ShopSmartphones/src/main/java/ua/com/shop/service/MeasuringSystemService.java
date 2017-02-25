package ua.com.shop.service;

import java.util.List;

import ua.com.shop.entity.MeasuringSystem;

public interface MeasuringSystemService {

	void save (MeasuringSystem measuringSystem);
	List<MeasuringSystem> findAll();
	MeasuringSystem findOne(int id);
	void delete(int id);
	void save(String unitsOfMeasurement);
}
