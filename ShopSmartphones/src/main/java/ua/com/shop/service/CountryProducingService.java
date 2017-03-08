package ua.com.shop.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import ua.com.shop.dto.filter.SimpleFilter;
import ua.com.shop.entity.CountryProducing;

public interface CountryProducingService {

	void save(CountryProducing countryProducing);
	List<CountryProducing> findAll();
	CountryProducing findOne (int id);
	void delete(int id);
	void save(String nameOfCountry);
	CountryProducing findByNameOfCountry(String nameOfCountry);
	Page<CountryProducing> findAll(Pageable pageable, SimpleFilter filter);
}
