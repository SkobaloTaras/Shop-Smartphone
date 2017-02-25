package ua.com.shop.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="measuring_system")
public class MeasuringSystem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	public int id;
	@Column(name=" _name")
	public String unitsOfMeasurement;
	
	@OneToMany(mappedBy="measuringSystem")
	private List<Battery> batteries = new ArrayList<Battery>();
	
	@OneToMany(mappedBy="measuringSystem2")
	private List<Battery> batteries2 = new ArrayList<Battery>();
	

	@OneToMany(mappedBy="measuringSystem3")
	private List<Battery> batteries3 = new ArrayList<Battery>();
	
	@OneToMany(mappedBy="measuringSystem")
	private List<Camera> cameras = new ArrayList<Camera>();
	
	@OneToMany(mappedBy="measuringSystem2")
	private List<Camera> cameras2 = new ArrayList<Camera>();
	
	@OneToMany(mappedBy="measuringSystem3")
	private List<Camera> cameras3 = new ArrayList<Camera>();
	
	@OneToMany(mappedBy="measuringSystem")
	private List<Connectivity> connectivities = new ArrayList<Connectivity>();
	
	@OneToMany(mappedBy="measuringSystem")
	private List<Corps> corps = new ArrayList<Corps>();
	
	@OneToMany(mappedBy="measuringSystem2")
	private List<Corps> corps2 = new ArrayList<Corps>();
	
	@OneToMany(mappedBy="measuringSystem3")
	private List<Corps> corps3 = new ArrayList<Corps>();
	
	@OneToMany(mappedBy="measuringSystem4")
	private List<Corps> corps4 = new ArrayList<Corps>();
	
	@OneToMany(mappedBy="measuringSystem5")
	private List<Corps> corps5 = new ArrayList<Corps>();
	
	@OneToMany(mappedBy="measuringSystem")
	private List<Memory> memories = new ArrayList<Memory>();
	
	@OneToMany(mappedBy="measuringSystem2")
	private List<Memory> memories2 = new ArrayList<Memory>();
	
	@OneToMany(mappedBy="measuringSystem3")
	private List<Memory> memories3 = new ArrayList<Memory>();
	
	@OneToMany(mappedBy="measuringSystem")
	private List<Processor> processors = new ArrayList<Processor>();
	
	@OneToMany(mappedBy="measuringSystem2")
	private List<Processor> processors2 = new ArrayList<Processor>();
	
	@OneToMany(mappedBy="measuringSystem")
	private List<Screen> screens = new ArrayList<Screen>();
	
	@OneToMany(mappedBy="measuringSystem2")
	private List<Screen> screens2 = new ArrayList<Screen>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUnitsOfMeasurement() {
		return unitsOfMeasurement;
	}

	public void setUnitsOfMeasurement(String unitsOfMeasurement) {
		this.unitsOfMeasurement = unitsOfMeasurement;
	}

	public List<Battery> getBatteries() {
		return batteries;
	}

	public void setBatteries(List<Battery> batteries) {
		this.batteries = batteries;
	}

	public List<Battery> getBatteries2() {
		return batteries2;
	}

	public void setBatteries2(List<Battery> batteries2) {
		this.batteries2 = batteries2;
	}
	public List<Battery> getBatteries3() {
		return batteries3;
	}
	
	public void setBatteries3(List<Battery> batteries3) {
		this.batteries3 = batteries3;
	}

	public List<Camera> getCameras() {
		return cameras;
	}

	public void setCameras(List<Camera> cameras) {
		this.cameras = cameras;
	}

	public List<Camera> getCameras2() {
		return cameras2;
	}

	public void setCameras2(List<Camera> cameras2) {
		this.cameras2 = cameras2;
	}

	public List<Camera> getCameras3() {
		return cameras3;
	}

	public void setCameras3(List<Camera> cameras3) {
		this.cameras3 = cameras3;
	}

	public List<Connectivity> getConnectivities() {
		return connectivities;
	}

	public void setConnectivities(List<Connectivity> connectivities) {
		this.connectivities = connectivities;
	}


	public List<Corps> getCorps() {
		return corps;
	}

	public void setCorps(List<Corps> corps) {
		this.corps = corps;
	}

	public List<Corps> getCorps2() {
		return corps2;
	}

	public void setCorps2(List<Corps> corps2) {
		this.corps2 = corps2;
	}

	public List<Corps> getCorps3() {
		return corps3;
	}

	public void setCorps3(List<Corps> corps3) {
		this.corps3 = corps3;
	}

	public List<Corps> getCorps4() {
		return corps4;
	}

	public void setCorps4(List<Corps> corps4) {
		this.corps4 = corps4;
	}

	public List<Corps> getCorps5() {
		return corps5;
	}

	public void setCorps5(List<Corps> corps5) {
		this.corps5 = corps5;
	}

	public List<Memory> getMemories2() {
		return memories2;
	}

	public void setMemories2(List<Memory> memories2) {
		this.memories2 = memories2;
	}

	public List<Memory> getMemories3() {
		return memories3;
	}

	public void setMemories3(List<Memory> memories3) {
		this.memories3 = memories3;
	}

	public List<Memory> getMemories() {
		return memories;
	}

	public void setMemories(List<Memory> memories) {
		this.memories = memories;
	}

	public List<Processor> getProcessors() {
		return processors;
	}

	public void setProcessors(List<Processor> processors) {
		this.processors = processors;
	}

	public List<Processor> getProcessors2() {
		return processors2;
	}

	public void setProcessors2(List<Processor> processors2) {
		this.processors2 = processors2;
	}

	public List<Screen> getScreens() {
		return screens;
	}

	public void setScreens(List<Screen> screens) {
		this.screens = screens;
	}

	public List<Screen> getScreens2() {
		return screens2;
	}

	public void setScreens2(List<Screen> screens2) {
		this.screens2 = screens2;
	}
	
	
}
