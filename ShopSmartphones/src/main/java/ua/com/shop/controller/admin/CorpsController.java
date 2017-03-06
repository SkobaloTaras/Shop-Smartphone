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

import ua.com.shop.dto.form.CorpsForm;
import ua.com.shop.editor.ColorEditor;
import ua.com.shop.editor.CountryProducingEditor;
import ua.com.shop.editor.MeasuringSystemEditor;
import ua.com.shop.editor.ProducerEditor;
import ua.com.shop.entity.Color;
import ua.com.shop.entity.CountryProducing;
import ua.com.shop.entity.MeasuringSystem;
import ua.com.shop.entity.Producer;
import ua.com.shop.service.ColorService;
import ua.com.shop.service.CorpsService;
import ua.com.shop.service.CountryProducingService;
import ua.com.shop.service.MeasuringSystemService;
import ua.com.shop.service.ProducerService;
import ua.com.shop.validator.CorpsValidator;

@Controller
@RequestMapping("/admin/corps")
@SessionAttributes("corps")
public class CorpsController {

	@Autowired
	private ColorService colorService;
	
	@Autowired
	private ProducerService producerService;
	
	@Autowired
	private MeasuringSystemService measuringSystemService;
	
	@Autowired
	private CountryProducingService countryProducingService;
	
	@Autowired
	private CorpsService corpsService;

	@InitBinder("corps")
	protected void bind(WebDataBinder binder){
		binder.registerCustomEditor(MeasuringSystem.class, new MeasuringSystemEditor(measuringSystemService));
		binder.registerCustomEditor(Producer.class, new ProducerEditor(producerService));
		binder.registerCustomEditor(Color.class, new ColorEditor(colorService));
		binder.registerCustomEditor(CountryProducing.class, new CountryProducingEditor(countryProducingService));
		binder.setValidator(new CorpsValidator(corpsService));
	}
	
	@ModelAttribute("corps")
	public CorpsForm getForm(){
		return new CorpsForm();
	}
	
	@RequestMapping
	public String show(Model model) {
		model.addAttribute("measuringSystems", measuringSystemService.findAll());
		model.addAttribute("colors", colorService.findAll());
		model.addAttribute("producers", producerService.findAll());
		model.addAttribute("countryProducings", countryProducingService.findAll());
		model.addAttribute("corpses", corpsService.findAll());
		return "admin-corps";
	}

	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		corpsService.delete(id);
		return "redirect:/admin/corps";
	}

	@GetMapping("/update/{id}")
	public String update(@PathVariable int id, Model model){
		model.addAttribute("corps", corpsService.findForm(id));
		show(model);
		return "admin-corps";
	}
	
	@PostMapping
	public String save(@ModelAttribute("corps") @Valid CorpsForm corpsForm, BindingResult br, Model model, SessionStatus status) {
		if (br.hasErrors()) {
			return show(model);
		}
		corpsService.save(corpsForm);
		status.setComplete();
		return "redirect:/admin/corps";
	}
}