package interfacce;

public class CalasseCheRispettaIlContratto implements Contratto, ContrattoVendita{

	@Override
	public void termineContrattuale1() {
		System.out.println("Rispetto il termine contrattuale 1");
		
	}

	@Override
	public void termineContrattuale2() {
		System.out.println("Rispetto il termine contrattuale 2");
		
	}

	@Override
	public void vendi() {
		System.out.println("Rispetto il termine contrattuale 3");
		
	}

}
