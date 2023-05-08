package it.bogliaccino.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.bogliaccino.entities.Viaggio;
import it.bogliaccino.services.PrenotazioneService;

@RestController
@RequestMapping("api")
public class PrenotazioniCtrl {

	@Autowired
	private PrenotazioneService service; 
	
	@GetMapping("viaggi") 
	List<Viaggio> getViaggi(){
		return service.getViaggi();
	}

	@GetMapping("viaggi/{id}") 
	Viaggio getViaggio(@PathVariable int id){
		if (service.getViaggioById(id) != null)
		return service.getViaggioById(id);
		
		return new Viaggio();
	}
	
	
}
