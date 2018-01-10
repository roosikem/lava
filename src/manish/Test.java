package manish;

public class Test {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//System.out.println(positiveNumber(110));
		
		 int s = 32;
		 int newCap = 32 << 1;
		 int newTh = 24 << 1;
		 
		 System.out.println(newCap);
		 System.out.println(newTh);
		
	}
	
	
	public static int print(int num) {
		//num=9;
		int num2=num;
		int i =2;
		for(int j =1;j<i;j++) {
			if(j%num==0&&j>num) {
				
				int s=j;
				//System.out.println(s);
				if(numSum(s)==num) {
					
					return s;
				}
			}
			i++;
		}
		
		
		
		
		
		return 0;
}
	public static int numSum(int b) {
		int r = 0;
		int sum=0;
		while(b>0) {
			
			r = b%10;
			sum=sum+r;
			b=b/10;
			
		}
		//System.out.println(sum);
		return sum;
	}
	
	
	public static int positiveNumber(int num) {
		int minimumPosNumber = 0;
		for(int i=0;; i++) {
			if(i%num==0) {
				if(sumCheck(i, num)) {
					minimumPosNumber = i;
					break;
				}
			}
		}
		
		if(minimumPosNumber>0) {
			return minimumPosNumber;
		}
		return 0;
	}

	public static boolean sumCheck(int num, int orgNum) {
		String s = String.valueOf(Math.abs(num));
		int temp = 0;
		for(int i=0;i<s.length();i++) {
			temp= temp+Integer.parseInt(""+s.charAt(i));
		}
		int sum1 = sumAllDigit(orgNum);
		int sum2 = sumAllDigit(temp);	
		
		if(sum1 == sum2 && num!=orgNum) {
			return true;
		}
		return false;
	}
	
	public static int sumAtTheLast(int num) {
		String s = String.valueOf(Math.abs(num));
		
		if(s.length()==1) {
			return Integer.parseInt(""+s.charAt(0));
		}
		
		return sumAtTheLast(Math.abs(Integer.parseInt(s)));
	}
	
	public static int sumAllDigit(int n) {
		int sum = 0;
	    while (n > 9 ) {
	                 sum=0;
	        while (n > 0) {
	            int rem;
	            rem = n % 10;
	            sum = sum + rem;
	            n = n / 10;
	        }
	        n = sum;
	    }
	    return sum;
	}
	
}
