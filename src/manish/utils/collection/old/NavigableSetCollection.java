package manish.utils.collection.old;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetCollection {

	public static void main(String[] args) {
		NavigableSet<User> users = new TreeSet<User>();
		users.add(new User(1,"B"));
		users.add(new User(1,"C"));
		users.add(new User(1,"D"));
		users.add(new User(1,"F"));
		users.add(new User(1,"G"));
		users.add(new User(1,"H"));
		
		users.forEach(System.out::println);
		System.out.println("HeadSet");
		NavigableSet<User> usersHeadset = users.headSet(new User(1,"B"), false);
		usersHeadset.forEach(System.out::println);
		System.out.println("Using Lower");
		User a = users.lower(new User(1,"G"));
		System.out.println(a.getName());
		
		System.out.println("Using Floor");
		a = users.floor(new User(1,"H"));
		System.out.println(a.getName());
		
		System.out.println("higher");
		a = users.higher(new User(1,"G"));
		System.out.println(a.getName());
		
		System.out.println("ceiling");
		a = users.ceiling(new User(1,"G"));
		System.out.println(a.getName());
		System.out.println("pollfirst");
		a = users.pollFirst();
		System.out.println(a.getName());
		System.out.println("pollLast");
		a= users.pollLast();
		System.out.println(a.getName());
		
		users.forEach(System.out::println);
		users.remove(new User(1,"H"));
		System.out.println();
		NavigableSet<User> usersDesc = users.descendingSet();
		usersDesc.forEach(System.out::println);
	}

}
