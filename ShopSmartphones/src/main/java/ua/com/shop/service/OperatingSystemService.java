package ua.com.shop.service;

import java.util.List;

import ua.com.shop.entity.OperatingSystem;

public interface OperatingSystemService {

	void save(OperatingSystem operatingSystem);
	List<OperatingSystem> findAll();
	OperatingSystem findOne(int id);
	void delete(int id);
	void save(String nameOfOperationSystem);
	OperatingSystem findByNameOfOperationSystem(String nameOfOperationSystem);
}
