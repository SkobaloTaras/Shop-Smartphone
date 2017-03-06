package ua.com.shop.service;

import java.util.List;

import ua.com.shop.entity.CountryProducing;

public interface CountryProducingService {

	void save(CountryProducing countryProducing);
	List<CountryProducing> findAll();
	CountryProducing findOne (int id);
	void delete(int id);
	void save(String nameOfCountry);
	CountryProducing findByNameOfCountry(String nameOfCountry);
}
