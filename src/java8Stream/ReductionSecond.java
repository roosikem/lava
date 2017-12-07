package java8Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReductionSecond {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,20,30);
		
		
		int sum=list.stream()
				.reduce(0, Integer::sum);
		System.out.println("sum is "+sum);
		
		int max=list.stream()
				.reduce(0, Integer::max);
		System.out.println("Max is "+max);
		
		Optional<Integer> max2=list.stream()
				.reduce(Integer::max);
		
		System.out.println("using optional max is "+max2);

	}

}
