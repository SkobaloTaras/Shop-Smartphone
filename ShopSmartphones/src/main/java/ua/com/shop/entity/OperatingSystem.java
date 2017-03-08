package ua.com.shop.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="operating_system")
public class OperatingSystem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	private String nameOfOperationSystem;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameOfOperationSystem() {
		return nameOfOperationSystem;
	}
	public void setNameOfOperationSystem(String nameOfOperationSystem) {
		this.nameOfOperationSystem = nameOfOperationSystem;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime
				* result
				+ ((nameOfOperationSystem == null) ? 0 : nameOfOperationSystem
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
		OperatingSystem other = (OperatingSystem) obj;
		if (id != other.id)
			return false;
		if (nameOfOperationSystem == null) {
			if (other.nameOfOperationSystem != null)
				return false;
		} else if (!nameOfOperationSystem.equals(other.nameOfOperationSystem))
			return false;
		return true;
	}
	
	
}
