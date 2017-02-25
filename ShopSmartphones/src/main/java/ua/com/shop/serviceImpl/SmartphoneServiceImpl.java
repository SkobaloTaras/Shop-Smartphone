package ua.com.shop.serviceImpl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.shop.dao.SmartphoneDao;
import ua.com.shop.entity.Smartphone;
import ua.com.shop.service.SmartphoneService;
@Service
public class SmartphoneServiceImpl implements SmartphoneService{

	@Autowired
	private SmartphoneDao smartphoneDao;
	
	public void save(Smartphone smartphone) {
		smartphoneDao.save(smartphone);
	}

	public List<Smartphone> findAll() {
		return smartphoneDao.findAll();
	}

	public Smartphone findOne(int id) {
		return smartphoneDao.findOne(id);
	}

	public void delete(int id) {
		smartphoneDao.delete(id);
	}

	public void save(String model, int connectivityId, int operatingSystemId,
			int screenId, int processorId, int memoryId, int cameraId,
			int interfacesConnectorsId, int batteryId, int corpsId,
			BigDecimal price) {
		
	}




}
