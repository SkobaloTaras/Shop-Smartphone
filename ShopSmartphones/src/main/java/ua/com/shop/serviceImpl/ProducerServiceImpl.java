package ua.com.shop.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.shop.dao.ProducerDao;
import ua.com.shop.entity.Producer;
import ua.com.shop.service.ProducerService;
@Service
public class ProducerServiceImpl implements ProducerService{

	@Autowired
	private ProducerDao producerDao;
	
	public void save(Producer producer) {
		producerDao.save(producer);
	}

	public List<Producer> findAll() {
		return producerDao.findAll();
	}

	public Producer findOne(int id) {
		return producerDao.findOne(id);
	}

	public void delete(int id) {
		producerDao.delete(id);
	}

	public void save(String nameOfBrand) {
		Producer producer = new Producer();
		producer.setNameOfBrand(nameOfBrand);
		producerDao.save(producer);
	}
	
	
}

