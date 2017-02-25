package ua.com.shop.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.shop.dao.MemoryDao;
import ua.com.shop.entity.Memory;
import ua.com.shop.service.MemoryService;
@Service
public class MemoryServiceImpl implements MemoryService{

	@Autowired
	private MemoryDao memoryDao;
	
	public void save(Memory memory) {
		memoryDao.save(memory);
	}

	public List<Memory> findAll() {
		return memoryDao.findAll();
	}

	public Memory findOne(int id) {
		return memoryDao.findOne(id);
	}

	public void delete(int id) {
		memoryDao.delete(id);
	}

	
}
