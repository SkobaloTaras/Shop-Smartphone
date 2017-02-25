package ua.com.shop.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.shop.dao.BatteryDao;
import ua.com.shop.entity.Battery;
import ua.com.shop.service.BatteryService;
@Service
public class BatteryServiceImpl implements BatteryService{

	@Autowired
	private BatteryDao batteryDao;
	
	
	public void save(Battery battery) {
		batteryDao.save(battery);
	}

	public List<Battery> findAll() {
		return batteryDao.findAll();
	}

	public Battery findOne(int id) {
		return batteryDao.findOne(id);
	}

	public void delete(int id) {
		batteryDao.delete(id);
	}

}
