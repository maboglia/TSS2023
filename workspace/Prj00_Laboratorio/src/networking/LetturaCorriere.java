package networking;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;

public class LetturaCorriere {

	public static void main(String[] args) {
		
		String urlSitoWeb = "https://www.corriere.it";
		
		InputStream stream = null;
		BufferedInputStream bis = null;
		
		
		try {
			PrintWriter pw = new PrintWriter(new File("files/corriere.html"));
			URL url = new URL(urlSitoWeb);
			
			stream = url.openStream();
			
			bis = new BufferedInputStream(stream);
			
			while(true) {
				int data = bis.read();
			
				if (data == -1) break;
				
				System.out.print( (char)  data);
				pw.print((char)  data);
			
			}
			
			pw.close();
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		

	}

}
