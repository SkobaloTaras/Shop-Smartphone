package ua.com.shop.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "processor")
public class Processor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String modelCPU;
	private int numberOfCores;
	private double frequencyOfCPU;
	private String gpuModel;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_measuringSystems_core")
	private MeasuringSystem measuringSystem;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_measuringSystems_GHz")
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

	public int getNumberOfCores() {
		return numberOfCores;
	}

	public void setNumberOfCores(int numberOfCores) {
		this.numberOfCores = numberOfCores;
	}

	public double getFrequencyOfCPU() {
		return frequencyOfCPU;
	}

	public void setFrequencyOfCPU(double frequencyOfCPU) {
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
