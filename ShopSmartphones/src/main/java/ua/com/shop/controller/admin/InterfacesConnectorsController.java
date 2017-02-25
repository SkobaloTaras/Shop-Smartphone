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

import ua.com.shop.entity.InterfacesConnectors;
import ua.com.shop.service.InterfacesConnectorsService;

@Controller
@RequestMapping("/admin/interfacesConnectors")
@SessionAttributes("interfacesConnectors")
public class InterfacesConnectorsController {

	@Autowired
	private InterfacesConnectorsService interfacesConnectorsService;
	
	@ModelAttribute("interfacesConnectors")
	public InterfacesConnectors getForm(){
		return new InterfacesConnectors();
	}
	
	@GetMapping
	public String show(Model model) {
		model.addAttribute("interfacesConnectors", interfacesConnectorsService.findAll());
		return "admin-interfacesConnectors";
	}

	@GetMapping("/update/{id}")
	public String update(@PathVariable int id, Model model){
		model.addAttribute("interfacesConnectors", interfacesConnectorsService.findOne(id));
		show(model);
		return "admin-interfacesConnectors";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		interfacesConnectorsService.delete(id);
		return "redirect:/admin/interfacesConnectors";
	}
	
	@PostMapping
	public String save(@ModelAttribute("interfacesConnectors") InterfacesConnectors interfacesConnectors, SessionStatus status) {
		interfacesConnectorsService.save(interfacesConnectors);
		status.setComplete();
		return "redirect:/admin/interfacesConnectors";
	}
}

