package ua.com.shop.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.shop.dao.ProcessorDao;
import ua.com.shop.entity.Processor;
import ua.com.shop.service.ProcessorService;
@Service
public class ProcessorServiceImpl implements ProcessorService{

	@Autowired
	private ProcessorDao processorDao;
	
	public void save(Processor processor) {
		processorDao.save(processor);
	}

	public List<Processor> findAll() {
		return processorDao.findAll();
	}

	public Processor findOne(int id) {
		return processorDao.findOne(id);
	}

	public void delete(int id) {
		processorDao.delete(id);
	}

}
