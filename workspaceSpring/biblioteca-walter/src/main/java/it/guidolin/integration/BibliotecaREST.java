package it.guidolin.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.guidolin.entities.Autore;
import it.guidolin.entities.Editore;
import it.guidolin.entities.Libro;
import it.guidolin.services.BibliotecaService;

@RestController
@RequestMapping("api")
public class BibliotecaREST {

	@Autowired
	BibliotecaService service;
	
	@GetMapping("autori")
	public List<Autore> getAutori() {
		return service.getAutori();
	}
	
	@GetMapping("editori")
	public List<Editore> getEditori() {
		return service.getEditori();
	}
	
	@GetMapping("libri")
	public List<Libro> getLibri() {
		return service.getLibri();
	}
	
	@PostMapping("libri")
	public Libro addLibro(@RequestBody Libro l) {
		return service.addLibro(l);
	}
	
}
