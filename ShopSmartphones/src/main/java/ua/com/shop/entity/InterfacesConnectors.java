package ua.com.shop.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "interfaces_connectors")
public class InterfacesConnectors {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	private double wifi;
	private double bluetooth;
	private String navigationSystem;
	private String fmTuner;
	private String nfc;
	private String usbInterface;
	private String jack;
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getWifi() {
		return wifi;
	}

	public void setWifi(double wifi) {
		this.wifi = wifi;
	}

	public double getBluetooth() {
		return bluetooth;
	}

	public void setBluetooth(double bluetooth) {
		this.bluetooth = bluetooth;
	}

	public String getNavigationSystem() {
		return navigationSystem;
	}

	public void setNavigationSystem(String navigationSystem) {
		this.navigationSystem = navigationSystem;
	}

	public String getFmTuner() {
		return fmTuner;
	}

	public void setFmTuner(String fmTuner) {
		this.fmTuner = fmTuner;
	}

	public String getNfc() {
		return nfc;
	}

	public void setNfc(String nfc) {
		this.nfc = nfc;
	}

	public String getUsbInterface() {
		return usbInterface;
	}

	public void setUsbInterface(String usbInterface) {
		this.usbInterface = usbInterface;
	}

	public String getJack() {
		return jack;
	}

	public void setJack(String jack) {
		this.jack = jack;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(bluetooth);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((fmTuner == null) ? 0 : fmTuner.hashCode());
		result = prime * result + id;
		result = prime * result + ((jack == null) ? 0 : jack.hashCode());
		result = prime
				* result
				+ ((navigationSystem == null) ? 0 : navigationSystem.hashCode());
		result = prime * result + ((nfc == null) ? 0 : nfc.hashCode());
		result = prime * result
				+ ((usbInterface == null) ? 0 : usbInterface.hashCode());
		temp = Double.doubleToLongBits(wifi);
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
		InterfacesConnectors other = (InterfacesConnectors) obj;
		if (Double.doubleToLongBits(bluetooth) != Double
				.doubleToLongBits(other.bluetooth))
			return false;
		if (fmTuner == null) {
			if (other.fmTuner != null)
				return false;
		} else if (!fmTuner.equals(other.fmTuner))
			return false;
		if (id != other.id)
			return false;
		if (jack == null) {
			if (other.jack != null)
				return false;
		} else if (!jack.equals(other.jack))
			return false;
		if (navigationSystem == null) {
			if (other.navigationSystem != null)
				return false;
		} else if (!navigationSystem.equals(other.navigationSystem))
			return false;
		if (nfc == null) {
			if (other.nfc != null)
				return false;
		} else if (!nfc.equals(other.nfc))
			return false;
		if (usbInterface == null) {
			if (other.usbInterface != null)
				return false;
		} else if (!usbInterface.equals(other.usbInterface))
			return false;
		if (Double.doubleToLongBits(wifi) != Double
				.doubleToLongBits(other.wifi))
			return false;
		return true;
	}

	


	
	
	
}
