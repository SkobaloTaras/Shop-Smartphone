package ua.com.shop.service;

import java.math.BigDecimal;
import java.util.List;

import ua.com.shop.entity.Smartphone;

public interface SmartphoneService {

	void save(Smartphone smartphone);
	List<Smartphone> findAll();
	Smartphone findOne(int id);
	void delete(int id);
	void save(String model, int connectivityId, int operatingSystemId,
			int screenId, int processorId, int memoryId, int cameraId,
			int interfacesConnectorsId, int batteryId, int corpsId,
			BigDecimal price);
}
