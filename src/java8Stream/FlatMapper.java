package java8Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class FlatMapper {

	public static void main(String[] args) {
		List<Integer> list1=Arrays.asList(1,2,3,4,5,6,7,8);
		List<Integer> list2=Arrays.asList(5,6,7);
		List<Integer> list3=Arrays.asList(3,4,5,6);
		List<List<Integer>> list4=Arrays.asList(list1,list2,list3);
		System.out.println(list4);
		Function<List<?>,Integer> f=List::size;
		Function<List<Integer>,Stream<Integer>> flatmapper=l->l.stream();
		
		
		/*list4.stream()
		.map(l->l.size())
		.forEach(System.out::println);

		
		list4.stream()
		.map(f)
		.forEach(System.out::println);*/
		
		
		list4.stream()
		.flatMap(flatmapper)
		.forEach(System.out::println);
	}

}
