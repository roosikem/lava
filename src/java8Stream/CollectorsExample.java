package java8Stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsExample {

	String s="Manish" +" Prajapati";
	public static void main(String[] args) {
		List<Person> persons=new ArrayList<>();
	try(    BufferedReader br=new BufferedReader(new InputStreamReader(CollectorsExample.class.getResourceAsStream("people.txt")));
			Stream<String> stream=br.lines();
       )
       {
		stream.map(line->{
			String[] s=line.split(" ");
			Person p=new Person(s[0].trim(),Integer.parseInt(s[1]));
			persons.add(p);
			return p;
		}).forEach(System.out::println);
	      }catch(IOException e){
		
	}
	Stream<Person> stream=persons.stream();
	Optional<Person> opt=
	stream.filter(person->person.getAge()>20).min(Comparator.comparing(Person::getAge));
	System.out.println("max value of person age "+opt);
	
	Optional<Person> opt2=
			persons.stream().filter(person->person.getAge()>20).max(Comparator.comparing(Person::getAge));
			System.out.println(opt2);
	Map<Integer,List<Person>> map=
	        persons.stream().filter(person->person.getAge()>20).collect(
	        		  Collectors.groupingBy(Person::getAge)
	        		);		
	System.out.println("map of person  by age  "+map);
	
	
	Map<Integer,Long> map2=
	        persons.stream().filter(person->person.getAge()>20).collect(
	        		  Collectors.groupingBy(Person::getAge,
	        				  Collectors.counting()
	        				  )
	        		);		
	System.out.println("counting the person by age "+map2);
	
	Map<Integer,List<String>> map3=
	        persons.stream().filter(person->person.getAge()>20).collect(
	        		  Collectors.groupingBy(Person::getAge,
	        				  Collectors.mapping(Person::getName, Collectors.toList())
	        				  )
	        		);		
	System.out.println("map only person name  "+map3);
	
	Map<Integer,String> map4=
	        persons.stream().filter(person->person.getAge()>20).collect(
	        		  Collectors.groupingBy(Person::getAge,
	        				  Collectors.mapping(Person::getName, Collectors.joining(", "))
	        				  )
	        		);		
	System.out.println("map only person name  "+map4);
	}

}
