package ua.com.shop.controller.admin;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ua.com.shop.service.BatteryService;
import ua.com.shop.service.CameraService;
import ua.com.shop.service.ConnectivityService;
import ua.com.shop.service.CorpsService;
import ua.com.shop.service.InterfacesConnectorsService;
import ua.com.shop.service.MemoryService;
import ua.com.shop.service.OperatingSystemService;
import ua.com.shop.service.ProcessorService;
import ua.com.shop.service.ScreenService;
import ua.com.shop.service.SmartphoneService;

@Controller
@RequestMapping("/admin/smartphone")
public class SmartphoneController {
	
	@Autowired
	private SmartphoneService smartphoneService;
	
	@Autowired
	private ConnectivityService connectivityService;
	
	@Autowired
	private OperatingSystemService operatingSystemService;
	
	@Autowired
	private ScreenService screenService;
	
	@Autowired
	private ProcessorService processorService;
	
	@Autowired
	private MemoryService memoryService;
	
	@Autowired
	private CameraService cameraService;
	
	@Autowired
	private InterfacesConnectorsService interfacesConnectorsService;
	
	@Autowired
	private BatteryService batteryService;
	
	@Autowired
	private CorpsService corpsService;
	
	@RequestMapping
	public String show(Model model){
		model.addAttribute("smartphones", smartphoneService.findAll());
		return "admin-smartphone";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id){
		smartphoneService.delete(id);
		return "redirect:/admin/smartphone";
	}
	
	@GetMapping("/add/{id}")
	public String showAdd(@PathVariable int id, Model model){
		model.addAttribute("smartphones",smartphoneService.findAll());
		model.addAttribute("connectivities", connectivityService.findAll());
		model.addAttribute("operatingSystems", operatingSystemService.findAll());
		model.addAttribute("screens", screenService.findAll());
		model.addAttribute("processors", processorService.findAll());
		model.addAttribute("memories", memoryService.findAll());
		model.addAttribute("cameras", cameraService.findAll());
		model.addAttribute("interfacesConnectors", interfacesConnectorsService.findAll());
		model.addAttribute("batteries", batteryService.findAll());
		model.addAttribute("corps", corpsService.findAll());
		return "admin-smartphone";
	}
	
	@PostMapping
	//id категорії з схованого інпуту
	public String save(@RequestParam String model, @RequestParam int connectivityId, 
			@RequestParam int operatingSystemId, @RequestParam int screenId,
			@RequestParam int processorId, @RequestParam int memoryId, 
			@RequestParam int cameraId, @RequestParam int interfacesConnectorsId,
			@RequestParam int batteryId, @RequestParam int corpsId, 
			@RequestParam BigDecimal price){
		smartphoneService.save(model, connectivityId, operatingSystemId, screenId, processorId,
				memoryId, cameraId, interfacesConnectorsId, batteryId, corpsId, price);
	return "redirect:/admin/smartphone";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
