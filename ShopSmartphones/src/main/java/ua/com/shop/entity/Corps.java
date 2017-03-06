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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((caseMaterial == null) ? 0 : caseMaterial.hashCode());
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime
				* result
				+ ((countryProducing == null) ? 0 : countryProducing.hashCode());
		long temp;
		temp = Double.doubleToLongBits(depth);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(height);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + id;
		result = prime * result
				+ ((measuringSystem == null) ? 0 : measuringSystem.hashCode());
		result = prime
				* result
				+ ((measuringSystem2 == null) ? 0 : measuringSystem2.hashCode());
		result = prime
				* result
				+ ((measuringSystem3 == null) ? 0 : measuringSystem3.hashCode());
		result = prime
				* result
				+ ((measuringSystem4 == null) ? 0 : measuringSystem4.hashCode());
		result = prime
				* result
				+ ((measuringSystem5 == null) ? 0 : measuringSystem5.hashCode());
		result = prime * result + ((options == null) ? 0 : options.hashCode());
		result = prime * result
				+ ((producer == null) ? 0 : producer.hashCode());
		result = prime * result + ((touchId == null) ? 0 : touchId.hashCode());
		temp = Double.doubleToLongBits(warranty);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(width);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Corps other = (Corps) obj;
		if (caseMaterial == null) {
			if (other.caseMaterial != null)
				return false;
		} else if (!caseMaterial.equals(other.caseMaterial))
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (countryProducing == null) {
			if (other.countryProducing != null)
				return false;
		} else if (!countryProducing.equals(other.countryProducing))
			return false;
		if (Double.doubleToLongBits(depth) != Double
				.doubleToLongBits(other.depth))
			return false;
		if (Double.doubleToLongBits(height) != Double
				.doubleToLongBits(other.height))
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
		if (measuringSystem4 == null) {
			if (other.measuringSystem4 != null)
				return false;
		} else if (!measuringSystem4.equals(other.measuringSystem4))
			return false;
		if (measuringSystem5 == null) {
			if (other.measuringSystem5 != null)
				return false;
		} else if (!measuringSystem5.equals(other.measuringSystem5))
			return false;
		if (options == null) {
			if (other.options != null)
				return false;
		} else if (!options.equals(other.options))
			return false;
		if (producer == null) {
			if (other.producer != null)
				return false;
		} else if (!producer.equals(other.producer))
			return false;
		if (touchId == null) {
			if (other.touchId != null)
				return false;
		} else if (!touchId.equals(other.touchId))
			return false;
		if (Double.doubleToLongBits(warranty) != Double
				.doubleToLongBits(other.warranty))
			return false;
		if (Double.doubleToLongBits(weight) != Double
				.doubleToLongBits(other.weight))
			return false;
		if (Double.doubleToLongBits(width) != Double
				.doubleToLongBits(other.width))
			return false;
		return true;
	}
	
	

	
	
}
