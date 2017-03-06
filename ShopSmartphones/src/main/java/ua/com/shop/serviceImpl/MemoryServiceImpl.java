package ua.com.shop.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.shop.dao.MemoryDao;
import ua.com.shop.dto.form.MemoryForm;
import ua.com.shop.entity.MeasuringSystem;
import ua.com.shop.entity.Memory;
import ua.com.shop.service.MemoryService;
@Service
public class MemoryServiceImpl implements MemoryService{

	@Autowired
	private MemoryDao memoryDao;
	

	public List<Memory> findAll() {
		return memoryDao.findAll();
	}

	public Memory findOne(int id) {
		return memoryDao.findOne(id);
	}

	public void delete(int id) {
		memoryDao.delete(id);
	}


	public MemoryForm findForm(int id) {
		MemoryForm form = new MemoryForm();
		Memory entity = memoryDao.findOne(id);
		form.setId(entity.getId());
		form.setRam(String.valueOf(entity.getRam()));
		form.setInbiltMemory(String.valueOf(entity.getInbiltMemory()));
		form.setExpandedMemory(String.valueOf(entity.getExpandedMemory()));
		return form;
	}

	public Memory findUnique(String ram, String inbiltMemory,
			String expandedMemory, MeasuringSystem measuringSystem,
			MeasuringSystem measuringSystem2, MeasuringSystem measuringSystem3) {
		return memoryDao.findUnique(Integer.valueOf(ram), Integer.valueOf(inbiltMemory), Integer.valueOf(expandedMemory), measuringSystem.getId(),  measuringSystem2.getId(),  measuringSystem3.getId());
	}
	
	public void save(MemoryForm  form) {
		Memory entity = new Memory();
		entity.setId(form.getId());
		entity.setRam(Integer.valueOf(form.getRam()));
		entity.setInbiltMemory(Integer.valueOf(form.getInbiltMemory()));
		entity.setExpandedMemory(Integer.valueOf(form.getExpandedMemory()));
		entity.setMeasuringSystem(form.getMeasuringSystem());
		entity.setMeasuringSystem2(form.getMeasuringSystem2());
		entity.setMeasuringSystem3(form.getMeasuringSystem3());
		memoryDao.save(entity);
	}
}
