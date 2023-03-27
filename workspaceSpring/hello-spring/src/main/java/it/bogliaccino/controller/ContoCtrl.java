package it.bogliaccino.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import it.bogliaccino.model.ContoCorrente;
@Component
public class ContoCtrl {

	private List<ContoCorrente> conti = new ArrayList<>();
	
	{
		conti.add(new ContoCorrente("mauro", 1));
		conti.add(new ContoCorrente("alberto", 2));
		conti.add(new ContoCorrente("saba", 3));
		conti.add(new ContoCorrente("sara", 4));
		conti.add(new ContoCorrente("tobia", 5));
	}
	
	public List<ContoCorrente> getConti() {
		return conti;
	} 
	
	public ContoCorrente addConto(ContoCorrente cc) {
		this.conti.add(cc);
		return cc;
	}
	
}
