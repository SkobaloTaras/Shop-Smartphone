package ua.com.shop.service;

import java.util.List;

import ua.com.shop.dto.form.ScreenForm;
import ua.com.shop.entity.MeasuringSystem;
import ua.com.shop.entity.Screen;

public interface ScreenService {

	List<Screen> findAll();
	Screen findOne(int id);
	void delete(int id);
	ScreenForm findForm(int id);
	ScreenForm findUnique(String diagonalDisplay, String screenResolution,
			String screenType, String displayNumberOfColors,
			String protectiveGlass, MeasuringSystem measuringSystem,
			MeasuringSystem measuringSystem2);
	void save(ScreenForm screenForm);
}
