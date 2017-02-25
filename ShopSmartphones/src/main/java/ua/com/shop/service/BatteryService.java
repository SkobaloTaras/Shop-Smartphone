package ua.com.shop.service;

import java.util.List;

import ua.com.shop.entity.Battery;

public interface BatteryService {

	void save (Battery battery);
	List<Battery> findAll();
	Battery findOne(int id);
	void delete(int id);
}
