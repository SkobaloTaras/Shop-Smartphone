package ua.com.shop.controller.admin;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import ua.com.shop.entity.OperatingSystem;
import ua.com.shop.service.OperatingSystemService;
import ua.com.shop.validator.OperatingSystemValidator;

@Controller
@RequestMapping("/admin/operatingSystem")
@SessionAttributes("operatingSystem")
public class OperatingSystemController {

	@Autowired
	private OperatingSystemService operatingSystemService;
	
	@InitBinder("operatingSystem")
	protected void bind(WebDataBinder binder){
		binder.setValidator(new OperatingSystemValidator(operatingSystemService));
	}
	
	@ModelAttribute("operatingSystem")
	public OperatingSystem getForm(){
		return new OperatingSystem();
	}
	
	@GetMapping
	public String show(Model model){
		model.addAttribute("operatingSystems", operatingSystemService.findAll());
		return "admin-operatingSystem";
	}
	
	@GetMapping("/update/{id}")
	public String update(@PathVariable int id, Model model){
		model.addAttribute("operatingSystem", operatingSystemService.findOne(id));
		show(model);
		return "admin-operatingSystem";
	}
	
	@GetMapping("/delete/{id}")
	public String delete (@PathVariable int  id){
		operatingSystemService.delete(id);
		return "redirect:/admin/operatingSystem";
	}
	
	@PostMapping
	public String save(@ModelAttribute("operatingSystem")@Valid OperatingSystem operatingSystem, BindingResult br, Model model, SessionStatus status){
		if(br.hasErrors()){
			return show(model);
		}
		operatingSystemService.save(operatingSystem);
		status.setComplete();
		return "redirect:/admin/operatingSystem";
	}
}
