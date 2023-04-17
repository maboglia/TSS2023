package it.guidolin;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import it.guidolin.entities.Autore;
import it.guidolin.entities.Editore;
import it.guidolin.entities.Libro;
import it.guidolin.repos.AutoreDAO;
import it.guidolin.repos.EditoreDAO;
import it.guidolin.repos.LibroDAO;

@SpringBootApplication
public class Biblioteca2Application {

	public static void main(String[] args) {
		SpringApplication.run(Biblioteca2Application.class, args);
	}
	
	@Bean
	public CommandLineRunner clr(AutoreDAO autoreDao, EditoreDAO editoreDao, LibroDAO libroDao) {
		
		return file -> {
		
		Autore a = new Autore();
		Editore e = new Editore();
		Libro l = new Libro();
		
		a.setCognome("Ciccio");
		e.setNome("Zanichelli");
		l.setTitolo("Ciao ciao");
		l.setPrezzo(11.5);
		l.getAutori().add(a);
		l.setEditore(e);
		
		autoreDao.save(a);
		editoreDao.save(e);
		libroDao.save(l);
		
		};
		
	}

}
