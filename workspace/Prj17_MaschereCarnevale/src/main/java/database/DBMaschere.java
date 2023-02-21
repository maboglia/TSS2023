package database;

import java.util.ArrayList;

import model.Maschera;

public class DBMaschere
{
	
	private ArrayList<Maschera> tabellaMaschere = new ArrayList<>();
	
	public void add(Maschera m)
	{
		tabellaMaschere.add(m);
		System.out.println("Maschera Aggiunta");
	}

	
	public void add(String s) // Overload del metodo add().
	{
		Maschera m = new Maschera(s);
		tabellaMaschere.add(m);
	}

	
	public ArrayList<Maschera> getTabellaMaschere()
	{
		return tabellaMaschere;
	}
	
	
	
	
	
	
	
	
	
	
}
