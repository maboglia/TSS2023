package interfacce;

import java.util.List;

public interface InterfacciaMoltiMetodi {
	String TABLE = "libri";
	String FIND_ALL = "SELECT * FROM " + TABLE;
	String FIND_ONE = "SELECT * FROM libri WHERE id = ";
	
	
	Libro getLibroById(int id);
	List<Libro> getLibri();
	
	void addLibro(Libro l);
	void updateLibro(Libro l);
	void deleteLibroById(int id);
	
}
