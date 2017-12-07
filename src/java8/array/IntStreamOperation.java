package java8.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class IntStreamOperation {
	public static void moveAllEvensToLeft(Integer[] a) {
		List<Integer> evenNumbersList=null;
		List<Integer> oddNumbersList=null;
		Predicate<Integer> p1=i -> i%2 == 0;
		Predicate<Integer> p2=i -> i%2 != 0;
		
	
		 oddNumbersList =Arrays.asList(a).stream().filter(i -> i%2 != 0).collect(Collectors.toList());
		 Consumer<Integer> c=System.out::println;
			Consumer<Integer> c2=oddNumbersList::add;
		Arrays.asList(a).stream().filter(p1).sorted().collect(Collectors.toList()).forEach(c.andThen(c2));
		/*List<Integer> all=new ArrayList<Integer>();
		all.addAll(evenNumbersList);*/
		//all.addAll(oddNumbersList);
		System.out.println(oddNumbersList);
	}
	public static void main(String[] args) {
		Integer[] a=new Integer[100];
		Random r=new Random();
		for(int i=0;i<100;i++){
			a[i]=r.nextInt()+2;
		}
		for(Integer i:a){
			System.out.println(i);
		}
		Long start=System.nanoTime();
		moveAllEvensToLeft(a);
		Long end=System.nanoTime()-start;
		System.out.println(end);
		
		
	}

}
