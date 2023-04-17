package it.saba.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.saba.entities.Albero;
import it.saba.services.AlberoService;

@RestController
@RequestMapping("api")
public class AlberiRest {

	@Autowired
	private AlberoService service;
	
	@GetMapping("alberi")
	public List<Albero> getAlberi(){
		return service.getAlberi();
	}
	
}
