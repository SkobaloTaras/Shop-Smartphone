package ua.com.shop.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.shop.dao.CountryProducingDao;
import ua.com.shop.entity.CountryProducing;
import ua.com.shop.service.CountryProducingService;
@Service
public class CountryProducingServiceImpl implements CountryProducingService{

	@Autowired
	private CountryProducingDao countryProducingDao;
	
	public void save(CountryProducing countryProducing) {
		countryProducingDao.save(countryProducing);
	}

	public List<CountryProducing> findAll() {
		return countryProducingDao.findAll();
	}

	public CountryProducing findOne(int id) {
		return countryProducingDao.findOne(id);
	}

	public void delete(int id) {
		countryProducingDao.delete(id);
	}

	public void save(String nameOfCountry) {
		CountryProducing countryProducing = new CountryProducing();
		countryProducing.setNameOfCountry(nameOfCountry);
		countryProducingDao.save(countryProducing);
	}

	

}
