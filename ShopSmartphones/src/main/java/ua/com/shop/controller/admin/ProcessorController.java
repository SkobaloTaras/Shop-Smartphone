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
import ua.com.shop.entity.MeasuringSystem;
import ua.com.shop.entity.Processor;
import ua.com.shop.service.MeasuringSystemService;
import ua.com.shop.service.ProcessorService;

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
	}
	
	@ModelAttribute("processor")
	public Processor getForm(){
		return new Processor();
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
		model.addAttribute("processor", processorService.findOne(id));
		return show(model);
	}
	
	@PostMapping
	public String save(@ModelAttribute("processor") Processor processor) {
		processorService.save(processor);
		return "redirect:/admin/processor";
	}
}
