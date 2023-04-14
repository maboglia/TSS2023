package thread;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;

public class MioThread extends Thread{

	String sitoWeb;
	String pathName;
	String format;
	
	public MioThread(String sitoWeb, String pathName, String format) {
		super();
		this.sitoWeb = sitoWeb;
		this.pathName = pathName;
		this.format = format;
	}



	@Override
	public void run() {

		
		
		int gira = 5;
		
		URL url; 
		
		for (int i = 1; i <= gira; i++) {
		
			try {
				url = new URL(sitoWeb + i);
				InputStream openStream = url.openStream();
				BufferedInputStream buffer = new BufferedInputStream(openStream);
				
				StringBuilder sb = new StringBuilder();
				
				PrintWriter pw = new PrintWriter(new File(pathName + i + format));
				
				while (true) {
					
					int data = buffer.read();
					
					if (data == -1) {
						break;
					} else {
						System.out.println((char) data);
						sb.append((char) data);
						
					}
					
					
				}
				
				pw.print(sb.toString());
				
				pw.close();
				
				System.out.println("Sono MioThread. Ho scritto il fle nr. " + i + ".");
			
				sleep(1500);
			} catch (InterruptedException e) {
				System.err.println(e.getMessage());
			} catch (MalformedURLException e) {
				System.err.println(e.getMessage());
			} catch (IOException e) {
				System.err.println(e.getMessage());
			}
			
		}
		
	}
	
}
