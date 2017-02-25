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

	


	
	
	
}
