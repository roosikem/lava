package manish.utils.collection.old;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetCollection {

	public static void main(String[] args) {
		SortedSet<String> s = new TreeSet<String>();
		s.add("B");
		s.add("D");
		s.add("C");
		s.add("A");
		System.out.println(s);
		
		SortedSet<User> users = new TreeSet<User>(
				Comparator.comparing(User :: getId));
		users.add(new User(1,"F"));
		users.add(new User(2,"E"));
		users.add(new User(3,"A"));
		users.add(new User(4,"B"));
		users.add(new User(5,"C"));
		
		users.forEach(System.out::print);
		System.out.println();
		
		SortedSet<User> usersbefore = users.subSet(new User(3,"A"), new User(5,"C"));
		usersbefore.forEach(System.out::print);
		System.out.println();
		SortedSet<User> usersAfter = users.tailSet(new User(4,"B"));
		usersAfter.forEach(System.out::print);
		System.out.println();
		usersAfter.add(new User(6,"D"));
		users.forEach(System.out::print);
		System.out.println("Added");
		 SortedSet<String> names = new TreeSet<>(Comparator.nullsFirst(Comparator
			        .comparing(String::length)));
		 names.add("A");
		 names.add("BB");
		 names.add("CCC");
		 names.add(null);
		 names.add(null);
		 names.forEach(System.out::println);

	}
	
	

}
