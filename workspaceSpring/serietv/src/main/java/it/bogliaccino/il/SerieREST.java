package it.bogliaccino.il;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.bogliaccino.entities.Genere;
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
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("ADD SERIE----------------------------------------------------------------------");
		System.out.println(s.getGenere());
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("----------------------------------------------------------------------------------");
		service.addSerie(s);
		
		
		return service.addSerie(s);
		
		
	}
	
	@GetMapping("genere/{nome}")
	Genere getGenereByNome(@PathVariable String nome)
	{
		for (Genere gen : service.getGeneri())
		{
			if(gen.getNome().equals(nome))
			{
				return gen;
			}
		}
		Genere g = new Genere();
		g.setNome(nome);
		if (!nome.equals(""))
		{
			System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
			System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
			System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
			System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
			System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
			service.addGenere(g);
		}
		return g;
	}
	
	@PostMapping("genere")
	Genere addGenere(@RequestBody Genere g)
	{
		System.out.println("**********************************************************************************************");
		System.out.println("**********************************************************************************************");
		System.out.println("**********************************************************************************************");
		System.out.println("**********************************************************************************************");
		System.out.println("**********************************************************************************************");
		return service.addGenere(g);
	}
	
	@GetMapping("generi")
	List<Genere> getGeneri()
	{
		return service.getGeneri();
	}
	
	
	
	
	
	
}
