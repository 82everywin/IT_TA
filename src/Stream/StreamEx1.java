package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx1 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("a","b","c");
		
		Stream<String> stream = list.stream();
		
		System.out.println(stream.collect(Collectors.toList()));
	
	//	stream.forEach(System.out::println);
	}
}
