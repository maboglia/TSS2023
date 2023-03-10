package test;

import java.sql.SQLException;
import java.util.List;

import dao.VeicoloDAO;
import model.Veicolo;

public class TestVeicolo {

	public static void main(String[] args) {
		Veicolo v = new Veicolo();
		v.setMarca("Ferrari");
		v.setModello("Lapo");
		v.setPrezzo(200_000);

		VeicoloDAO dao = new VeicoloDAO();
		
		try {
			//dao.addVeicolo(v);
			dao.deleteVeicolo(11);
			dao.deleteVeicolo(12);
			List<Veicolo> veicoliById = dao.getVeicoli();
			
			veicoliById.forEach(System.out::println);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
