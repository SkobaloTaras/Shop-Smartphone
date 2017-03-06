package ua.com.shop.serviceImpl;


import java.util.List;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.shop.dao.CorpsDao;
import ua.com.shop.dto.form.CorpsForm;
import ua.com.shop.entity.Corps;
import ua.com.shop.entity.CountryProducing;
import ua.com.shop.entity.MeasuringSystem;
import ua.com.shop.entity.Producer;
import ua.com.shop.service.CorpsService;

@Service
public class CorpsServiceImpl implements CorpsService {

	@Autowired
	private CorpsDao corpsDao;

	public List<Corps> findAll() {
		return corpsDao.findAll();
	}

	public Corps findOne(int id) {
		return corpsDao.findOne(id);
	}

	public void delete(int id) {
		corpsDao.delete(id);
	}

	public CorpsForm findForm(int id) {
		CorpsForm form = new CorpsForm();
		Corps entity = corpsDao.findOne(id);
		form.setId(entity.getId());
		form.setOptions(String.valueOf(entity.getOptions()));
		form.setCaseMaterial(String.valueOf(entity.getCaseMaterial()));
		form.setHeight(String.valueOf(entity.getHeight()));
		form.setWidth(String.valueOf(entity.getWidth()));
		form.setDepth(String.valueOf(entity.getDepth()));
		form.setWeight(String.valueOf(entity.getWeight()));
		form.setWarranty(String.valueOf(entity.getWarranty()));
		form.setTouchId(String.valueOf(entity.getTouchId()));
		return form;
	}

	public Corps findUnique(String options, String caseMaterial,
			String height, String width, String depth, String weight,
			String warranty, String touchId, MeasuringSystem measuringSystem,
			MeasuringSystem measuringSystem2, MeasuringSystem measuringSystem3,
			MeasuringSystem measuringSystem4, MeasuringSystem measuringSystem5, 
			CountryProducing countryProducing, Producer producer) {
		return corpsDao.findUnique(String.valueOf(options), String.valueOf(caseMaterial), Double.valueOf(height), Double.valueOf(width), Double.valueOf(depth), Double.valueOf(weight), Double.valueOf(warranty), String.valueOf(touchId), measuringSystem.getId(),  measuringSystem2.getId(),  measuringSystem3.getId(), measuringSystem4.getId(),  measuringSystem5.getId(), countryProducing.getId(), producer.getId());
	}

	public void save(CorpsForm form) {
		Corps entity = new Corps();
		entity.setId(form.getId());
		entity.setOptions(String.valueOf(form.getOptions()));
		entity.setCaseMaterial(String.valueOf(form.getCaseMaterial()));
		entity.setHeight(Double.valueOf(form.getHeight()));
		entity.setWidth(Double.valueOf(form.getWidth()));
		entity.setDepth(Double.valueOf(form.getDepth()));
		entity.setWeight(Double.valueOf(form.getWeight()));
		entity.setWarranty(Double.valueOf(form.getWarranty()));
		entity.setTouchId(String.valueOf(form.getTouchId()));
		entity.setMeasuringSystem(form.getMeasuringSystem());
		entity.setMeasuringSystem2(form.getMeasuringSystem2());
		entity.setMeasuringSystem3(form.getMeasuringSystem3());
		entity.setMeasuringSystem4(form.getMeasuringSystem4());
		entity.setMeasuringSystem5(form.getMeasuringSystem5());
		entity.setCountryProducing(form.getCountryProducing());
		entity.setProducer(form.getProducer());
		corpsDao.save(entity);
	}

	
	
	
	
	
	
	
	
	
	
	
}
