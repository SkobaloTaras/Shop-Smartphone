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
import ua.com.shop.entity.Camera;
import ua.com.shop.entity.MeasuringSystem;
import ua.com.shop.service.CameraService;
import ua.com.shop.service.MeasuringSystemService;

@Controller
@RequestMapping("/admin/camera")
@SessionAttributes("camera")
public class CameraController {

	@Autowired
	private MeasuringSystemService measuringSystemService;
	
	@Autowired
	private CameraService cameraService;
	
	@InitBinder("camera")
	protected void bind(WebDataBinder binder){
		binder.registerCustomEditor(MeasuringSystem.class, new MeasuringSystemEditor(measuringSystemService));
	}
	
	@ModelAttribute("camera")
	public Camera getForm(){
		return new Camera();
	}
	
	@RequestMapping
	public String show(Model model) {
		model.addAttribute("measuringSystems", measuringSystemService.findAll());
		model.addAttribute("cameras", cameraService.findAll());
		return "admin-camera";
	}
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id){
		cameraService.delete(id);
		return "redirect:/admin/camera";
	}
	
	@GetMapping("/update/{id}")
	public String update(@PathVariable int id, Model model){
		model.addAttribute("camera", cameraService.findOne(id));
		return show(model);
	}
	
	@PostMapping
	public String save(@ModelAttribute("camera") Camera camera){
		cameraService.save(camera);
		return "redirect:/admin/camera";
		
		
		
		
		
		
		
		
		
	}
	
}
