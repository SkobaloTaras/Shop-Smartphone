package ua.com.shop.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.shop.dao.ConnectivityDao;
import ua.com.shop.dto.form.ConnectivityForm;
import ua.com.shop.entity.Connectivity;
import ua.com.shop.service.ConnectivityService;

@Service
public class ConnectivityServiceImpl implements ConnectivityService {

	@Autowired
	private ConnectivityDao connectivityDao;

	public void save(Connectivity connectivity) {
		connectivityDao.save(connectivity);
	}

	public List<Connectivity> findAll() {
		return connectivityDao.findAll();
	}

	public Connectivity findOne(int id) {
		return connectivityDao.findOne(id);
	}

	public void delete(int id) {
		connectivityDao.delete(id);
	}

	public ConnectivityForm findForm(int id) {
		ConnectivityForm form = new ConnectivityForm();
		Connectivity entity = connectivityDao.findOne(id);
		form.setId(entity.getId());
		form.setCommunicationStandards(String.valueOf(entity.getCommunicationStandards()));
		form.setNumberOfSIM(String.valueOf(entity.getNumberOfSIM()));
		form.setSizeOfSIM(String.valueOf(entity.getSizeOfSIM()));
		return form;
	}

	public Connectivity findUnique(String communicationStandards,
			String numberOfSIM, String sizeOfSIM) {
		return connectivityDao.findUnique(String.valueOf(communicationStandards), Integer.valueOf(numberOfSIM), String.valueOf(sizeOfSIM))	;
	}

	public void save(ConnectivityForm form) {
		Connectivity entity = new Connectivity();
		entity.setId(form.getId());
		entity.setCommunicationStandards(String.valueOf(form.getCommunicationStandards()));
		entity.setNumberOfSIM(Integer.valueOf(form.getNumberOfSIM()));
		entity.setSizeOfSIM(String.valueOf(form.getSizeOfSIM()));
		connectivityDao.save(entity);
	}

}
