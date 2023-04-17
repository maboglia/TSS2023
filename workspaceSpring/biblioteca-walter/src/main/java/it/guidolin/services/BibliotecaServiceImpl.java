package it.guidolin.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.guidolin.entities.Autore;
import it.guidolin.entities.Editore;
import it.guidolin.entities.Libro;
import it.guidolin.repos.AutoreDAO;
import it.guidolin.repos.EditoreDAO;
import it.guidolin.repos.LibroDAO;

@Service
public class BibliotecaServiceImpl implements BibliotecaService {
	
	@Autowired
	AutoreDAO autoreDao;
	
	@Autowired
	EditoreDAO editoreDao;
	
	@Autowired
	LibroDAO libroDao;

	@Override
	public List<Autore> getAutori() {
		return autoreDao.findAll();
	}

	@Override
	public List<Editore> getEditori() {
		return editoreDao.findAll();
	}

	@Override
	public List<Libro> getLibri() {
		return libroDao.findAll();
	}

	@Override
	public Libro addLibro(Libro l) {
		
		for (Autore a : l.getAutori()) {
			autoreDao.save(a);
		}
		
		editoreDao.save(l.getEditore());
		return libroDao.save(l);
		
	}

}
