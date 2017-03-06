package ua.com.shop.service;

import java.util.List;

import ua.com.shop.dto.form.BatteryForm;
import ua.com.shop.entity.Battery;
import ua.com.shop.entity.MeasuringSystem;

public interface BatteryService {

	List<Battery> findAll();
	Battery findOne(int id);
	void delete(int id);
	BatteryForm findForm(int id);
	Battery findUnique(String batteryCapacity, String hoursOfTalkTime,
			String hoursStandByTime, MeasuringSystem measuringSystem,
			MeasuringSystem measuringSystem2, MeasuringSystem measuringSystem3);
	void save(BatteryForm batteryForm);
}
