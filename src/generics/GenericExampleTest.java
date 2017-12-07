package generics;

public class GenericExampleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] a={1,2,3,4,5,6,7,8,9};
		Double[] d={1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9};
		Character[] c={'M','A','N','I','S','H'};
		printArray(a);
		printArray(d);
		printArray(c);
		
	}
	
	
	public static <T> void printArray(T[] inputArray){
		for(T element:inputArray){
			System.out.printf("%s ",element);
			
		}System.out.println();
	}

}
