package ua.com.shop.service;

import java.util.List;

import ua.com.shop.entity.Connectivity;

public interface ConnectivityService {

	
	void save (Connectivity connectivity);
	List<Connectivity> findAll();
	Connectivity findOne(int id);
	void delete(int id);
}
