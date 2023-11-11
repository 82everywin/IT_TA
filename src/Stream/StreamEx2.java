package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx2 {

	
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,2,3,4,6,13,4);
		
		System.out.println(nums.stream().filter(i -> i%2==0)
				.distinct()
				.collect(Collectors.toList()));
	}
}
