package ua.com.shop.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "connectivity")
public class Connectivity  {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	private String communicationStandards;
	private int numberOfSIM;
	private String sizeOfSIM;
	


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCommunicationStandards() {
		return communicationStandards;
	}

	public void setCommunicationStandards(String communicationStandards) {
		this.communicationStandards = communicationStandards;
	}

	public int getNumberOfSIM() {
		return numberOfSIM;
	}

	public void setNumberOfSIM(int numberOfSIM) {
		this.numberOfSIM = numberOfSIM;
	}

	public String getSizeOfSIM() {
		return sizeOfSIM;
	}

	public void setSizeOfSIM(String sizeOfSIM) {
		this.sizeOfSIM = sizeOfSIM;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((communicationStandards == null) ? 0
						: communicationStandards.hashCode());
		result = prime * result + id;
		result = prime * result + numberOfSIM;
		result = prime * result
				+ ((sizeOfSIM == null) ? 0 : sizeOfSIM.hashCode());
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
		Connectivity other = (Connectivity) obj;
		if (communicationStandards == null) {
			if (other.communicationStandards != null)
				return false;
		} else if (!communicationStandards.equals(other.communicationStandards))
			return false;
		if (id != other.id)
			return false;
		if (numberOfSIM != other.numberOfSIM)
			return false;
		if (sizeOfSIM == null) {
			if (other.sizeOfSIM != null)
				return false;
		} else if (!sizeOfSIM.equals(other.sizeOfSIM))
			return false;
		return true;
	}

	
}
