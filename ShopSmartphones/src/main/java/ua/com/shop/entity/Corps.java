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
@Table(name = "corps")
public class Corps {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	private String options;
	private String caseMaterial;
	private double height;
	private double width;
	private double depth;
	private double weight;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_color")
	private Color color;
	private double warranty;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_countryProducing")
	private CountryProducing countryProducing;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_producer")
	private Producer producer;
	private String touchId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_measuringSystems_mm")
	private MeasuringSystem measuringSystem;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_measuringSystems_mm2")
	private MeasuringSystem measuringSystem2;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_measuringSystems_mm3")
	private MeasuringSystem measuringSystem3;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_measuringSystems_gram")
	private MeasuringSystem measuringSystem4;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_measuringSystems_year")
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

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getDepth() {
		return depth;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}


	public Color getColor() {
		return color;
	}

	public void setColor(Color color2) {
		this.color = color2;
	}

	

	public double getWarranty() {
		return warranty;
	}

	public void setWarranty(double warranty) {
		this.warranty = warranty;
	}

	

	public Producer getProducer() {
		return producer;
	}

	public void setProducer(Producer producer2) {
		this.producer = producer2;
	}

	public String getCaseMaterial() {
		return caseMaterial;
	}

	public void setCaseMaterial(String caseMaterial) {
		this.caseMaterial = caseMaterial;
	}


	public CountryProducing getCountryProducing() {
		return countryProducing;
	}

	public void setCountryProducing(CountryProducing countryProducing) {
		this.countryProducing = countryProducing;
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
