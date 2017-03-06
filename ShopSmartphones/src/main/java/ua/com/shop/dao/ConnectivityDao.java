package ua.com.shop.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ua.com.shop.entity.Connectivity;

public interface ConnectivityDao extends JpaRepository<Connectivity, Integer>{

	@Query("SELECT c FROM Connectivity c WHERE c.communicationStandards=?1 and c.numberOfSIM=?2 and c.sizeOfSIM=?3")
	Connectivity findUnique(String communicationStandards, Integer numberOfSIM, String sizeOfSIM);


}
