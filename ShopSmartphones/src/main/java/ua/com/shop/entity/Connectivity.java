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
@Table(name = "connectivity")
public class Connectivity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	private String communicationStandards;
	private int numberOfSIM;
	private String sizeOfSIM;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_measuringSystems")
	private MeasuringSystem measuringSystem;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCommunicationStandards() {
		return communicationStandards;
	}

	public void setCommunicationStandards(String communicationStandards) {
		this.communicationStandards = communicationStandards;
	}

	public int getNumberOfSIM() {
		return numberOfSIM;
	}

	public void setNumberOfSIM(int numberOfSIM) {
		this.numberOfSIM = numberOfSIM;
	}

	public String getSizeOfSIM() {
		return sizeOfSIM;
	}

	public void setSizeOfSIM(String sizeOfSIM) {
		this.sizeOfSIM = sizeOfSIM;
	}

	public MeasuringSystem getMeasuringSystem() {
		return measuringSystem;
	}

	public void setMeasuringSystem(MeasuringSystem measuringSystem) {
		this.measuringSystem = measuringSystem;
	}


	
	
}
