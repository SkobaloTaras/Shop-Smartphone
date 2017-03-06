package ua.com.shop.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="color")
public class Color {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	private String nameOfColor;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameOfColor() {
		return nameOfColor;
	}

	public void setNameOfColor(String nameOfColor) {
		this.nameOfColor = nameOfColor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result
				+ ((nameOfColor == null) ? 0 : nameOfColor.hashCode());
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
		Color other = (Color) obj;
		if (id != other.id)
			return false;
		if (nameOfColor == null) {
			if (other.nameOfColor != null)
				return false;
		} else if (!nameOfColor.equals(other.nameOfColor))
			return false;
		return true;
	}

	

}
