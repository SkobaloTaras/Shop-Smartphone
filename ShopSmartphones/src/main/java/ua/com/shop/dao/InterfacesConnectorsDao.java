package ua.com.shop.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ua.com.shop.entity.InterfacesConnectors;

public interface InterfacesConnectorsDao extends
		JpaRepository<InterfacesConnectors, Integer> {

	
	@Query("SELECT i FROM InterfacesConnectors i WHERE i.wifi=?1 and i.bluetooth=?2 and i.navigationSystem=?3 and i.fmTuner=?4 and i.nfc=?5 and i.usbInterface=?6 and i.jack=?7") 
	InterfacesConnectors findUnique(Double wifi, Double bluetooth,
			String navigationSystem, String fmTuner, String nfc, String usbInterface,
			String jack);

}
