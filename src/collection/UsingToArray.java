package collection;

import java.util.Arrays;
import java.util.LinkedList;

public class UsingToArray {

	public static void main(String[] args) {
		
		String[] colors={"Red","White","Yellow"};
		LinkedList<String> list=new LinkedList<String>(Arrays.asList(colors));
		list.addLast("Black");
		list.addFirst("cyan");
		list.add(3, "violet");
		list.add("blue");
		colors=list.toArray(new String[list.size()]);
		for(String color:colors)System.out.printf("%s ",color);

	}

}
