package ua.com.shop.dao;




import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ua.com.shop.entity.Smartphone;

public interface SmartphoneDao extends JpaRepository<Smartphone, Integer> {

	@Query("SELECT s FROM Smartphone s LEFT JOIN FETCH s.connectivity JOIN FETCH s.operatingSystem JOIN FETCH s.screen JOIN FETCH s.processor JOIN FETCH s.memory JOIN FETCH s.camera JOIN FETCH s.interfacesConnectors JOIN FETCH s.battery JOIN FETCH s.corps")
	List<Smartphone> findAll();
	
	@Query("SELECT s FROM Smartphone s LEFT JOIN FETCH s.connectivity JOIN FETCH s.operatingSystem JOIN FETCH s.screen JOIN FETCH s.processor JOIN FETCH s.memory JOIN FETCH s.camera JOIN FETCH s.interfacesConnectors JOIN FETCH s.battery JOIN FETCH s.corps WHERE s.id=?1")
	Smartphone findOne (Integer id);

	
	@Query("SELECT s FROM Smartphone s WHERE s.model=?1 and s.price=?2 and s.connectivity.id=?3 and s.operatingSystem.id=?4 and s.screen.id=?5 and s.processor.id=?6 and s.memory.id=?7 and s.camera.id=?8 and s.interfacesConnectors.id=?9 and s.battery.id=?10 and s.corps.id=?11")
		Smartphone findUnique(String model, String price, int connectivityId, int operatingSystemId,
				int screenId, int processorId, int memoryId, int cameraId, int interfacesConnectorsId, int batteryId, int corpsId);



}
