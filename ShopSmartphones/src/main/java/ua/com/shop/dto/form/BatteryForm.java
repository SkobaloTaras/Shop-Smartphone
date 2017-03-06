package ua.com.shop.dto.form;


import ua.com.shop.entity.MeasuringSystem;


public class BatteryForm {

	private int id;
	private String batteryCapacity;
	private String hoursOfTalkTime;
	private String hoursStandByTime;
	
	private MeasuringSystem measuringSystem;
	
	private MeasuringSystem measuringSystem2;
	
	private MeasuringSystem measuringSystem3;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(String batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public String getHoursOfTalkTime() {
		return hoursOfTalkTime;
	}

	public void setHoursOfTalkTime(String hoursOfTalkTime) {
		this.hoursOfTalkTime = hoursOfTalkTime;
	}

	public String getHoursStandByTime() {
		return hoursStandByTime;
	}

	public void setHoursStandByTime(String hoursStandByTime) {
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
	
	
}
