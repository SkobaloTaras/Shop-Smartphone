package ua.com.shop.service;

import java.util.List;

import ua.com.shop.entity.Corps;

public interface CorpsService {

	void save(Corps corps);
	List<Corps> findAll ();
	Corps findOne (int id);
	void delete(int id);
	
}
