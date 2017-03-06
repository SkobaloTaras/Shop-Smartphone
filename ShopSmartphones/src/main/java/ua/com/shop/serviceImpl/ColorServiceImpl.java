package ua.com.shop.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import ua.com.shop.dao.ColorDao;
import ua.com.shop.dto.filter.SimpleFilter;
import ua.com.shop.entity.Color;
import ua.com.shop.service.ColorService;
import ua.com.shop.specification.ColorSpecification;
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

	public Color findByNameOfColor(String nameOfColor) {
		return colorDao.findByNameOfColor(nameOfColor);
	}

	public Page<Color> findAll(Pageable pageable, SimpleFilter filter) {
		return colorDao.findAll(new ColorSpecification(filter), pageable);
	}
	

	
}
