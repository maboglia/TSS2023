package it.bogliaccino.il;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.bogliaccino.entities.Serie;
import it.bogliaccino.services.SerieService;

@RestController
@RequestMapping("api")
public class SerieREST {

	@Autowired
	private SerieService service;

	@GetMapping("serie")
	List<Serie> getSerie(){
		return service.getSerie();
	}
	
	@GetMapping("serie/{id}")
	Serie getSerieById(@PathVariable int id){
		return service.getSerieById(id);
	}
	
	@PostMapping("serie")
	Serie addSerie(@RequestBody Serie s) {
		return service.addSerie(s);
	}
	
	
}
