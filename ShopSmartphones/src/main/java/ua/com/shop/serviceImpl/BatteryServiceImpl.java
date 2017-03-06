package ua.com.shop.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.shop.dao.BatteryDao;
import ua.com.shop.dto.form.BatteryForm;
import ua.com.shop.entity.Battery;
import ua.com.shop.entity.MeasuringSystem;
import ua.com.shop.service.BatteryService;
@Service
public class BatteryServiceImpl implements BatteryService{

	@Autowired
	private BatteryDao batteryDao;
	
	

	public List<Battery> findAll() {
		return batteryDao.findAll();
	}

	public Battery findOne(int id) {
		return batteryDao.findOne(id);
	}

	public void delete(int id) {
		batteryDao.delete(id);
	}

	public BatteryForm findForm(int id) {
		BatteryForm form = new BatteryForm();
		Battery entity = batteryDao.findOne(id);
		form.setId(entity.getId());
		form.setBatteryCapacity(String.valueOf(entity.getBatteryCapacity()));
		form.setHoursOfTalkTime(String.valueOf(entity.getHoursOfTalkTime()));
		form.setHoursStandByTime(String.valueOf(entity.getHoursStandByTime()));
		return form;
	}

	public Battery findUnique(String batteryCapacity, String hoursOfTalkTime,
			String hoursStandByTime, MeasuringSystem measuringSystem,
			MeasuringSystem measuringSystem2, MeasuringSystem measuringSystem3) {
		return batteryDao.findUnique(Integer.valueOf(batteryCapacity), Integer.valueOf(hoursOfTalkTime), Integer.valueOf(hoursStandByTime), measuringSystem.getId(),  measuringSystem2.getId(),  measuringSystem3.getId());
	}

	public void save(BatteryForm form) {
		Battery entity = new Battery();
		entity.setId(form.getId());
		entity.setBatteryCapacity(Integer.valueOf(form.getBatteryCapacity()));
		entity.setHoursOfTalkTime(Integer.valueOf(form.getHoursOfTalkTime()));
		entity.setHoursStandByTime(Integer.valueOf(form.getHoursStandByTime()));
		entity.setMeasuringSystem(form.getMeasuringSystem());
		entity.setMeasuringSystem2(form.getMeasuringSystem2());
		entity.setMeasuringSystem3(form.getMeasuringSystem3());
		batteryDao.save(entity);
	}

	public void save(Battery battery) {
		// TODO Auto-generated method stub
		
	}
}
