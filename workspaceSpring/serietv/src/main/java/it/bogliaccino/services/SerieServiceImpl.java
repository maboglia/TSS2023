package it.bogliaccino.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.bogliaccino.entities.Genere;
import it.bogliaccino.entities.Serie;
import it.bogliaccino.repos.GenereDAO;
import it.bogliaccino.repos.SerieDAO;

@Service
public class SerieServiceImpl implements SerieService {

	@Autowired
	private SerieDAO dao;
	@Autowired
	private GenereDAO daoGenere;
	
	
	@Override
	public List<Serie> getSerie() {
		return dao.findAll();
	}

	@Override
	public Serie getSerieById(int id) {
		return dao.getReferenceById(id);
	}

	@Override
	public Serie addSerie(Serie s) {
		return dao.save(s);
	}

	@Override
	public Genere addGenere(Genere g)
	{
		if (g.getNome()!=null)
			return daoGenere.save(g);
		return null;
	}

	@Override
	public List<Genere> addGeneri(List<Genere> lista)
	{
		for (Genere genere : lista)
		{
			daoGenere.save(genere);
		}
		return daoGenere.findAll();
	}

	@Override
	public List<Genere> getGeneri()
	{
		return daoGenere.findAll();
	}

}
