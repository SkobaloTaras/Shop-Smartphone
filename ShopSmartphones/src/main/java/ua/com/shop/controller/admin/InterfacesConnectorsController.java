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

import ua.com.shop.dto.form.InterfacesConnectorsForm;
import ua.com.shop.service.InterfacesConnectorsService;
import ua.com.shop.validator.InterfacesConnectorsValidator;

@Controller
@RequestMapping("/admin/interfacesConnectors")
@SessionAttributes("interfacesConnectors")
public class InterfacesConnectorsController {

	@Autowired
	private InterfacesConnectorsService interfacesConnectorsService;
	
	@InitBinder("interfacesConnectors")
	protected void bind(WebDataBinder binder){
		binder.setValidator(new InterfacesConnectorsValidator(interfacesConnectorsService));
	}
	
	@ModelAttribute("interfacesConnectors")
	public InterfacesConnectorsForm getForm(){
		return new InterfacesConnectorsForm();
	}
	
	@GetMapping
	public String show(Model model) {
		model.addAttribute("interfacesConnectorses", interfacesConnectorsService.findAll());
		return "admin-interfacesConnectors";
	}

	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		interfacesConnectorsService.delete(id);
		return "redirect:/admin/interfacesConnectors";
	}
	
	@GetMapping("/update/{id}")
	public String update(@PathVariable int id, Model model){
		model.addAttribute("interfacesConnectors", interfacesConnectorsService.findForm(id));
		show(model);
		return "admin-interfacesConnectors";
	}
	
	@PostMapping
	public String save(@ModelAttribute("interfacesConnectors") @Valid InterfacesConnectorsForm interfacesConnectorsForm, BindingResult br, Model model, SessionStatus status) {
		if (br.hasErrors()) {
			return show(model);
		}
		interfacesConnectorsService.save(interfacesConnectorsForm);
		status.setComplete();
		return "redirect:/admin/interfacesConnectors";
	}
}

