package ua.com.shop.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.shop.dao.ConnectivityDao;
import ua.com.shop.entity.Connectivity;
import ua.com.shop.service.ConnectivityService;
@Service
public class ConnectivityServiceImpl implements ConnectivityService{

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

}
