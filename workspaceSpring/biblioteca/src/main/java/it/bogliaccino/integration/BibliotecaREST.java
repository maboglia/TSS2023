package it.bogliaccino.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.bogliaccino.entities.Libro;
import it.bogliaccino.services.LibroService;

@RestController
@RequestMapping("api")
public class BibliotecaREST {

	@Autowired
	private LibroService service;
	
	
	@GetMapping("libri")
	public List<Libro> allLibri() {
		
		return service.getAll();
	}
	
	@GetMapping("libri/{id}")
	public Libro getLibro(@PathVariable("id") int id) {
		return service.getLibroById(id);
	}
	
}
