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

import ua.com.shop.dto.form.ConnectivityForm;
import ua.com.shop.service.ConnectivityService;
import ua.com.shop.service.MeasuringSystemService;
import ua.com.shop.validator.ConnectivityValidator;

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
//		binder.registerCustomEditor(MeasuringSystem.class, new MeasuringSystemEditor(measuringSystemService));
		binder.setValidator(new ConnectivityValidator(connectivityService));
	}
	
	@ModelAttribute("connectivity")
	public ConnectivityForm getForm(){
		return new ConnectivityForm();
	}
	
	@RequestMapping
	public String show(Model model) {
//		model.addAttribute("measuringSystems", measuringSystemService.findAll());
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
		model.addAttribute("connectivity", connectivityService.findForm(id));
		show(model);
		return "admin-connectivity";
	}

	@PostMapping
	public String save(@ModelAttribute("connectivity") @Valid ConnectivityForm connectivityForm, BindingResult br, Model model, SessionStatus status) {
		if (br.hasErrors()) {
			return show(model);
		}
		connectivityService.save(connectivityForm);
		status.setComplete();
		return "redirect:/admin/connectivity";
	}
}
