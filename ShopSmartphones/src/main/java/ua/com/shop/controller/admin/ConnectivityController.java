package ua.com.shop.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import ua.com.shop.editor.MeasuringSystemEditor;
import ua.com.shop.entity.Connectivity;
import ua.com.shop.entity.MeasuringSystem;
import ua.com.shop.service.ConnectivityService;
import ua.com.shop.service.MeasuringSystemService;

@Controller
@RequestMapping("/admin/connectivity")
@SessionAttributes("connectivity")
public class ConnectivityController {

	@Autowired
	private MeasuringSystemService measuringSystemService;

	@Autowired
	private ConnectivityService connectivityService;

	@InitBinder("connectivity")
	protected void bind(WebDataBinder binder){
		binder.registerCustomEditor(MeasuringSystem.class, new MeasuringSystemEditor(measuringSystemService));
	}
	
	@ModelAttribute("connectivity")
	public Connectivity getForm(){
		return new Connectivity();
	}
	
	@RequestMapping
	public String show(Model model) {
		model.addAttribute("measuringSystems", measuringSystemService.findAll());
		model.addAttribute("connectivities", connectivityService.findAll());
		return "admin-connectivity";
	}

	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		connectivityService.delete(id);
		return "redirect:/admin/connectivity";
	}
	
	@GetMapping("/update/{id}")
	public String update(@PathVariable int id, Model model){
		model.addAttribute("connectivity", connectivityService.findOne(id));
		return show(model);
	}

	@PostMapping
	public String save(@ModelAttribute("connectivity") Connectivity connectivity) {
		connectivityService.save(connectivity);
		return "redirect:/admin/connectivity";
	}
}
