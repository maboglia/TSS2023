package it.bogliaccino;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController 
@RequestMapping("api")
public class RelazioniDbApplication {

	@Autowired
	PokemonDAO dao;
	
	@Autowired
	TipoDAO tipodao;
	
	@GetMapping("all")
	ResponseEntity<List<Pokemon>> getAll(){
		
		return ResponseEntity.ok(dao.findAll());
		
	}
	
	public static void main(String[] args) {
		SpringApplication.run(RelazioniDbApplication.class, args);
	}

}
