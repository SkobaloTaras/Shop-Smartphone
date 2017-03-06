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

import ua.com.shop.dto.form.ProcessorForm;
import ua.com.shop.editor.MeasuringSystemEditor;
import ua.com.shop.entity.MeasuringSystem;
import ua.com.shop.service.MeasuringSystemService;
import ua.com.shop.service.ProcessorService;
import ua.com.shop.validator.ProcessorValidator;

@Controller
@RequestMapping("/admin/processor")
@SessionAttributes("processor")
public class ProcessorController {
	
	@Autowired
	private MeasuringSystemService measuringSystemService;

	@Autowired
	private ProcessorService processorService;
	
	@InitBinder("processor")
	protected void bind(WebDataBinder binder){
		binder.registerCustomEditor(MeasuringSystem.class, new MeasuringSystemEditor(measuringSystemService));
		binder.setValidator(new ProcessorValidator(processorService));
	}
	
	@ModelAttribute("processor")
	public ProcessorForm getForm(){
		return new ProcessorForm();
	}
	
	@RequestMapping
	public String show(Model model) {
		model.addAttribute("measuringSystems", measuringSystemService.findAll());
		model.addAttribute("processors", processorService.findAll());
		return "admin-processor";
	}

	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		processorService.delete(id);
		return "redirect:/admin/processor";
	}
	
	@GetMapping("/update/{id}")
	public String update(@PathVariable int id, Model model){
		model.addAttribute("processor", processorService.findForm(id));
		show(model);
		return "admin-processor";
	}
	
	@PostMapping
	public String save(@ModelAttribute("processor") @Valid ProcessorForm processorForm, BindingResult br, Model model, SessionStatus status) {
		if (br.hasErrors()) {
			return show(model);
		}
		processorService.save(processorForm);
		status.setComplete();
		return "redirect:/admin/processor";
	}
}
