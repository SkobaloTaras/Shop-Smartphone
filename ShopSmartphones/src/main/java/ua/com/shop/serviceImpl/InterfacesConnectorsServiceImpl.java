package ua.com.shop.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.shop.dao.InterfacesConnectorsDao;
import ua.com.shop.entity.InterfacesConnectors;
import ua.com.shop.service.InterfacesConnectorsService;

@Service
public class InterfacesConnectorsServiceImpl implements
		InterfacesConnectorsService {

	@Autowired
	private InterfacesConnectorsDao interfacesConnectorsDao;

	public void save(InterfacesConnectors interfacesConnectors) {
		interfacesConnectorsDao.save(interfacesConnectors);
	}

	public List<InterfacesConnectors> findAll() {
		return interfacesConnectorsDao.findAll();
	}

	public InterfacesConnectors findOne(int id) {
		return interfacesConnectorsDao.findOne(id);
	}

	public void delete(int id) {
		interfacesConnectorsDao.delete(id);
	}

}
