package thread;

public class ProvaThread {

	public static void main(String[] args) {

		Runnable r = () -> System.out.println("Sono un runner :)");
		
		r.run();
		
		Thread t2 = new Thread(r);
		
		MioThread mio = new MioThread("https://jsonplaceholder.typicode.com/users/", "files/user", ".json");
		MioThread suo = new MioThread("https://jsonplaceholder.typicode.com/albums/", "files/ALBUM", ".json");
		
		mio.start();
		t2.start();
		int gira = 5;
		
		for (int i = 0; i < gira; i++) {
			System.out.println("Sono il main thread " + i);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		suo.start();
		

	}

}
