package ua.com.shop.entity;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "smartphone")
public class Smartphone {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String model;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_connectivity")
	private Connectivity connectivity;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_operating_system")
	private OperatingSystem operatingSystem;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_screen")
	private Screen screen;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_processor")
	private Processor processor;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_memory")
	private Memory memory;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_camera")
	private Camera camera;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_interfacesConnectors")
	private InterfacesConnectors interfacesConnectors;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_battery")
	private Battery battery;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_corps")
	private Corps corps;
	private BigDecimal price;

	@ManyToMany
	@JoinTable(name = "user_smartphone", joinColumns = @JoinColumn(name = "id_user"), inverseJoinColumns = @JoinColumn(name = "id_smartphone"))
	private List<User> users;
	 
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
	
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	
}