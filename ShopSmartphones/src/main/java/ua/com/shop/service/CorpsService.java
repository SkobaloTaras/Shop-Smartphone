package ua.com.shop.service;

import java.util.List;

import ua.com.shop.dto.form.CorpsForm;
import ua.com.shop.entity.Corps;
import ua.com.shop.entity.CountryProducing;
import ua.com.shop.entity.MeasuringSystem;
import ua.com.shop.entity.Producer;

public interface CorpsService {

	List<Corps> findAll ();
	Corps findOne (int id);
	void delete(int id);
	CorpsForm findForm(int id);
	Corps findUnique(String options, String caseMaterial, String height,
			String width, String depth, String weight, String warranty,
			String touchId, MeasuringSystem measuringSystem,
			MeasuringSystem measuringSystem2, MeasuringSystem measuringSystem3,
			MeasuringSystem measuringSystem4, MeasuringSystem measuringSystem5,
			CountryProducing countryProducing, Producer producer);
	void save(CorpsForm corpsForm);
	
}
