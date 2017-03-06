package ua.com.shop.service;

import java.util.List;

import ua.com.shop.dto.form.InterfacesConnectorsForm;
import ua.com.shop.entity.InterfacesConnectors;

public interface InterfacesConnectorsService {


	List<InterfacesConnectors> findAll();

	InterfacesConnectors findOne(int id);

	void delete(int id);

	InterfacesConnectorsForm findForm(int id);

	InterfacesConnectors findUnique(String wifi, String bluetooth, String navigationSystem,
			String fmTuner, String nfc, String usbInterface, String jack);
	
	void save(InterfacesConnectorsForm interfacesConnectorsForm);
}
