package ua.com.shop.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import ua.com.shop.dto.filter.SimpleFilter;
import ua.com.shop.entity.Color;

public interface ColorService {

	void save(Color color);
	List<Color> findAll();
	Color findOne(int id);
	void delete(int id);
	void save(String nameOfColor);
	Color findByNameOfColor(String nameOfColor);
	Page<Color> findAll(Pageable pageable, SimpleFilter filter);
}
