package ua.com.shop.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import ua.com.shop.dto.filter.SimpleFilter;
import ua.com.shop.entity.Producer;

public interface ProducerService {

	void save(Producer producer);
	List<Producer> findAll();
	Producer findOne(int id);
	void delete(int id);
	void save(String nameOfBrand);
	Producer findByNameOfBrand(String nameOfBrand);
	Page<Producer> findAll(Pageable pageable, SimpleFilter filter);
}
