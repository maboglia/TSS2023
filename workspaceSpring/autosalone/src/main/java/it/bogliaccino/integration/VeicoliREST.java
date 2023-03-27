package it.bogliaccino.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.bogliaccino.model.Auto;
import it.bogliaccino.services.AutoService;

@RestController
@RequestMapping("api")
public class VeicoliREST {

	@Autowired
	private AutoService service;
	
	@GetMapping("auto")
	public List<Auto> getAllAuto(){
		return service.trovaTutti();
	}
	
	@PostMapping("auto")
	public Auto add(@RequestBody Auto a) {
		System.out.println(a);
		return service.aggiungiUno(a);
	}
	
}
