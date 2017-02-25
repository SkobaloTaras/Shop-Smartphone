package ua.com.shop.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import ua.com.shop.entity.OperatingSystem;
import ua.com.shop.entity.User;
import ua.com.shop.service.UserService;

@Controller
@RequestMapping("/admin/user")
@SessionAttributes("user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@ModelAttribute("user")
	public User getForm(){
		return new User();
	}
	
	@GetMapping
	public String show(Model model) {
		model.addAttribute("users", userService.findAll());
		return "admin-user";
	}
	
	@GetMapping("/update/{id}")
	public String update(@PathVariable int id, Model model){
		model.addAttribute("user", userService.finaOne(id));
		show(model);
		return "admin-user";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		userService.delete(id);
		return "redirect:/admin/user";
		
	}
	@PostMapping
	public String save(@ModelAttribute("user")User user, SessionStatus status){
		userService.save(user);
		status.setComplete();
		return "redirect:/admin/user";	
	}
}