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

import ua.com.shop.dto.form.BatteryForm;
import ua.com.shop.editor.MeasuringSystemEditor;
import ua.com.shop.entity.MeasuringSystem;
import ua.com.shop.service.BatteryService;
import ua.com.shop.service.MeasuringSystemService;
import ua.com.shop.validator.BatteryValidator;

@Controller
@RequestMapping("/admin/battery")
@SessionAttributes("battery")
public class BatteryController {

	@Autowired
	private MeasuringSystemService measuringSystemService;
	
	@Autowired
	private BatteryService batteryService;
	
	@InitBinder("battery")
	protected void bind(WebDataBinder binder){
		binder.setValidator(new BatteryValidator(batteryService));
		binder.registerCustomEditor(MeasuringSystem.class, new MeasuringSystemEditor(measuringSystemService));
	}
	
	@ModelAttribute("battery")
	public BatteryForm getForm(){
		return new BatteryForm();
	}

	@RequestMapping
	public String show(Model model) {
		model.addAttribute("measuringSystems", measuringSystemService.findAll());
		model.addAttribute("batteries", batteryService.findAll());
		return "admin-battery";
	}
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id){
		batteryService.delete(id);
		return "redirect:/admin/battery";
	}
	
	@GetMapping("/update/{id}")
	public String update(@PathVariable int id, Model model){
		model.addAttribute("battery", batteryService.findForm(id));
		show(model);
		return "admin-battery";
	}
	
	@PostMapping
	public String save(@ModelAttribute("battery") @Valid BatteryForm batteryForm, BindingResult br, Model model, SessionStatus status){
		if(br.hasErrors()) {
			return show(model);
		}
		batteryService.save(batteryForm);
		status.setComplete();
		return "redirect:/admin/battery";
	}
}
