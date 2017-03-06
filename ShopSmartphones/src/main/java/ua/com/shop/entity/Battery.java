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
@Table(name="battery")
public class Battery {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int batteryCapacity;
	private int hoursOfTalkTime;
	private int hoursStandByTime;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_measuringSystems_mAh")
	private MeasuringSystem measuringSystem;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_measuringSystems_h")
	private MeasuringSystem measuringSystem2;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_measuringSystems_h2")
	private MeasuringSystem measuringSystem3;
	


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public int getHoursOfTalkTime() {
		return hoursOfTalkTime;
	}

	public void setHoursOfTalkTime(int hoursOfTalkTime) {
		this.hoursOfTalkTime = hoursOfTalkTime;
	}

	public int getHoursStandByTime() {
		return hoursStandByTime;
	}

	public void setHoursStandByTime(int hoursStandByTime) {
		this.hoursStandByTime = hoursStandByTime;
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
		result = prime * result + batteryCapacity;
		result = prime * result + hoursOfTalkTime;
		result = prime * result + hoursStandByTime;
		result = prime * result + id;
		result = prime * result
				+ ((measuringSystem == null) ? 0 : measuringSystem.hashCode());
		result = prime
				* result
				+ ((measuringSystem2 == null) ? 0 : measuringSystem2.hashCode());
		result = prime
				* result
				+ ((measuringSystem3 == null) ? 0 : measuringSystem3.hashCode());
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
		Battery other = (Battery) obj;
		if (batteryCapacity != other.batteryCapacity)
			return false;
		if (hoursOfTalkTime != other.hoursOfTalkTime)
			return false;
		if (hoursStandByTime != other.hoursStandByTime)
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
		if (measuringSystem3 == null) {
			if (other.measuringSystem3 != null)
				return false;
		} else if (!measuringSystem3.equals(other.measuringSystem3))
			return false;
		return true;
	}

	
	
	
}
