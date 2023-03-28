package it.bogliaccino.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.bogliaccino.entities.Game;
import it.bogliaccino.services.GameService;

@RestController
@RequestMapping("api")
@CrossOrigin()
public class Games {

	@Autowired
	private GameService service;
	
	@GetMapping("all") 
	public List<Game> getAll(){
		return service.getAll();
	}
	
	@GetMapping("all/year/{year}") 
	public List<Game> getAllByYear(@PathVariable int year){
		return service.getAllByYear(year);
	}	

	@GetMapping("all/publisher/{publisher}") 
	public List<Game> getAllByPublisher(@PathVariable String publisher){
		return service.getAllByPublisher(publisher);
	}	

	@GetMapping("all/platform/{platform}") 
	public List<Game> getAllByPlatform(@PathVariable("platform") String piattaforma){
		return service.getAll().stream()
				.filter(g -> g.getOriginalPlatform().toLowerCase().contains(piattaforma.toLowerCase()))
				.toList();
	}	

	@GetMapping("all/genres/{genre}") 
	public List<Game> getAllByGenre(@PathVariable("genre") String genere){
		return service.getAll().stream()
				.filter(g -> g.getGenre().toLowerCase().contains(genere.toLowerCase()))
				.toList();
	}	
		
	
	@GetMapping("all/genres")
	public List<String> getGeneri(){
		return service.getAll().stream().map(g -> g.getGenre()).distinct().sorted().toList();
	}
		
}
