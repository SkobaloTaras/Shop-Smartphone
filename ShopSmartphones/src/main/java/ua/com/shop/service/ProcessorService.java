package ua.com.shop.service;

import java.util.List;

import ua.com.shop.dto.form.ProcessorForm;
import ua.com.shop.entity.MeasuringSystem;
import ua.com.shop.entity.Processor;

public interface ProcessorService {

	List<Processor> findAll();
	Processor findOne(int id);
	void delete(int id);
	ProcessorForm findForm(int id);
	Processor findUnique(String modelCPU, String numberOfCores,
			String frequencyOfCPU, String gpuModel,
			MeasuringSystem measuringSystem, MeasuringSystem measuringSystem2);
	void save(ProcessorForm processorForm);
	
	
}
