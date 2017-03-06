package ua.com.shop.service;

import java.util.List;




import ua.com.shop.dto.form.SmartphoneForm;
import ua.com.shop.entity.Battery;
import ua.com.shop.entity.Camera;
import ua.com.shop.entity.Connectivity;
import ua.com.shop.entity.Corps;
import ua.com.shop.entity.InterfacesConnectors;
import ua.com.shop.entity.Memory;
import ua.com.shop.entity.OperatingSystem;
import ua.com.shop.entity.Processor;
import ua.com.shop.entity.Screen;
import ua.com.shop.entity.Smartphone;

public interface SmartphoneService {

	List<Smartphone> findAll();

	Smartphone findOne(int id);

	void delete(int id);

	SmartphoneForm findForm(int id);

	Smartphone findUnique(String model, String price, Connectivity connectivity,
			OperatingSystem operatingSystem, Screen screen,
			Processor processor, Memory memory, Camera camera,
			InterfacesConnectors interfacesConnectors, Battery battery,
			Corps corps);
	
	void save(SmartphoneForm smartphoneForm);

}
