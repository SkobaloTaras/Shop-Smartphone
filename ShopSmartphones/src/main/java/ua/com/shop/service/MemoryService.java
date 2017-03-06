package ua.com.shop.service;

import java.util.List;

import ua.com.shop.dto.form.MemoryForm;
import ua.com.shop.entity.MeasuringSystem;
import ua.com.shop.entity.Memory;

public interface MemoryService {

	List<Memory> findAll();
	Memory findOne(int id);
	void delete(int id);
	MemoryForm findForm(int id);
	Memory findUnique(String ram, String inbiltMemory, String expandedMemory,
			MeasuringSystem measuringSystem, MeasuringSystem measuringSystem2,
			MeasuringSystem measuringSystem3);
	void save(MemoryForm memoryForm);
}
