package it.bogliaccino.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import it.bogliaccino.services.LibroService;

@Controller
@RequestMapping("")
public class BibliotecaMVC {

	@Autowired
	private LibroService service;
	
	
	@GetMapping
	public String index() {
		return "index";
	}
	
	@GetMapping("libri")
	public String allLibri(Model m) {
		
		m.addAttribute("libri", service.getAll());
		
		return "libri";
	}
	
	@GetMapping("libri/{autore}/{genere}")
	public String getLibro(@PathVariable int id, Model m) {
		m.addAttribute("libro",  service.getLibroById(id)) ;
		return "dettaglio";
	}
	
}
