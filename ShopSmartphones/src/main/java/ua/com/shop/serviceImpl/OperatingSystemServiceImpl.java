package ua.com.shop.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import ua.com.shop.dao.OperatingSystemDao;
import ua.com.shop.dto.filter.SimpleFilter;
import ua.com.shop.entity.OperatingSystem;
import ua.com.shop.service.OperatingSystemService;
import ua.com.shop.specification.OperatingSystemSpecification;
@Service
public class OperatingSystemServiceImpl implements OperatingSystemService{

	@Autowired
	private OperatingSystemDao operatingSystemDao;
	
	public void save(OperatingSystem operatingSystem) {
		operatingSystemDao.save(operatingSystem);
	}

	public List<OperatingSystem> findAll() {
		return operatingSystemDao.findAll();
	}

	public OperatingSystem findOne(int id) {
		return operatingSystemDao.findOne(id);
	}

	public void delete(int id) {
		operatingSystemDao.delete(id);
	}

	public void save(String nameOfOperationSystem) {
		OperatingSystem operatingSystem = new OperatingSystem();
		operatingSystem.setNameOfOperationSystem(nameOfOperationSystem);
		operatingSystemDao.save(operatingSystem);
	}

	public OperatingSystem findByNameOfOperationSystem(
			String nameOfOperationSystem) {
		return operatingSystemDao.findByNameOfOperationSystem(nameOfOperationSystem);
	}

	@Override
	public Page<OperatingSystem> findAll(Pageable pageable, SimpleFilter filter) {
		return operatingSystemDao.findAll(new OperatingSystemSpecification(filter), pageable);
	}

}
