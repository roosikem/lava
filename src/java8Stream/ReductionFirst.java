package java8Stream;

import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class ReductionFirst {

	public static void main(String[] args) {
		Stream<Integer> stream=Stream.of();
		BinaryOperator<Integer> sum=(i1,i2)->i1+i2;
		int result=stream.reduce(0, sum);
		System.out.println(result);

	}

}
