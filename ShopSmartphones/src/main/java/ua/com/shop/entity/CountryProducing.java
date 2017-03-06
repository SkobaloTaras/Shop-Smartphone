package ua.com.shop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="countryProducing")
public class CountryProducing {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	@Column(name="country")
	private String nameOfCountry;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameOfCountry() {
		return nameOfCountry;
	}
	public void setNameOfCountry(String nameOfCountry) {
		this.nameOfCountry = nameOfCountry;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result
				+ ((nameOfCountry == null) ? 0 : nameOfCountry.hashCode());
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
		CountryProducing other = (CountryProducing) obj;
		if (id != other.id)
			return false;
		if (nameOfCountry == null) {
			if (other.nameOfCountry != null)
				return false;
		} else if (!nameOfCountry.equals(other.nameOfCountry))
			return false;
		return true;
	}

	
}
