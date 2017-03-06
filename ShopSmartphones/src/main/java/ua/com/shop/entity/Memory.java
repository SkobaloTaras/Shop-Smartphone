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
@Table(name = "memory")
public class Memory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	private int ram;
	private int inbiltMemory;
	private int expandedMemory;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_measuringSystems_GB1")
	private MeasuringSystem measuringSystem;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_measuringSystems_GB2")
	private MeasuringSystem measuringSystem2;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_measuringSystems_GB3")
	private MeasuringSystem measuringSystem3;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getInbiltMemory() {
		return inbiltMemory;
	}

	public void setInbiltMemory(int inbiltMemory) {
		this.inbiltMemory = inbiltMemory;
	}

	public int getExpandedMemory() {
		return expandedMemory;
	}

	public void setExpandedMemory(int expandedMemory) {
		this.expandedMemory = expandedMemory;
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

	public MeasuringSystem getMeasuringSystem3() {
		return measuringSystem3;
	}

	public void setMeasuringSystem3(MeasuringSystem measuringSystem3) {
		this.measuringSystem3 = measuringSystem3;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + expandedMemory;
		result = prime * result + id;
		result = prime * result + inbiltMemory;
		result = prime * result
				+ ((measuringSystem == null) ? 0 : measuringSystem.hashCode());
		result = prime
				* result
				+ ((measuringSystem2 == null) ? 0 : measuringSystem2.hashCode());
		result = prime
				* result
				+ ((measuringSystem3 == null) ? 0 : measuringSystem3.hashCode());
		result = prime * result + ram;
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
		Memory other = (Memory) obj;
		if (expandedMemory != other.expandedMemory)
			return false;
		if (id != other.id)
			return false;
		if (inbiltMemory != other.inbiltMemory)
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
		if (measuringSystem3 == null) {
			if (other.measuringSystem3 != null)
				return false;
		} else if (!measuringSystem3.equals(other.measuringSystem3))
			return false;
		if (ram != other.ram)
			return false;
		return true;
	}



	
}
