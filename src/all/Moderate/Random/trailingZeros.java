package all.Moderate.Random;
// Find the number of trailing zeros in the factorial of the given input

import java.util.Scanner;

public class trailingZeros
{
	public static int findZeros(long input)
	{
		int sum = 0;
		
		for(int i = 5; input/i >= 1 ; i*=5)
			sum += (input/i);
		
		return sum;
	}
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number: ");
		long inputNum = in.nextLong();		
		System.out.println("\nTrailing zeros in "+inputNum + "! are: " +findZeros(inputNum));
		in.close();
	}
}
