import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Pokemon{
	
	String nome;
	List<String> tipi;
	public Pokemon(String nome, String... tipi) {
		super();
		this.nome = nome;
		this.tipi = Arrays.asList(tipi);
	}
	@Override
	public String toString() {
		return "Pokemon [nome=" + nome + ", tipi=" + tipi + "]";
	}
	
	
}

public class LeggiFileNew {
	static int i = 0;
	static List<Pokemon> pokemon = new ArrayList<>();
	public static void main(String[] args) {
		
		try {
			
//			File f = new File("c:\\Users\\teacher\\Downloads", "pokemonc.txt");
			File f = new File("files", "pokemon3.txt");
			
			PrintWriter pw = new PrintWriter(f, Charset.forName("utf-8"));
			
					Files
						.readAllLines(Paths
								.get("files","pokemon.txt"))
						.stream()
						.filter(riga -> 
							!riga.startsWith("\t")
							&&
							!riga.startsWith("#")
							&&
							!riga.startsWith("Indice")
						)
						.map(r -> r.replaceAll("\t", ","))
						.map(r -> r.replaceAll("\\d+,  ,", ""))
						.map(r -> r.replaceAll("\\s", ""))
						.map(r -> r.replaceAll(",,,", "|"))
						.filter(r -> !r.contains("|"))
						.map(r -> r.replaceAll("\\(?<=[a-z]\\)\\(?=[A-Z]\\)", "|"))
						.forEach(pw::println);
					
					Files.readAllLines(Paths
							.get("files","pokemon3.txt"))
						.stream()
						.map(r -> r.split(","))
						.map(r -> {
							if (r.length > 0) {
								String[] test = r[1].split("(?<=[a-z])(?=[A-Z])|(?<=[A-Z])(?=[A-Z][a-z])\r\n"
										+ "\r\n"
										+ "");
								pokemon.add(new Pokemon(r[0], test));
								return test[0];
							}return "";
						})
						.forEach(r-> System.out.print(""));
					
			pokemon.forEach(r -> System.out.println(r));
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
