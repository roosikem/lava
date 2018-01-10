package manish.utils.collection.old;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetCollection {

	public static void main(String[] args) {
			Set<String> s = new HashSet<String>();
			s.add("MANISH");
			Set<String> s2 = new TreeSet<String>();	
			s2.add("MANISH");
			System.out.println(s.equals(s2));
			
			List<String> list = new ArrayList<String>();
			list.add("MANISH");
			
			List<String> list2 = new LinkedList<String>();
			list2.add("MANISH");
			System.out.println(list.equals(list2));

	}

}
