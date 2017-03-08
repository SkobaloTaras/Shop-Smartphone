package ua.com.shop.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import ua.com.shop.dto.filter.SimpleFilter;
import ua.com.shop.entity.OperatingSystem;

public interface OperatingSystemService {

	void save(OperatingSystem operatingSystem);
	List<OperatingSystem> findAll();
	OperatingSystem findOne(int id);
	void delete(int id);
	void save(String nameOfOperationSystem);
	OperatingSystem findByNameOfOperationSystem(String nameOfOperationSystem);
	Page<OperatingSystem> findAll(Pageable pageable, SimpleFilter filter);
}
