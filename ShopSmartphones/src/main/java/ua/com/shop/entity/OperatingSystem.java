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
	
}
