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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((batteries == null) ? 0 : batteries.hashCode());
		result = prime * result
				+ ((batteries2 == null) ? 0 : batteries2.hashCode());
		result = prime * result
				+ ((batteries3 == null) ? 0 : batteries3.hashCode());
		result = prime * result + ((cameras == null) ? 0 : cameras.hashCode());
		result = prime * result
				+ ((cameras2 == null) ? 0 : cameras2.hashCode());
		result = prime * result
				+ ((cameras3 == null) ? 0 : cameras3.hashCode());
		result = prime * result + ((corps == null) ? 0 : corps.hashCode());
		result = prime * result + ((corps2 == null) ? 0 : corps2.hashCode());
		result = prime * result + ((corps3 == null) ? 0 : corps3.hashCode());
		result = prime * result + ((corps4 == null) ? 0 : corps4.hashCode());
		result = prime * result + ((corps5 == null) ? 0 : corps5.hashCode());
		result = prime * result + id;
		result = prime * result
				+ ((memories == null) ? 0 : memories.hashCode());
		result = prime * result
				+ ((memories2 == null) ? 0 : memories2.hashCode());
		result = prime * result
				+ ((memories3 == null) ? 0 : memories3.hashCode());
		result = prime * result
				+ ((processors == null) ? 0 : processors.hashCode());
		result = prime * result
				+ ((processors2 == null) ? 0 : processors2.hashCode());
		result = prime * result + ((screens == null) ? 0 : screens.hashCode());
		result = prime * result
				+ ((screens2 == null) ? 0 : screens2.hashCode());
		result = prime
				* result
				+ ((unitsOfMeasurement == null) ? 0 : unitsOfMeasurement
						.hashCode());
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
		MeasuringSystem other = (MeasuringSystem) obj;
		if (batteries == null) {
			if (other.batteries != null)
				return false;
		} else if (!batteries.equals(other.batteries))
			return false;
		if (batteries2 == null) {
			if (other.batteries2 != null)
				return false;
		} else if (!batteries2.equals(other.batteries2))
			return false;
		if (batteries3 == null) {
			if (other.batteries3 != null)
				return false;
		} else if (!batteries3.equals(other.batteries3))
			return false;
		if (cameras == null) {
			if (other.cameras != null)
				return false;
		} else if (!cameras.equals(other.cameras))
			return false;
		if (cameras2 == null) {
			if (other.cameras2 != null)
				return false;
		} else if (!cameras2.equals(other.cameras2))
			return false;
		if (cameras3 == null) {
			if (other.cameras3 != null)
				return false;
		} else if (!cameras3.equals(other.cameras3))
			return false;
		if (corps == null) {
			if (other.corps != null)
				return false;
		} else if (!corps.equals(other.corps))
			return false;
		if (corps2 == null) {
			if (other.corps2 != null)
				return false;
		} else if (!corps2.equals(other.corps2))
			return false;
		if (corps3 == null) {
			if (other.corps3 != null)
				return false;
		} else if (!corps3.equals(other.corps3))
			return false;
		if (corps4 == null) {
			if (other.corps4 != null)
				return false;
		} else if (!corps4.equals(other.corps4))
			return false;
		if (corps5 == null) {
			if (other.corps5 != null)
				return false;
		} else if (!corps5.equals(other.corps5))
			return false;
		if (id != other.id)
			return false;
		if (memories == null) {
			if (other.memories != null)
				return false;
		} else if (!memories.equals(other.memories))
			return false;
		if (memories2 == null) {
			if (other.memories2 != null)
				return false;
		} else if (!memories2.equals(other.memories2))
			return false;
		if (memories3 == null) {
			if (other.memories3 != null)
				return false;
		} else if (!memories3.equals(other.memories3))
			return false;
		if (processors == null) {
			if (other.processors != null)
				return false;
		} else if (!processors.equals(other.processors))
			return false;
		if (processors2 == null) {
			if (other.processors2 != null)
				return false;
		} else if (!processors2.equals(other.processors2))
			return false;
		if (screens == null) {
			if (other.screens != null)
				return false;
		} else if (!screens.equals(other.screens))
			return false;
		if (screens2 == null) {
			if (other.screens2 != null)
				return false;
		} else if (!screens2.equals(other.screens2))
			return false;
		if (unitsOfMeasurement == null) {
			if (other.unitsOfMeasurement != null)
				return false;
		} else if (!unitsOfMeasurement.equals(other.unitsOfMeasurement))
			return false;
		return true;
	}
	
	
}
