package interfacce;

public class MiaClasse implements MiaInterfaccia, TuaInterfaccia {

	@Override
	public String saluta() {
		// TODO Auto-generated method stub
		return SALUTO;
	}

	public static void main(String[] args) {
		TuaInterfaccia mia = new MiaClasse();
		System.out.println(mia.saluta());
	}
	
}
