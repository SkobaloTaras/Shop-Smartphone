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
import ua.com.shop.entity.Memory;
import ua.com.shop.service.MeasuringSystemService;
import ua.com.shop.service.MemoryService;

@Controller
@RequestMapping("/admin/memory")
@SessionAttributes("memory")
public class MemoryController {

	@Autowired
	private MeasuringSystemService measuringSystemService;

	@Autowired
	private MemoryService memoryService;

	@InitBinder("memory")
	protected void bind(WebDataBinder binder){
		binder.registerCustomEditor(MeasuringSystem.class, new MeasuringSystemEditor(measuringSystemService));
	}
	
	@ModelAttribute("memory")
	public Memory getForm(){
		return new Memory();
	}
	
	@RequestMapping
	public String show(Model model) {
		model.addAttribute("measuringSystems", measuringSystemService.findAll());
		model.addAttribute("memories", memoryService.findAll());
		return "admin-memory";
	}

	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		memoryService.delete(id);
		return "redirect:/admin/memory";
	}

	@GetMapping("/update/{id}")
	public String update(@PathVariable int id, Model model){
		model.addAttribute("memory", memoryService.findOne(id));
		return show(model);
	}
	
	@PostMapping
	public String save(@ModelAttribute("memory") Memory memory) {
		memoryService.save(memory);
		return "redirect:/admin/memory";
	}
}