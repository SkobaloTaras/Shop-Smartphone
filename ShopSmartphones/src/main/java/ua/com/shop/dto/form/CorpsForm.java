package ua.com.shop.dto.form;


import ua.com.shop.entity.Color;
import ua.com.shop.entity.CountryProducing;
import ua.com.shop.entity.MeasuringSystem;
import ua.com.shop.entity.Producer;

public class CorpsForm {

	private int id;
	private String options;
	private String caseMaterial;
	private String height;
	private String width;
	private String depth;
	private String weight;
	private Color color;
	private String warranty;
	private String touchId;
	
	private CountryProducing countryProducing;
	private Producer producer;
	
	private MeasuringSystem measuringSystem;
	
	private MeasuringSystem measuringSystem2;
	
	private MeasuringSystem measuringSystem3;
	
	private MeasuringSystem measuringSystem4;
	
	private MeasuringSystem measuringSystem5;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOptions() {
		return options;
	}

	public void setOptions(String options) {
		this.options = options;
	}

	public String getCaseMaterial() {
		return caseMaterial;
	}

	public void setCaseMaterial(String caseMaterial) {
		this.caseMaterial = caseMaterial;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWidth() {
		return width;
	}

	public void setWidth(String width) {
		this.width = width;
	}

	public String getDepth() {
		return depth;
	}

	public void setDepth(String depth) {
		this.depth = depth;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public String getWarranty() {
		return warranty;
	}

	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}

	public CountryProducing getCountryProducing() {
		return countryProducing;
	}

	public void setCountryProducing(CountryProducing countryProducing) {
		this.countryProducing = countryProducing;
	}

	public Producer getProducer() {
		return producer;
	}

	public void setProducer(Producer producer) {
		this.producer = producer;
	}

	public String getTouchId() {
		return touchId;
	}

	public void setTouchId(String touchId) {
		this.touchId = touchId;
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

	public MeasuringSystem getMeasuringSystem4() {
		return measuringSystem4;
	}

	public void setMeasuringSystem4(MeasuringSystem measuringSystem4) {
		this.measuringSystem4 = measuringSystem4;
	}

	public MeasuringSystem getMeasuringSystem5() {
		return measuringSystem5;
	}

	public void setMeasuringSystem5(MeasuringSystem measuringSystem5) {
		this.measuringSystem5 = measuringSystem5;
	}

	
	
}
