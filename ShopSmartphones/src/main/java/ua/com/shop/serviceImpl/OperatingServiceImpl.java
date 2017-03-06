package ua.com.shop.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.shop.dao.OperatingSystemDao;
import ua.com.shop.entity.OperatingSystem;
import ua.com.shop.service.OperatingSystemService;
@Service
public class OperatingServiceImpl implements OperatingSystemService{

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

}
