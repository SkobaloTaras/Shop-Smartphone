package ua.com.shop.dto.form;

import ua.com.shop.entity.MeasuringSystem;

public class ProcessorForm {

	private int id;
	private String modelCPU;
	private String numberOfCores;
	private String frequencyOfCPU;
	private String gpuModel;
	
	private MeasuringSystem measuringSystem;
	
	private MeasuringSystem measuringSystem2;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModelCPU() {
		return modelCPU;
	}

	public void setModelCPU(String modelCPU) {
		this.modelCPU = modelCPU;
	}

	public String getNumberOfCores() {
		return numberOfCores;
	}

	public void setNumberOfCores(String numberOfCores) {
		this.numberOfCores = numberOfCores;
	}

	public String getFrequencyOfCPU() {
		return frequencyOfCPU;
	}

	public void setFrequencyOfCPU(String frequencyOfCPU) {
		this.frequencyOfCPU = frequencyOfCPU;
	}

	public String getGpuModel() {
		return gpuModel;
	}

	public void setGpuModel(String gpuModel) {
		this.gpuModel = gpuModel;
	}

	public MeasuringSystem getMeasuringSystem() {
		return measuringSystem;
	}

	public void setMeasuringSystem(MeasuringSystem measuringSystem) {
		this.measuringSystem = measuringSystem;
	}

	public MeasuringSystem getMeasuringSystem2() {
		return measuringSystem2;
	}

	public void setMeasuringSystem2(MeasuringSystem measuringSystem2) {
		this.measuringSystem2 = measuringSystem2;
	}

	
	
	
	
	
}
