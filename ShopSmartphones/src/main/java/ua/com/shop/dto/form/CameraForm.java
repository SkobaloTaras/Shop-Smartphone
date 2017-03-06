package ua.com.shop.dto.form;

import ua.com.shop.entity.MeasuringSystem;

public class CameraForm {

	private int id;
	private String mainCamera;
	private String videoResolution;
	private String frontCamera;
	private String flash;

	private MeasuringSystem measuringSystem;

	private MeasuringSystem measuringSystem2;

	private MeasuringSystem measuringSystem3;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMainCamera() {
		return mainCamera;
	}

	public void setMainCamera(String mainCamera) {
		this.mainCamera = mainCamera;
	}

	public String getVideoResolution() {
		return videoResolution;
	}

	public void setVideoResolution(String videoResolution) {
		this.videoResolution = videoResolution;
	}

	public String getFrontCamera() {
		return frontCamera;
	}

	public void setFrontCamera(String frontCamera) {
		this.frontCamera = frontCamera;
	}

	public String getFlash() {
		return flash;
	}

	public void setFlash(String flash) {
		this.flash = flash;
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
