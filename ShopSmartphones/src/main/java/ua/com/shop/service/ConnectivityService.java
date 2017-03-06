package ua.com.shop.service;

import java.util.List;

import ua.com.shop.dto.form.ConnectivityForm;
import ua.com.shop.entity.Connectivity;

public interface ConnectivityService {

	
	List<Connectivity> findAll();
	Connectivity findOne(int id);
	void delete(int id);
	ConnectivityForm findForm(int id);
	Connectivity findUnique(String communicationStandards, String numberOfSIM,
			String sizeOfSIM);
	void save(ConnectivityForm connectivityForm);
}
