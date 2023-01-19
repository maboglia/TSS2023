package cicli;

public class ProvaFor {

	public static void main(String[] args) {
		
//		for (int i = 11; i>=0; i--) {
//			if (i == 5)
//				continue;
//			else 
//				System.out.println(i);
//		}
//		

		for (int i = 1; i <= 10; i++) {
			
			for (int j = 1; j <= 10; j++) {
				if (i*j % 2 == 0)
					System.out.print(i * j + "\t");
				else
					System.out.print(" " + "\t");
			}
			
			System.out.println();
			
		}
		
	}
	
	
}
