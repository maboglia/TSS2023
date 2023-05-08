package it.bogliaccino.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import it.bogliaccino.entities.Prenotazione;

public interface PrenotazioneDAO extends JpaRepository<Prenotazione, Integer> {

}
