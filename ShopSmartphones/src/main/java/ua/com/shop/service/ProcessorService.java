package ua.com.shop.service;

import java.util.List;

import ua.com.shop.entity.Processor;

public interface ProcessorService {

	void save(Processor processor );
	List<Processor> findAll();
	Processor findOne(int id);
	void delete(int id);
	
}
