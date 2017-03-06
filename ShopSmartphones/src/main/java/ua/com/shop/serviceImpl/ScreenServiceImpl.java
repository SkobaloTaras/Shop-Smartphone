package ua.com.shop.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.shop.dao.ScreenDao;
import ua.com.shop.dto.form.ScreenForm;
import ua.com.shop.entity.MeasuringSystem;
import ua.com.shop.entity.Screen;
import ua.com.shop.service.ScreenService;
@Service
public class ScreenServiceImpl implements ScreenService{

	@Autowired
	private ScreenDao screenDao;
	
	public List<Screen> findAll() {
		return screenDao.findAll();
	}

	public Screen findOne(int id) {
		return screenDao.findOne(id);
	}

	public void delete(int id) {
		screenDao.delete(id);
	}

	public ScreenForm findForm(int id) {
		ScreenForm form = new ScreenForm();
		Screen entity = screenDao.findOne(id);
		form.setId(entity.getId());
		form.setDiagonalDisplay(String.valueOf(entity.getDiagonalDisplay()));
		form.setScreenResolution(String.valueOf(entity.getScreenResolution()));
		form.setScreenType(String.valueOf(entity.getScreenType()));
		form.setDisplayNumberOfColors(String.valueOf(entity.getDisplayNumberOfColors()));
		form.setProtectiveGlass(String.valueOf(entity.getProtectiveGlass()));
		return form;
	}

	public ScreenForm findUnique(String diagonalDisplay,
			String screenResolution, String screenType,
			String displayNumberOfColors, String protectiveGlass,
			MeasuringSystem measuringSystem, MeasuringSystem measuringSystem2) {
		return screenDao.findUnique(Double.valueOf(diagonalDisplay), Integer.valueOf(screenResolution), String.valueOf(screenType), Double.valueOf(displayNumberOfColors), String.valueOf(protectiveGlass), measuringSystem.getId(),  measuringSystem2.getId());
	}

	public void save(ScreenForm form) {
		Screen entity = new Screen();
		entity.setId(form.getId());
		entity.setDiagonalDisplay(Double.valueOf(form.getDiagonalDisplay()));
		entity.setScreenResolution(Integer.valueOf(form.getScreenResolution()));
		entity.setScreenType(String.valueOf(form.getScreenType()));
		entity.setDisplayNumberOfColors(Double.valueOf(form.getDisplayNumberOfColors()));
		entity.setProtectiveGlass(String.valueOf(form.getProtectiveGlass()));
		entity.setMeasuringSystem(form.getMeasuringSystem());
		entity.setMeasuringSystem2(form.getMeasuringSystem2());
		screenDao.save(entity);
	}

}
