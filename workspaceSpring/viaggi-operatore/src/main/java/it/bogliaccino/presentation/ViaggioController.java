package it.bogliaccino.presentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import it.bogliaccino.entities.Viaggio;
import it.bogliaccino.services.ViaggioService;

@Controller
public class ViaggioController {

	@Autowired
	private ViaggioService service;
	
	@GetMapping("viaggi") 
	String getAll(Model m){
		m.addAttribute("titolo", "Elenco viaggi");
		m.addAttribute("elencoViaggi", service.getViaggi());
		return "elenco";
	}
	
	@GetMapping("add") 
	String viewAdd(Model m){
		m.addAttribute("titolo", "Add viaggio");
		return "addViaggi";
	}
	
	@PostMapping("viaggi") 
	String addViaggio(Viaggio v){
		System.out.println(v);
		service.addViaggio(v);
		return "redirect:viaggi";
	}
	
	
	
}
