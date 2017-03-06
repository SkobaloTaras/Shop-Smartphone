package ua.com.shop.entity;

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
	private int price;

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
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((battery == null) ? 0 : battery.hashCode());
		result = prime * result + ((camera == null) ? 0 : camera.hashCode());
		result = prime * result
				+ ((connectivity == null) ? 0 : connectivity.hashCode());
		result = prime * result + ((corps == null) ? 0 : corps.hashCode());
		result = prime * result + id;
		result = prime
				* result
				+ ((interfacesConnectors == null) ? 0 : interfacesConnectors
						.hashCode());
		result = prime * result + ((memory == null) ? 0 : memory.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result
				+ ((operatingSystem == null) ? 0 : operatingSystem.hashCode());
		result = prime * result + price;
		result = prime * result
				+ ((processor == null) ? 0 : processor.hashCode());
		result = prime * result + ((screen == null) ? 0 : screen.hashCode());
		result = prime * result + ((users == null) ? 0 : users.hashCode());
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
		Smartphone other = (Smartphone) obj;
		if (battery == null) {
			if (other.battery != null)
				return false;
		} else if (!battery.equals(other.battery))
			return false;
		if (camera == null) {
			if (other.camera != null)
				return false;
		} else if (!camera.equals(other.camera))
			return false;
		if (connectivity == null) {
			if (other.connectivity != null)
				return false;
		} else if (!connectivity.equals(other.connectivity))
			return false;
		if (corps == null) {
			if (other.corps != null)
				return false;
		} else if (!corps.equals(other.corps))
			return false;
		if (id != other.id)
			return false;
		if (interfacesConnectors == null) {
			if (other.interfacesConnectors != null)
				return false;
		} else if (!interfacesConnectors.equals(other.interfacesConnectors))
			return false;
		if (memory == null) {
			if (other.memory != null)
				return false;
		} else if (!memory.equals(other.memory))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (operatingSystem == null) {
			if (other.operatingSystem != null)
				return false;
		} else if (!operatingSystem.equals(other.operatingSystem))
			return false;
		if (price != other.price)
			return false;
		if (processor == null) {
			if (other.processor != null)
				return false;
		} else if (!processor.equals(other.processor))
			return false;
		if (screen == null) {
			if (other.screen != null)
				return false;
		} else if (!screen.equals(other.screen))
			return false;
		if (users == null) {
			if (other.users != null)
				return false;
		} else if (!users.equals(other.users))
			return false;
		return true;
	}
	
	
	
}