package interfacce;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ProgrammazioneFunzionale {

	public static void main(String[] args) {
		
		
		String[] re = {
				"romolo",
				"numa pompilio",
				"tullo ostilio",
				"anco marzio",
				"servio tullio",
				"tarquinio prisco",
				"tarquinio il superbo"
		};
		
		for (var string : re) {
			System.out.println(((String)string).toString());
		}
		
		
		
		
		
		
		Stream
			.of("pisolo", "eolo", "mammolo", "cucciolo") 
			.filter(nano -> nano.length()>4)
			.sorted()
			.forEach(n -> System.out.println(n));
		
		IntStream
			.range(1, 91)
			.filter(n -> n%2==0)
			.forEach(System.out::println);
		
		IntSummaryStatistics summaryStatistics = IntStream
			.of(18,20,25,24,26,28,29,18,30)
			.summaryStatistics();
		
		System.out.println(summaryStatistics);

	}

}
