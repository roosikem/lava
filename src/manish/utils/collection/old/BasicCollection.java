package manish.utils.collection.old;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BasicCollection {

	public static void main(String[] args) {
		
		String  a[] = new String[] {"AbC","ASD"};
		List<String> s = new ArrayList<>(Arrays.asList(a));
		s.add("A");
		System.out.println(s);
	}
	
	

}
