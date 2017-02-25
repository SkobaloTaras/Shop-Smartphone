package ua.com.shop.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import ua.com.shop.service.ProducerService;
import ua.com.shop.service.SmartphoneService;

@Controller
public class IndexController {
	@Autowired
	private ProducerService producerService;
	
	@Autowired
	private SmartphoneService smartphoneService;
	
	@RequestMapping("/")
	public String index(Model model) {
		
		model.addAttribute("producers", producerService.findAll());
		return "user-index";
	}

	@RequestMapping("/producer/id")
	public String producer(@PathVariable int id,Model model){
		model.addAttribute("producers", producerService.findOne(id));
//		model.addAttribute("smartphones", smartphoneService).findBySmartphoneId(id);
		return "user-producer";
	}
	@RequestMapping("/admin")
	public String admin(){
		return "admin-admin";
	}
	

	
}
