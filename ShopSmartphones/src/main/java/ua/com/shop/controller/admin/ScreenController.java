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
import ua.com.shop.entity.Screen;
import ua.com.shop.service.MeasuringSystemService;
import ua.com.shop.service.ScreenService;

@Controller
@RequestMapping("/admin/screen")
@SessionAttributes("screen")
public class ScreenController {

	@Autowired
	private MeasuringSystemService measuringSystemService;

	@Autowired
	private ScreenService screenService;
	
	@InitBinder("screen")
	protected void bind(WebDataBinder binder){
		binder.registerCustomEditor(MeasuringSystem.class, new MeasuringSystemEditor(measuringSystemService));
	}
	
	@ModelAttribute("screen")
	public Screen getForm(){
		return new Screen();
	}
	
	@RequestMapping
	public String show(Model model) {
		model.addAttribute("measuringSystems", measuringSystemService.findAll());
		model.addAttribute("screens", screenService.findAll());
		return "admin-screen";
	}

	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		screenService.delete(id);
		return "redirect:/admin/screen";
	}
	
	@GetMapping("/update/{id}")
	public String update(@PathVariable int id, Model model){
		model.addAttribute("screen", screenService.findOne(id));
		return show(model);
	}
	
	@PostMapping
	public String save(@ModelAttribute("screen") Screen screen) {
		screenService.save(screen);
		return "redirect:/admin/screen";
	}
}
