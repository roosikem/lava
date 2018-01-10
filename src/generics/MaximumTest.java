package generics;

import java.util.Arrays;

public class MaximumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Maximum value of  "+maximum(1, 9, 7));
		System.out.println("Maximum value of  "+maximum(1.2, 9.3, 0.7));
		System.out.println("Maximum value of  "+maximum('H', 'M', 'K'));
		System.out.println("Maximum value of  "+maximum("Manish", "Sonam", "Himanshu"));
	}

	
	public static <T extends Comparable<T>> T maximum(T x, T y,T z){
		T max=x;
		if(y.compareTo(max)>0)return y;
		if(z.compareTo(max)>0)return z;
		
		return max;
	}
}
