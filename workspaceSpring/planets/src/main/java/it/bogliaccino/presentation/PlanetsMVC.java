package it.bogliaccino.presentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import it.bogliaccino.entities.Pianeta;
import it.bogliaccino.services.PianetaService;

@Controller
@RequestMapping("")
public class PlanetsMVC {

	@Autowired
	private PianetaService service;
	
	
	@GetMapping()
	//@ResponseBody
	public String homePage(Model m) {
		m.addAttribute("titolo", "Pagina principale");
		
		m.addAttribute("pianeti", service.getPianeti());
		
		return "index";
	}
	
	@GetMapping(value = {"aggiungi", "add", "mettineunalatro"})
	public String mostraForm() {
		return "form_add";
	}
	
	@GetMapping("canc/{id}")
	public String deletePianeta(@PathVariable int id) {
		service.deletePianeta(id);
		return "redirect:/";
	}
	
	
	
	
	@PostMapping("add")
	public String addPianeta(Pianeta p) {
		service.addPianeta(p);
		return "redirect:aggiungi";
	}
	
	
}
