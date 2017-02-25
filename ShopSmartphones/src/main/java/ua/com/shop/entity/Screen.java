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
@Table(name = "screen")
public class Screen {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private double diagonalDisplay;
	private int screenResolution;
	private String screenType;
	private double displayNumberOfColors;
	private String protectiveGlass;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_measuringSystems_inch")
	private MeasuringSystem measuringSystem;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_measuringSystems_HD")
	private MeasuringSystem measuringSystem2;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getDiagonalDisplay() {
		return diagonalDisplay;
	}

	public void setDiagonalDisplay(double diagonalDisplay) {
		this.diagonalDisplay = diagonalDisplay;
	}

	public int getScreenResolution() {
		return screenResolution;
	}

	public void setScreenResolution(int screenResolution) {
		this.screenResolution = screenResolution;
	}

	public String getScreenType() {
		return screenType;
	}

	public void setScreenType(String screenType) {
		this.screenType = screenType;
	}

	public double getDisplayNumberOfColors() {
		return displayNumberOfColors;
	}

	public void setDisplayNumberOfColors(double displayNumberOfColors) {
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
