package ua.com.shop.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.shop.dao.ProcessorDao;
import ua.com.shop.dto.form.ProcessorForm;
import ua.com.shop.entity.MeasuringSystem;
import ua.com.shop.entity.Processor;
import ua.com.shop.service.ProcessorService;
@Service
public class ProcessorServiceImpl implements ProcessorService{

	@Autowired
	private ProcessorDao processorDao;
	
	public List<Processor> findAll() {
		return processorDao.findAll();
	}

	public Processor findOne(int id) {
		return processorDao.findOne(id);
	}

	public void delete(int id) {
		processorDao.delete(id);
	}

	public ProcessorForm findForm(int id) {
		ProcessorForm form = new ProcessorForm();
		Processor entity = processorDao.findOne(id);
		form.setId(entity.getId());
		form.setModelCPU(String.valueOf(entity.getModelCPU()));
		form.setNumberOfCores(String.valueOf(entity.getNumberOfCores()));
		form.setFrequencyOfCPU(String.valueOf(entity.getFrequencyOfCPU()));
		form.setGpuModel(String.valueOf(entity.getGpuModel()));
		return form;
	}

	public Processor findUnique(String modelCPU, String numberOfCores,
			String frequencyOfCPU, String gpuModel,
			MeasuringSystem measuringSystem, MeasuringSystem measuringSystem2) {
		return processorDao.findUnique(String.valueOf(modelCPU), Integer.valueOf(numberOfCores), Double.valueOf(frequencyOfCPU), String.valueOf(gpuModel), measuringSystem.getId(),  measuringSystem2.getId());
	}
	
	public void save(ProcessorForm form) {
		Processor entity = new Processor();
		entity.setId(form.getId());
		entity.setModelCPU(String.valueOf(form.getModelCPU()));
		entity.setNumberOfCores(Integer.valueOf(form.getNumberOfCores()));
		entity.setFrequencyOfCPU(Double.valueOf(form.getFrequencyOfCPU()));
		entity.setGpuModel(String.valueOf(form.getGpuModel()));
		entity.setMeasuringSystem(form.getMeasuringSystem());
		entity.setMeasuringSystem2(form.getMeasuringSystem2());
		processorDao.save(entity);
	}

}
