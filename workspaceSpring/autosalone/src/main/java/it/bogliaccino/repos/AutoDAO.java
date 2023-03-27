package it.bogliaccino.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.bogliaccino.model.Auto;

@Repository 
public interface AutoDAO extends JpaRepository<Auto, Integer> {

}
