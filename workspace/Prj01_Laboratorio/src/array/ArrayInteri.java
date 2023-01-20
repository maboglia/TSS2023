package array;

public class ArrayInteri {

	public static void main(String[] args) {

//		int[] voti = new int[5];
//		
//		voti[0] = 24;
//		voti[1] = 25;
//		voti[2] = 23;
//		voti[3] = 26;
//		voti[4] = 22;
		
		int[] voti = {24,25,23,26,22};
		
		int somma = 0;
		
//		for (int i = 0; i < voti.length; i++) {
//			//somma = somma + voti[i];
//			somma += voti[i];
//		}
		
		for (int voto : voti) {
			somma += voto;
		}
		
		System.out.println("la somma dei voti è: " + somma); 
		
		
	}

}
