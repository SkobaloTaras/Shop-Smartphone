package ua.com.shop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="producer")
public class Producer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	@Column(name="brand")
	private String nameOfBrand;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public String getNameOfBrand() {
		return nameOfBrand;
	}

	public void setNameOfBrand(String nameOfBrand) {
		this.nameOfBrand = nameOfBrand;
	}
	
}
