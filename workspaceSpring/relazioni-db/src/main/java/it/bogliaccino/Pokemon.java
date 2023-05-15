package it.bogliaccino;

import java.io.Serializable;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
//@Table(name = "pomekon")
public class Pokemon implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nome;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="pokemon_tipi",
	joinColumns = @JoinColumn(name="pokemon_id"),
	inverseJoinColumns = @JoinColumn(name="tipo_id")
			)
	private Set<Tipo> tipi;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Tipo> getTipi() {
		return tipi;
	}

	public void setTipi(Set<Tipo> tipi) {
		this.tipi = tipi;
	}
	
}
