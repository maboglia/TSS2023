package it.bogliaccino.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import it.bogliaccino.controller.ContoCtrl;
import it.bogliaccino.model.ContoCorrente;

@Controller
@RequestMapping("conti")
public class ContiMVC {

	@Autowired
	private ContoCtrl ctrl;
	
	@GetMapping
	@ResponseBody
	public String getConti() {
		return "hello";
	}
	
	@PostMapping
	public String addConto(ContoCorrente cc) {
		ctrl.addConto(cc);
		return "redirect:conti";
	}
	
	
}
