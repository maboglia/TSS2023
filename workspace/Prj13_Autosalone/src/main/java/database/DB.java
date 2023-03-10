package database;

import java.util.ArrayList;
import java.util.Random;

import model.Auto;
import model.Camper;
import model.Moto;
import model.Veicolo;

public class DB {
	
	public static ArrayList<Veicolo> veicoli = new ArrayList<>();
	public static ArrayList<Auto> auto = new ArrayList<>();
	public static ArrayList<Moto> moto = new ArrayList<>();
	public static ArrayList<Camper> camper = new ArrayList<>();
	
	// Metodo per inizializzare con un metodo statico
	public static void inizializza() {
		
		initCamper();
		
		initMoto();
		
		initAuto();
		
	}

	public static void initAuto() {
		for (String[] strings : arrayVeicoli) {
			String marca = strings[0];
			String modello = strings[1];
			Random r = new Random();
			double prezzo = r.nextDouble(1000, 50000);
			Auto a = new Auto(marca, modello, prezzo);
			veicoli.add(a);
			auto.add(a);
		}
	}

	public static void initMoto() {
		for (String[] strings : arrayMoto) {
			String marca = strings[0];
			String modello = strings[1];
			Random r = new Random();
			double prezzo = r.nextDouble(1000, 50000);
			Moto m = new Moto(marca, modello, prezzo);
			veicoli.add(m);
			moto.add(m);
		}
	}

	public static void initCamper() {
		for (String[] strings : arrayCamper) {
			String marca = strings[0];
			String modello = strings[1];
			Random r = new Random();
			double prezzo = r.nextDouble(1000, 50000);
			Camper c = new Camper(marca, modello, prezzo);
			veicoli.add(c);
			camper.add(c);
		}
	}
	
	public static void addVeicolo(Veicolo v) {
		veicoli.add(v);
	}
	
	static String[][] arrayCamper = {
			{"bmw","grandtourer"},
			{"harley","davidson"},
			{"yamaha","yzf"},
			{"kawasaki","ninja"},
	};
	
	static String[][] arrayMoto = {
			{"bmw","grandtourer"},
			{"harley","davidson"},
			{"yamaha","yzf"},
			{"kawasaki","ninja"},
	};
	
	static String[][] arrayVeicoli = {
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
			{"jeep","wrangler_rubicon"},
	};

}
