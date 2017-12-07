package collection;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] colors1={"red","white","yellow","blue","orange","magenta","cyan"};
		List<String> list1=new LinkedList<String>();
		for(String color:colors1)list1.add(color);
		
		String[] colors2={"gold","brown","gray","silver"};
		List<String> list2=new LinkedList<String>();
		for(String color:colors2)list2.add(color);
		
		list1.addAll(list2);
		list2=null;
		printList(list1);
		
		convertToUperCase(list1);
		printList(list1);
		
		System.out.printf("%nDeleting Item 4 to 6.......");
		removeItem(list1, 4, 7);
		printList(list1);
		reverseList(list1);
		
		
	}
	private static void printList(List<String> list){
		System.out.printf("%nlist: %n");
		for(String color:list)System.out.printf("%s ",color);
		
		System.out.println();
	}
	
	private static void convertToUperCase(List<String> list){
		ListIterator<String> lt=list.listIterator();
		while(lt.hasNext()){
			lt.set(lt.next().toUpperCase());
		}
	}
	private static void removeItem(List<String> list,int start,int end){
		list.subList(start, end).clear();
	}

	private static void reverseList(List<String> list){
		ListIterator<String> lt=list.listIterator(list.size());
		System.out.printf("%nReverse List: %n");
		while(lt.hasPrevious())System.out.printf("%s ",lt.previous());
	}
}
