package interfacce;

public class ProvaFunzionale implements InterfacciaFunzionale {

	@Override
	public void accetta(String s) {
		System.out.println(s);

	}

}

class TestFunzionale{
	
	public static void main(String[] args) {
		InterfacciaFunzionale pf = new InterfacciaFunzionale() {
			
			@Override
			public void accetta(String s) {
				// TODO Auto-generated method stub
				
			}
		};
		
		InterfacciaFunzionale pf1 = (s)->System.out.println(s);
		pf1.accetta("test");
	}
}
