package ua.com.shop.dto.form;

import ua.com.shop.entity.MeasuringSystem;

public class ScreenForm {

	private int id;
	private String diagonalDisplay;
	private String screenResolution;
	private String screenType;
	private String displayNumberOfColors;
	private String protectiveGlass;
	
	private MeasuringSystem measuringSystem;
	
	private MeasuringSystem measuringSystem2;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDiagonalDisplay() {
		return diagonalDisplay;
	}

	public void setDiagonalDisplay(String diagonalDisplay) {
		this.diagonalDisplay = diagonalDisplay;
	}

	public String getScreenResolution() {
		return screenResolution;
	}

	public void setScreenResolution(String screenResolution) {
		this.screenResolution = screenResolution;
	}

	public String getScreenType() {
		return screenType;
	}

	public void setScreenType(String screenType) {
		this.screenType = screenType;
	}

	public String getDisplayNumberOfColors() {
		return displayNumberOfColors;
	}

	public void setDisplayNumberOfColors(String displayNumberOfColors) {
		this.displayNumberOfColors = displayNumberOfColors;
	}

	public String getProtectiveGlass() {
		return protectiveGlass;
	}

	public void setProtectiveGlass(String protectiveGlass) {
		this.protectiveGlass = protectiveGlass;
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
