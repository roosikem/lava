package generics;

import java.util.ArrayList;
import java.util.Arrays;

import all.Amazon.SumOfColumnsBT;

public class WildcardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] a={1,2,3,4,5,6,7,8,9};
		Double[] d={1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9};
		Character[] c={'M','A','N','I','S','H'};
		
		ArrayList<Integer> intList=new ArrayList<>();
		for(Integer element:a){
			intList.add(element);
		}
		ArrayList<Double> doubleList=new ArrayList<>();
		for(Double element:d){
			doubleList.add(element);
		}
		ArrayList<Character> charList=new ArrayList<>();
		for(Character element:c){
			charList.add(element);
		}
		print(doubleList);
		System.out.println(print(doubleList));
		System.out.println(print(intList));
		System.out.println();
	}
	
	public static double  print(ArrayList<? extends Number> list){
		double total=0;
		for(Number element:list)
			total+=element.doubleValue();
		return total;
	}

}
