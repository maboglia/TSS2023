package it.saba.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.saba.entities.Albero;
import it.saba.repos.AlberoDAO;


@Service
public class AlberoServiceImpl implements AlberoService {

	@Autowired
	private AlberoDAO dao;
	@Override
	public List<Albero> getAlberi() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Albero getAlberoById(int id) {
		// TODO Auto-generated method stub
		return dao.getReferenceById(id);
	}

	@Override
	public Albero addAlbero(Albero a) {
		// TODO Auto-generated method stub
		return dao.save(a);
	}

	@Override
	public Albero updateAlbero(Albero a) {
		// TODO Auto-generated method stub
		return dao.save(a);
	}

	@Override
	public void deleteAlbero(int id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);

	}

}
