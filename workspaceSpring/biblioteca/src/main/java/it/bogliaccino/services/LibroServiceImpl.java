package it.bogliaccino.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.bogliaccino.entities.Libro;
import it.bogliaccino.repos.LibroDAO;

@Service
public class LibroServiceImpl implements LibroService {

	@Autowired
	private LibroDAO dao;
	
	@Override
	public List<Libro> getAll() {
		return dao.findAll();
	}

	@Override
	public Libro getLibroById(int id) {
		return dao.findById(id).get();
	}

	@Override
	public void addLibro(Libro l) {
		dao.save(l);
	}
}
