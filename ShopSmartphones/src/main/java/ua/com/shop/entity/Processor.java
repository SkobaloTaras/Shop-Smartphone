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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(frequencyOfCPU);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result
				+ ((gpuModel == null) ? 0 : gpuModel.hashCode());
		result = prime * result + id;
		result = prime * result
				+ ((measuringSystem == null) ? 0 : measuringSystem.hashCode());
		result = prime
				* result
				+ ((measuringSystem2 == null) ? 0 : measuringSystem2.hashCode());
		result = prime * result
				+ ((modelCPU == null) ? 0 : modelCPU.hashCode());
		result = prime * result + numberOfCores;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Processor other = (Processor) obj;
		if (Double.doubleToLongBits(frequencyOfCPU) != Double
				.doubleToLongBits(other.frequencyOfCPU))
			return false;
		if (gpuModel == null) {
			if (other.gpuModel != null)
				return false;
		} else if (!gpuModel.equals(other.gpuModel))
			return false;
		if (id != other.id)
			return false;
		if (measuringSystem == null) {
			if (other.measuringSystem != null)
				return false;
		} else if (!measuringSystem.equals(other.measuringSystem))
			return false;
		if (measuringSystem2 == null) {
			if (other.measuringSystem2 != null)
				return false;
		} else if (!measuringSystem2.equals(other.measuringSystem2))
			return false;
		if (modelCPU == null) {
			if (other.modelCPU != null)
				return false;
		} else if (!modelCPU.equals(other.modelCPU))
			return false;
		if (numberOfCores != other.numberOfCores)
			return false;
		return true;
	}

	
	
}
