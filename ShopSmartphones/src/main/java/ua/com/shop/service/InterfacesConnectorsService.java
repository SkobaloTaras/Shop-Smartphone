package ua.com.shop.service;

import java.util.List;

import ua.com.shop.entity.InterfacesConnectors;

public interface InterfacesConnectorsService {

	
	void save(InterfacesConnectors interfacesConnectors);
	List<InterfacesConnectors> findAll();
	InterfacesConnectors findOne(int id);
	void delete(int id);
}
