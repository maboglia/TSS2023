package it.bogliaccino.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import it.bogliaccino.entities.Genere;

public interface GenereDAO extends JpaRepository<Genere, Integer>
{

}
