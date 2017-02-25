package ua.com.shop.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import ua.com.shop.entity.MeasuringSystem;
import ua.com.shop.service.MeasuringSystemService;
@Controller
@RequestMapping("/admin/measuringSystem")
@SessionAttributes("measuringSystem")
public class MeasuringSystemController {
	
	@Autowired
	private MeasuringSystemService measuringSystemService;
	
	@ModelAttribute("measuringSystem")
	public MeasuringSystem getForm(){
		return new MeasuringSystem();
	}
	
	@GetMapping
	public String show(Model model){
		model.addAttribute("measuringSystems", measuringSystemService.findAll());
		return "admin-measuringSystem";
	}
	
	@GetMapping("/update/{id}")
	public String update(@PathVariable int id, Model model){
		model.addAttribute("measuringSystem", measuringSystemService.findOne(id));
		show(model);
		return "admin-measuringSystem";
	}
	
	@GetMapping("/delete/{id}")
	public String delete (@PathVariable int  id){
		measuringSystemService.delete(id);
		return "redirect:/admin/measuringSystem";
	}
	
	@PostMapping
	public String save(@ModelAttribute("measuringSystem")MeasuringSystem measuringSystem, SessionStatus status){
		measuringSystemService.save(measuringSystem);
		status.setComplete();
		return "redirect:/admin/measuringSystem";
	}
}
