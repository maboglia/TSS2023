package it.bogliaccino.pl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import it.bogliaccino.services.SerieService;

@Controller
public class SerieMVC {

	@Autowired
	private SerieService service;
	
	
	@GetMapping("serie")
	String getSerie(Model m) {
		
		m.addAttribute("titolo", "Mia pagina template");
		m.addAttribute("elenco", service.getSerie());
		
		return "serieTV";//devo aggiungere una vista in templates/serietTV.html
	}
	@GetMapping("locandine")
	String getLocandine(Model m) {
		
		m.addAttribute("titolo", "Locandine");
		m.addAttribute("elenco", service.getSerie());
		
		return "locandine";//devo aggiungere una vista in templates/serietTV.html
	}
	
	
	
	
}
