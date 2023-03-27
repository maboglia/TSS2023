package it.bogliaccino.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.bogliaccino.controller.ContoCtrl;
import it.bogliaccino.model.ContoCorrente;

@RequestMapping("api/conti")
@RestController
public class ControllerREST {

	@Autowired
	ContoCtrl ctrl;
	
	@GetMapping("all")
	public List<ContoCorrente> getConti(){
		return ctrl.getConti();
	}
	
	@PostMapping
	public ContoCorrente addConto(@RequestBody ContoCorrente cc ) {
		return ctrl.addConto(cc);
	}
	
	
}
