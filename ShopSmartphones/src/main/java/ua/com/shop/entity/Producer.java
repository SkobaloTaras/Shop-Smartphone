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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result
				+ ((nameOfBrand == null) ? 0 : nameOfBrand.hashCode());
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
		Producer other = (Producer) obj;
		if (id != other.id)
			return false;
		if (nameOfBrand == null) {
			if (other.nameOfBrand != null)
				return false;
		} else if (!nameOfBrand.equals(other.nameOfBrand))
			return false;
		return true;
	}
	
	
}
