package java8Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FirstPredicate {

	public static void main(String[] args) {
		Stream<String> stream=Stream.of("one","two","three","four","five");
		Predicate<String> p1=s->s.length()>3;
		Predicate<String> p2=Predicate.isEqual("one");
	    List<String> result=new ArrayList<>();
	    
		stream
		.filter(p1.or(p2)).forEach(result::add);
		
		for(String s:result){
			System.out.println(s);
		}
		System.out.println("size of result "+result.size());
		

	}

}
