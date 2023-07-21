package it.boglia.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.boglia.entities.Bollettino;
import it.boglia.services.BollettinoService;
import it.boglia.services.ContoCorrenteService;

@Controller
public class BollettiniMVC {

	//qui collegare service
	@Autowired
	private BollettinoService serviceBollettino;
	
	@Autowired
	private ContoCorrenteService serviceConto;
	
	
	@GetMapping("index")
	public String index(Model m) {
		m.addAttribute("titolo", "index");
		return "index";
	}
	
	@GetMapping("pagamento")
	public String pagamento(Model m) {
		m.addAttribute("titolo", "pagamento");		
		return "pagamento";
	}
	
	@PostMapping("pagamento")
	public String doPagamento(Model m,
			@RequestParam String numeroConto, 
			@RequestParam String codiceBollettino, 
			@RequestParam String causale, 
			@RequestParam double importo ) {
		
		if ( serviceConto.getContoCorrenteByNumero(numeroConto) != null  ) {
			
			m.addAttribute("numeroConto", numeroConto);
			m.addAttribute("codiceBollettino", codiceBollettino);
			m.addAttribute("causale", causale);
			m.addAttribute("importo", importo);
			m.addAttribute("titolo", "pagamento");
			return "pagamento";
			
		} else {
			System.out.println(numeroConto);
			System.out.println(codiceBollettino);
			System.out.println(causale);
			System.out.println(importo);
			
		}
		
		
		return "redirect:index";
	}
	
	
	@GetMapping("conferma")
	public String conferma(Model m) {
		m.addAttribute("titolo", "conferma");		
		return "conferma";
	}

	@PostMapping("conferma")
	public String doConferma(Model m,
			@RequestParam String numeroConto, 
			@RequestParam String codiceBollettino, 
			@RequestParam String causale, 
			@RequestParam double importo,
			@RequestParam String nomeUtente,
			@RequestParam String numeroCarta
			) {
		
		if ( numeroCarta != null && nomeUtente != null  ) {
			
			Bollettino b = new Bollettino();
			b.setNomeUtente(nomeUtente);
			b.setNumeroCarta(numeroCarta);
			b.setCausale(causale);
			b.setCodiceBollettino(codiceBollettino);
			b.setImporto(importo);
			b.setNumeroConto(numeroConto);
			
			Bollettino inserito = serviceBollettino.addBollettino(b);
			
			m.addAttribute("numeroConto", numeroConto);
			m.addAttribute("codiceBollettino", codiceBollettino);
			m.addAttribute("causale", causale);
			m.addAttribute("importo", importo);
			m.addAttribute("nomeUtente", nomeUtente);
			m.addAttribute("numeroCarta", numeroConto);
			m.addAttribute("titolo", "conferma");
			return "conferma";
			
		} else {
			m.addAttribute("numeroConto", numeroConto);
			m.addAttribute("codiceBollettino", codiceBollettino);
			m.addAttribute("causale", causale);
			m.addAttribute("importo", importo);
			m.addAttribute("nomeUtente", nomeUtente);
			m.addAttribute("numeroCarta", numeroConto);
			m.addAttribute("titolo", "pagamento");
			return "pagamento";
			
		}
		
		
		
	}
	
	
	
	
	@GetMapping("uscita")
	public String uscita(Model m) {
		m.addAttribute("titolo", "uscita");		
		return "uscita";
	}
	
	
	
}
