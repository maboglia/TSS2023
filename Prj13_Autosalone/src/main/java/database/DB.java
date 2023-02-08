package database;

import java.util.ArrayList;
import java.util.Random;

import model.Auto;
import model.Camper;
import model.Moto;
import model.Veicolo;

public class DB {

	//creiamo un arraylist di tipo
	public static ArrayList<Veicolo> veicoli = new ArrayList<>();
	public static ArrayList<Auto> auto = new ArrayList<>();
	public static ArrayList<Moto> moto = new ArrayList<>();
	public static ArrayList<Camper> camper = new ArrayList<>();
	
	public static void inizializza()
	{
		for (String[] strings : arraycamper) 
		{
			String marca = strings[0];
			String modello = strings[1];
			Random r = new Random();
			double prezzo = r.nextDouble(1000,50000);
			Camper c = new Camper(marca, modello, prezzo);
			veicoli.add(c);
			camper.add(c);
		}
		for (String[] strings : arraymoto) 
		{
			String marca = strings[0];
			String modello = strings[1];
			Random r = new Random();
			double prezzo = r.nextDouble(1000,50000);
			Moto m = new Moto(marca, modello, prezzo);
			veicoli.add(m);
			moto.add(m);
		}
		for (String[] strings : arrayveicoli) 
		{
			String marca = strings[0];
			String modello = strings[1];
			Random r = new Random();
			double prezzo = r.nextDouble(1000,50000);
			Auto a = new Auto(marca, modello, prezzo);
			veicoli.add(a);
			auto.add(a);
		}
	}
	
	static String[][] arraycamper = 
		{
			{"harley","davidson"},
			{"bmw","grandtourer"},
			{"yamaha","yzf"},
			{"kawasaki","ninja"}
		};
	static String[][] arraymoto = 
		{
			{"harley","davidson"},
			{"bmw","grandtourer"},
			{"yamaha","yzf"},
			{"kawasaki","ninja"}
		};
	static String[][] arrayveicoli = 
		{
			{"audi","a2"},
			{"audi","tt"},
			{"audi","etron"},
			{"bmw","isetta"},
			{"carlamotors","carlacola"},
			{"citroen","c3"},
			{"dodge_charger","police"},
			{"mercedes","benz"},
			{"toyota","prius"},
			{"nissan","patrol"},
			{"bh","crossbike"},
			{"ford","mustang"},
			{"tesla","model3"},
			{"diamondback","century"},
			{"gazelle","omafiets"},
			{"seat","leon"},
			{"lincoln","mkz2017"},
			{"volkswagen","t2"},
			{"nissan","micra"},
			{"chevrolet","impala"},
			{"mini","cooperst"},
			{"jeep","wrangler_rubicon"}
};
	
	
}
