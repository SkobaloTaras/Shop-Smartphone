package ua.com.shop.controller.admin;

import static ua.com.shop.util.ParamBuilder.getParams;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
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

import ua.com.shop.dto.filter.SimpleFilter;
import ua.com.shop.entity.MeasuringSystem;
import ua.com.shop.service.MeasuringSystemService;
import ua.com.shop.validator.MeasuringSystemValidator;
@Controller
@RequestMapping("/admin/measuringSystem")
@SessionAttributes("measuringSystem")
public class MeasuringSystemController {
	
	@Autowired
	private MeasuringSystemService measuringSystemService;
	
	@InitBinder("measuringSystem")
	protected void bind(WebDataBinder binder){
		binder.setValidator(new MeasuringSystemValidator(measuringSystemService));
	}
	
	@ModelAttribute("filter")
	public SimpleFilter getFilter(){
		return new SimpleFilter();
	}
	
	@ModelAttribute("measuringSystem")
	public MeasuringSystem getForm(){
		return new MeasuringSystem();
	}
	
	@GetMapping
	public String show(Model model, @PageableDefault Pageable pageable, @ModelAttribute("filter") SimpleFilter filter){
		model.addAttribute("page", measuringSystemService.findAll(pageable, filter));
		return "admin-measuringSystem";
	}
	
	@GetMapping("/update/{id}")
	public String update(@PathVariable int id, Model model, @PageableDefault Pageable pageable, @ModelAttribute("filter") SimpleFilter filter){
		model.addAttribute("measuringSystem", measuringSystemService.findOne(id));
		show(model, pageable, filter);
		return "admin-measuringSystem";
	}
	
	@GetMapping("/delete/{id}")
	public String delete (@PathVariable int  id, @PageableDefault Pageable pageable, @ModelAttribute("filter") SimpleFilter filter){
		measuringSystemService.delete(id);
		return "redirect:/admin/measuringSystem"+getParams(pageable, filter);
	}
	
	@PostMapping
	public String save(@ModelAttribute("measuringSystem")@Valid MeasuringSystem measuringSystem, BindingResult br, Model model, SessionStatus status, @PageableDefault Pageable pageable, @ModelAttribute("filter") SimpleFilter filter){
		if(br.hasErrors()){
			return show(model, pageable, filter);
		}
		measuringSystemService.save(measuringSystem);
		status.setComplete();
		return "redirect:/admin/measuringSystem"+getParams(pageable, filter);
	}
}
