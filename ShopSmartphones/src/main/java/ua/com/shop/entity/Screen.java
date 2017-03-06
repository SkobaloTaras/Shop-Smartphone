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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(diagonalDisplay);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(displayNumberOfColors);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + id;
		result = prime * result
				+ ((measuringSystem == null) ? 0 : measuringSystem.hashCode());
		result = prime
				* result
				+ ((measuringSystem2 == null) ? 0 : measuringSystem2.hashCode());
		result = prime * result
				+ ((protectiveGlass == null) ? 0 : protectiveGlass.hashCode());
		result = prime * result + screenResolution;
		result = prime * result
				+ ((screenType == null) ? 0 : screenType.hashCode());
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
		Screen other = (Screen) obj;
		if (Double.doubleToLongBits(diagonalDisplay) != Double
				.doubleToLongBits(other.diagonalDisplay))
			return false;
		if (Double.doubleToLongBits(displayNumberOfColors) != Double
				.doubleToLongBits(other.displayNumberOfColors))
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
		if (protectiveGlass == null) {
			if (other.protectiveGlass != null)
				return false;
		} else if (!protectiveGlass.equals(other.protectiveGlass))
			return false;
		if (screenResolution != other.screenResolution)
			return false;
		if (screenType == null) {
			if (other.screenType != null)
				return false;
		} else if (!screenType.equals(other.screenType))
			return false;
		return true;
	}
	
	
	
}
