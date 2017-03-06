package ua.com.shop.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.shop.dao.InterfacesConnectorsDao;
import ua.com.shop.dto.form.InterfacesConnectorsForm;
import ua.com.shop.entity.InterfacesConnectors;
import ua.com.shop.service.InterfacesConnectorsService;

@Service
public class InterfacesConnectorsServiceImpl implements
		InterfacesConnectorsService {

	@Autowired
	private InterfacesConnectorsDao interfacesConnectorsDao;

	public List<InterfacesConnectors> findAll() {
		return interfacesConnectorsDao.findAll();
	}

	public InterfacesConnectors findOne(int id) {
		return interfacesConnectorsDao.findOne(id);
	}

	public void delete(int id) {
		interfacesConnectorsDao.delete(id);
	}

	public InterfacesConnectorsForm findForm(int id) {
		InterfacesConnectorsForm form = new InterfacesConnectorsForm();
		InterfacesConnectors entity = interfacesConnectorsDao.findOne(id);
		form.setId(entity.getId());
		form.setWifi(String.valueOf(entity.getWifi()));
		form.setBluetooth(String.valueOf(entity.getBluetooth()));
		form.setNavigationSystem(String.valueOf(entity.getNavigationSystem()));
		form.setFmTuner(String.valueOf(entity.getFmTuner()));
		form.setNfc(String.valueOf(entity.getNfc()));
		form.setUsbInterface(String.valueOf(entity.getUsbInterface()));
		form.setJack(String.valueOf(entity.getJack()));
		return form;
	}

	public InterfacesConnectors findUnique(String wifi, String bluetooth,
			String navigationSystem, String fmTuner, String nfc,
			String usbInterface, String jack) {
		return interfacesConnectorsDao.findUnique(Double.valueOf(wifi), Double.valueOf(bluetooth), String.valueOf(navigationSystem), String.valueOf(fmTuner) , String.valueOf(nfc) , String.valueOf(usbInterface), String.valueOf(jack));
	}

	public void save(InterfacesConnectorsForm form) {
		InterfacesConnectors entity = new InterfacesConnectors();
		entity.setId(form.getId());
		entity.setWifi(Double.valueOf(form.getWifi()));
		entity.setBluetooth(Double.valueOf(form.getBluetooth()));
		entity.setNavigationSystem(String.valueOf(form.getNavigationSystem()));
		entity.setFmTuner(String.valueOf(form.getFmTuner()));
		entity.setNfc(String.valueOf(form.getNfc()));
		entity.setUsbInterface(String.valueOf(form.getUsbInterface()));
		entity.setJack(String.valueOf(form.getJack()));
		interfacesConnectorsDao.save(entity);
	}

}
