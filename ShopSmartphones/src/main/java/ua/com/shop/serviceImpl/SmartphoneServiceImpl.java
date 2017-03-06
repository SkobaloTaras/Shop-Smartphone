package ua.com.shop.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.shop.dao.SmartphoneDao;
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
import ua.com.shop.service.SmartphoneService;
@Service
public class SmartphoneServiceImpl implements SmartphoneService{

	@Autowired
	private SmartphoneDao smartphoneDao;
	
	public List<Smartphone> findAll() {
		return smartphoneDao.findAll();
	}

	public Smartphone findOne(int id) {
		return smartphoneDao.findOne(id);
	}

	public void delete(int id) {
		smartphoneDao.delete(id);
	}

	public SmartphoneForm findForm(int id) {
		SmartphoneForm form = new SmartphoneForm();
		Smartphone entity = smartphoneDao.findOne(id);
		form.setId(entity.getId());
		form.setModel(String.valueOf(entity.getModel()));
		form.setPrice(String.valueOf(entity.getPrice()));
		return form;
	}



	public void save(SmartphoneForm form) {
		Smartphone entity = new Smartphone();
		entity.setId(form.getId());
		entity.setModel(String.valueOf(form.getModel()));
		entity.setConnectivity(form.getConnectivity());
		entity.setOperatingSystem(form.getOperatingSystem());
		entity.setScreen(form.getScreen());
		entity.setProcessor(form.getProcessor());
		entity.setMemory(form.getMemory());
		entity.setCamera(form.getCamera());
		entity.setInterfacesConnectors(form.getInterfacesConnectors());
		entity.setBattery(form.getBattery());
		entity.setCorps(form.getCorps());
		entity.setPrice(Integer.valueOf(form.getPrice()));
		smartphoneDao.save(entity);
	}

	public Smartphone findUnique(String model, String price,
			Connectivity connectivity, OperatingSystem operatingSystem,
			Screen screen, Processor processor, Memory memory, Camera camera,
			InterfacesConnectors interfacesConnectors, Battery battery,
			Corps corps) {
		return smartphoneDao.findUnique(String.valueOf(model), String.valueOf(price), connectivity.getId(), operatingSystem.getId(),
				screen.getId(), processor.getId(), memory.getId(), camera.getId(), interfacesConnectors.getId(), 
				battery.getId(), corps.getId());
	}



	




}
