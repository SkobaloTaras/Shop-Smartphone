package ua.com.shop.dto.form;


import ua.com.shop.entity.Battery;
import ua.com.shop.entity.Camera;
import ua.com.shop.entity.Connectivity;
import ua.com.shop.entity.Corps;
import ua.com.shop.entity.InterfacesConnectors;
import ua.com.shop.entity.Memory;
import ua.com.shop.entity.OperatingSystem;
import ua.com.shop.entity.Processor;
import ua.com.shop.entity.Screen;

public class SmartphoneForm {

	private int id;
	
	private String model;
	
	private Connectivity connectivity;
	private OperatingSystem operatingSystem;
	private Screen screen;
	private Processor processor;
	private Memory memory;
	private Camera camera;
	private InterfacesConnectors interfacesConnectors;
	private Battery battery;
	private Corps corps;
	
	private String price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Connectivity getConnectivity() {
		return connectivity;
	}

	public void setConnectivity(Connectivity connectivity) {
		this.connectivity = connectivity;
	}

	public OperatingSystem getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(OperatingSystem operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public Screen getScreen() {
		return screen;
	}

	public void setScreen(Screen screen) {
		this.screen = screen;
	}

	public Processor getProcessor() {
		return processor;
	}

	public void setProcessor(Processor processor) {
		this.processor = processor;
	}

	public Memory getMemory() {
		return memory;
	}

	public void setMemory(Memory memory) {
		this.memory = memory;
	}

	public Camera getCamera() {
		return camera;
	}

	public void setCamera(Camera camera) {
		this.camera = camera;
	}

	public InterfacesConnectors getInterfacesConnectors() {
		return interfacesConnectors;
	}

	public void setInterfacesConnectors(InterfacesConnectors interfacesConnectors) {
		this.interfacesConnectors = interfacesConnectors;
	}

	public Battery getBattery() {
		return battery;
	}

	public void setBattery(Battery battery) {
		this.battery = battery;
	}

	public Corps getCorps() {
		return corps;
	}

	public void setCorps(Corps corps) {
		this.corps = corps;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	

	
	
}
