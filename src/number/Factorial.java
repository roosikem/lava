package number;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(findFactorial(6));
	}
	
	public static long findFactorial(long number){
		if(number==1){
			return 1;
		}
		return findFactorial(number-1)*number;
	}

}
