import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeggiFile {

	public static void main(String[] args) {
		
		//metodo inputstreamreader
		
		File f = new File("files", "pokemon.txt");
		
		try {
			FileReader fr = new FileReader(f);
			int i;
			
			while ( (i = fr.read()) != -1 ) {
				System.out.print((char) i);
			}
			
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		

	}

}
