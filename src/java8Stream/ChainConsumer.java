package java8Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ChainConsumer {

	public static void main(String[] args) {
		List<String> list=Arrays.asList("manish","kamal","shreyas");
		List<String> newlist=new ArrayList<String>();
		
		Consumer<String> c=System.out::println;
		Consumer<String> c2=newlist::add;
		list.forEach(c);
		list.forEach(c.andThen(c2));
		System.out.println("size of newlist "+newlist.size());

	}

}
