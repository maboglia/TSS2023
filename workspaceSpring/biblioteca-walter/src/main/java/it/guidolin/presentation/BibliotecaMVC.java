package it.guidolin.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import it.guidolin.entities.Libro;
import it.guidolin.services.BibliotecaService;

@Controller
@RequestMapping
public class BibliotecaMVC {

	@Autowired
	BibliotecaService service;
	
	@GetMapping("libri")
	public String getLibri(Model m) {
		m.addAttribute("lista", service.getLibri());
		return "lista";
	}
	
	@PostMapping("libri")
	public String addLibro(Libro l) {
		service.addLibro(l);
		return "lista";
	}
	
}
