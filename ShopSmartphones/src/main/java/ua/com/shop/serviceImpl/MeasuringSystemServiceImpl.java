package ua.com.shop.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import ua.com.shop.dao.MeasuringSystemDao;
import ua.com.shop.dto.filter.SimpleFilter;
import ua.com.shop.entity.MeasuringSystem;
import ua.com.shop.service.MeasuringSystemService;
import ua.com.shop.specification.MeasuringSystemSpecisication;
@Service
public class MeasuringSystemServiceImpl implements MeasuringSystemService{

	@Autowired
	private MeasuringSystemDao measuringSystemDao;
	
	public void save(MeasuringSystem measuringSystem) {
		measuringSystemDao.save(measuringSystem);
	}

	public List<MeasuringSystem> findAll() {
		return measuringSystemDao.findAll();
	}

	public MeasuringSystem findOne(int id) {
		return measuringSystemDao.findOne(id);
	}

	public void delete(int id) {
		measuringSystemDao.delete(id);
	}

	public void save(String unitsOfMeasurement) {
		MeasuringSystem measuringSystem = new MeasuringSystem();
		measuringSystem.setUnitsOfMeasurement(unitsOfMeasurement);
		measuringSystemDao.save(measuringSystem);
	}

	public MeasuringSystem findByUnitsOfMeasurement(String unitsOfMeasurement) {
		return measuringSystemDao.findByUnitsOfMeasurement(unitsOfMeasurement);
	}

	@Override
	public Page<MeasuringSystem> findAll(Pageable pageable, SimpleFilter filter) {
		return measuringSystemDao.findAll(new MeasuringSystemSpecisication(filter), pageable);
	}

}
