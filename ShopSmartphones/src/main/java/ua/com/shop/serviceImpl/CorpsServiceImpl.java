package ua.com.shop.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.shop.dao.CorpsDao;
import ua.com.shop.entity.Corps;
import ua.com.shop.service.CorpsService;
@Service
public class CorpsServiceImpl implements CorpsService{

	@Autowired
	private CorpsDao corpsDao;
	
	public void save(Corps corps) {
		corpsDao.save(corps);
	}

	public List<Corps> findAll() {
		return corpsDao.findAll();
	}

	public Corps findOne(int id) {
		return corpsDao.findOne(id);
	}

	public void delete(int id) {
		corpsDao.delete(id);
	}

}
