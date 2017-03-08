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
import ua.com.shop.entity.CountryProducing;
import ua.com.shop.service.CountryProducingService;
import ua.com.shop.validator.CountryProducingValidator;

@Controller
@RequestMapping("/admin/countryProducing")
@SessionAttributes("countryProducing")
public class CountryProducingController {

	@Autowired
	private CountryProducingService countryProducingService;
	
	@InitBinder("countryProducing")
	protected void bind(WebDataBinder binder){
		binder.setValidator(new CountryProducingValidator(countryProducingService));
	}
	
	@ModelAttribute("filter")
	public SimpleFilter getFilter(){
		return new SimpleFilter();
	}
	
	@ModelAttribute("countryProducing")
	public CountryProducing getForm(){
		return new CountryProducing();
	}
	
	@GetMapping
	public String show(Model model, @PageableDefault Pageable pageable, @ModelAttribute("filter") SimpleFilter filter){
		model.addAttribute("page", countryProducingService.findAll(pageable, filter));
		return "admin-countryProducing";
	}
	
	@GetMapping("/update/{id}")
	public String update(@PathVariable int id, Model model, @PageableDefault Pageable pageable, @ModelAttribute("filter") SimpleFilter filter){
		model.addAttribute("countryProducing", countryProducingService.findOne(id));
		show(model, pageable, filter);
		return "admin-countryProducing";
	}
	
	@GetMapping("/delete/{id}")
	public String delete (@PathVariable int  id, @PageableDefault Pageable pageable, @ModelAttribute("filter") SimpleFilter filter){
		countryProducingService.delete(id);
		return "redirect:/admin/countryProducing"+getParams(pageable, filter);
	}
	
	@PostMapping
	public String save(@ModelAttribute("countryProducing")@Valid CountryProducing countryProducing, BindingResult br, Model model, SessionStatus status, @PageableDefault Pageable pageable, @ModelAttribute("filter") SimpleFilter filter){
		if(br.hasErrors()){
			return show(model, pageable, filter);
		}
		countryProducingService.save(countryProducing);
		status.setComplete();
		return "redirect:/admin/countryProducing"+getParams(pageable, filter);
	}
}
