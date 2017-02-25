package ua.com.shop.service;

import java.util.List;

import ua.com.shop.entity.Screen;

public interface ScreenService {

	void save(Screen screen);
	List<Screen> findAll();
	Screen findOne(int id);
	void delete(int id);
}
