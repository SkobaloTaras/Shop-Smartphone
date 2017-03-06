package ua.com.shop.dto.form;

public class ConnectivityForm {

	private int id;
	private String communicationStandards;
	private String numberOfSIM;
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
	public String getNumberOfSIM() {
		return numberOfSIM;
	}
	public void setNumberOfSIM(String numberOfSIM) {
		this.numberOfSIM = numberOfSIM;
	}
	public String getSizeOfSIM() {
		return sizeOfSIM;
	}
	public void setSizeOfSIM(String sizeOfSIM) {
		this.sizeOfSIM = sizeOfSIM;
	}
	
	
}
