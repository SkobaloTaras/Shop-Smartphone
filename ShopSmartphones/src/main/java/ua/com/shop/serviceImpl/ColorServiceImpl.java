package ua.com.shop.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.shop.dao.ColorDao;
import ua.com.shop.entity.Color;
import ua.com.shop.service.ColorService;
@Service
public class ColorServiceImpl implements ColorService{

	@Autowired
	private ColorDao colorDao;
	
	public void save(Color color) {
		colorDao.save(color);
	}

	public List<Color> findAll() {
		return colorDao.findAll();
	}

	public Color findOne(int id) {
		return colorDao.findOne(id);
	}

	public void delete(int id) {
		colorDao.delete(id);
	}

	public void save(String nameOfColor) {
		Color color = new Color();
		color.setNameOfColor(nameOfColor);
		colorDao.save(color);
		
	}
	

	
}
