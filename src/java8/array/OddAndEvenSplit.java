package java8.array;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OddAndEvenSplit {
	
	
	public static void moveAllEvensToLeft(Integer[] inputArray) {
		List<Integer> inputList=Arrays.asList(inputArray);
		
		Map<Boolean, Integer> result = inputList.stream().collect(
			       Collectors.partitioningBy(x -> x%2 == 0, Collectors.summingInt(Integer::intValue)));
		System.out.println(result);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		moveAllEvensToLeft(new Integer[]{1,4,5,7,2,8,3,9});
	}

}
