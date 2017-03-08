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
import ua.com.shop.entity.Producer;
import ua.com.shop.service.ProducerService;
import ua.com.shop.validator.ProducerValidator;



@Controller
@RequestMapping("/admin/producer")
@SessionAttributes("producer")
public class ProducerController {

	@Autowired
	private ProducerService producerService;
	
	@InitBinder("producer")
	protected void bind(WebDataBinder binder){
		binder.setValidator(new ProducerValidator(producerService));
	}
	
	@ModelAttribute("filter")
	public SimpleFilter getFilter(){
		return new SimpleFilter();
	}
	
	@ModelAttribute("producer")
	public Producer getForm(){
		return new Producer();
	}
	
	@GetMapping
	public String show(Model model, @PageableDefault Pageable pageable, @ModelAttribute("filter") SimpleFilter filter){
		model.addAttribute("page", producerService.findAll(pageable, filter));
		return "admin-producer";
	}
	
	@GetMapping("/update/{id}")
	public String update(@PathVariable int id, Model model, @PageableDefault Pageable pageable, @ModelAttribute("filter") SimpleFilter filter){
		model.addAttribute("producer", producerService.findOne(id));
		show(model, pageable, filter);
		return "admin-producer";
	}
	
	@GetMapping("/delete/{id}")
	public String delete (@PathVariable int  id, @PageableDefault Pageable pageable, @ModelAttribute("filter") SimpleFilter filter){
		producerService.delete(id);
		return "redirect:/admin/producer"+getParams(pageable, filter);
	}
	
	@PostMapping
	public String save(@ModelAttribute("producer")@Valid  Producer producer,BindingResult br, Model model , SessionStatus status, @PageableDefault Pageable pageable, @ModelAttribute("filter") SimpleFilter filter){
		if(br.hasErrors()){
			return show(model, pageable, filter);
		}
		producerService.save(producer);
		status.setComplete();
		return "redirect:/admin/producer"+getParams(pageable, filter);
	}
	
}
