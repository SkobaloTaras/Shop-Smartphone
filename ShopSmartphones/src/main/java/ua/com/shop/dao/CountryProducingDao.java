package ua.com.shop.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import ua.com.shop.entity.CountryProducing;



public interface CountryProducingDao extends JpaRepository<CountryProducing, Integer>, JpaSpecificationExecutor<CountryProducing>{

	CountryProducing findByNameOfCountry(String nameOfCountry);

}
