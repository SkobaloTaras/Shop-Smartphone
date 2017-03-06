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

import ua.com.shop.dto.form.SmartphoneForm;
import ua.com.shop.editor.BatteryEditor;
import ua.com.shop.editor.CameraEditor;
import ua.com.shop.editor.ConnectivityEditor;
import ua.com.shop.editor.CorpsEditor;
import ua.com.shop.editor.InterfacesConnectorsEditor;
import ua.com.shop.editor.MemoryEditor;
import ua.com.shop.editor.OperatingSystemEditor;
import ua.com.shop.editor.ProcessorEditor;
import ua.com.shop.editor.ScreenEditor;
import ua.com.shop.entity.Battery;
import ua.com.shop.entity.Camera;
import ua.com.shop.entity.Connectivity;
import ua.com.shop.entity.Corps;
import ua.com.shop.entity.InterfacesConnectors;
import ua.com.shop.entity.Memory;
import ua.com.shop.entity.OperatingSystem;
import ua.com.shop.entity.Processor;
import ua.com.shop.entity.Screen;
import ua.com.shop.service.BatteryService;
import ua.com.shop.service.CameraService;
import ua.com.shop.service.ConnectivityService;
import ua.com.shop.service.CorpsService;
import ua.com.shop.service.InterfacesConnectorsService;
import ua.com.shop.service.MemoryService;
import ua.com.shop.service.OperatingSystemService;
import ua.com.shop.service.ProcessorService;
import ua.com.shop.service.ScreenService;
import ua.com.shop.service.SmartphoneService;
import ua.com.shop.validator.SmartphoneValidator;

@Controller
@RequestMapping("/admin/smartphone")
@SessionAttributes("smartphone")
public class SmartphoneController {

	@Autowired
	private SmartphoneService smartphoneService;

	@Autowired
	private ConnectivityService connectivityService;

	@Autowired
	private OperatingSystemService operatingSystemService;

	@Autowired
	private ScreenService screenService;

	@Autowired
	private ProcessorService processorService;

	@Autowired
	private MemoryService memoryService;

	@Autowired
	private CameraService cameraService;

	@Autowired
	private InterfacesConnectorsService interfacesConnectorsService;

	@Autowired
	private BatteryService batteryService;

	@Autowired
	private CorpsService corpsService;

	@InitBinder("smartphone")
	protected void bind(WebDataBinder binder) {
		binder.registerCustomEditor(Connectivity.class, new ConnectivityEditor(connectivityService));
		binder.registerCustomEditor(OperatingSystem.class, new OperatingSystemEditor(operatingSystemService));
		binder.registerCustomEditor(Screen.class, new ScreenEditor(screenService));
		binder.registerCustomEditor(Processor.class, new ProcessorEditor(processorService));
		binder.registerCustomEditor(Memory.class, new MemoryEditor(memoryService));
		binder.registerCustomEditor(Camera.class, new CameraEditor(cameraService));
		binder.registerCustomEditor(InterfacesConnectors.class, new InterfacesConnectorsEditor(interfacesConnectorsService));
		binder.registerCustomEditor(Battery.class, new BatteryEditor(batteryService));
		binder.registerCustomEditor(Corps.class, new CorpsEditor(corpsService));
		binder.setValidator(new SmartphoneValidator(smartphoneService));
	}

	@ModelAttribute("smartphone")
	public SmartphoneForm getForm() {
		return new SmartphoneForm();
	}

	@RequestMapping
	public String show(Model model) {
		model.addAttribute("smartphones", smartphoneService.findAll());
		model.addAttribute("connectivities", connectivityService.findAll());
		model.addAttribute("operatingSystems", operatingSystemService.findAll());
		model.addAttribute("screens", screenService.findAll());
		model.addAttribute("processors", processorService.findAll());
		model.addAttribute("memories", memoryService.findAll());
		model.addAttribute("cameras", cameraService.findAll());
		model.addAttribute("interfacesConnectorses",
				interfacesConnectorsService.findAll());
		model.addAttribute("batteries", batteryService.findAll());
		model.addAttribute("corpses", corpsService.findAll());

		return "admin-smartphone";
	}

	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		smartphoneService.delete(id);
		return "redirect:/admin/smartphone";
	}

	@GetMapping("/update/{id}")
	public String update(@PathVariable int id, Model model) {
		model.addAttribute("smartphones", smartphoneService.findForm(id));
		show(model);
		return "admin-smartphone";
	}

	@PostMapping
	public String save(
			@ModelAttribute("smartphone") @Valid SmartphoneForm smartphoneForm,
			BindingResult br, Model model, SessionStatus status) {
		if (br.hasErrors()) {
			return show(model);
		}
		smartphoneService.save(smartphoneForm);
		status.setComplete();
		return "redirect:/admin/smartphone";
	}

	// @GetMapping("/add/{id}")
	// public String showAdd(@PathVariable int id, Model model){
	// model.addAttribute("smartphones",smartphoneService.findAll());
	// model.addAttribute("connectivities", connectivityService.findAll());
	// model.addAttribute("operatingSystems", operatingSystemService.findAll());
	// model.addAttribute("screens", screenService.findAll());
	// model.addAttribute("processors", processorService.findAll());
	// model.addAttribute("memories", memoryService.findAll());
	// model.addAttribute("cameras", cameraService.findAll());
	// model.addAttribute("interfacesConnectors",
	// interfacesConnectorsService.findAll());
	// model.addAttribute("batteries", batteryService.findAll());
	// model.addAttribute("corps", corpsService.findAll());
	// return "admin-smartphone";
	// }
}
