package ua.com.shop.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.shop.dao.ScreenDao;
import ua.com.shop.entity.Screen;
import ua.com.shop.service.ScreenService;
@Service
public class ScreenServiceImpl implements ScreenService{

	@Autowired
	private ScreenDao screenDao;
	
	public void save(Screen screen) {
		screenDao.save(screen);
	}

	public List<Screen> findAll() {
		return screenDao.findAll();
	}

	public Screen findOne(int id) {
		return screenDao.findOne(id);
	}

	public void delete(int id) {
		screenDao.delete(id);
	}

}
