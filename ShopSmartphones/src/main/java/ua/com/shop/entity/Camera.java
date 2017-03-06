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
@Table(name = "camera")
public class Camera {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	private int mainCamera;
	private int videoResolution;
	private int frontCamera;
	private String flash;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_measuringSystems_mpx")
	private MeasuringSystem measuringSystem;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_measuringSystems_HD")
	private MeasuringSystem measuringSystem2;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_measuringSystems_mpx2")
	private MeasuringSystem measuringSystem3;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMainCamera() {
		return mainCamera;
	}

	public void setMainCamera(int mainCamera) {
		this.mainCamera = mainCamera;
	}

	public int getVideoResolution() {
		return videoResolution;
	}

	public void setVideoResolution(int videoResolution) {
		this.videoResolution = videoResolution;
	}

	public int getFrontCamera() {
		return frontCamera;
	}

	public void setFrontCamera(int frontCamera) {
		this.frontCamera = frontCamera;
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

	public String getFlash() {
		return flash;
	}

	public void setFlash(String flash) {
		this.flash = flash;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((flash == null) ? 0 : flash.hashCode());
		result = prime * result + frontCamera;
		result = prime * result + id;
		result = prime * result + mainCamera;
		result = prime * result
				+ ((measuringSystem == null) ? 0 : measuringSystem.hashCode());
		result = prime
				* result
				+ ((measuringSystem2 == null) ? 0 : measuringSystem2.hashCode());
		result = prime
				* result
				+ ((measuringSystem3 == null) ? 0 : measuringSystem3.hashCode());
		result = prime * result + videoResolution;
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
		Camera other = (Camera) obj;
		if (flash == null) {
			if (other.flash != null)
				return false;
		} else if (!flash.equals(other.flash))
			return false;
		if (frontCamera != other.frontCamera)
			return false;
		if (id != other.id)
			return false;
		if (mainCamera != other.mainCamera)
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
		if (videoResolution != other.videoResolution)
			return false;
		return true;
	}
	
	
}
