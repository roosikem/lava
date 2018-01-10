package string;

import java8String.CheckPalindrome;

public class FindPermutation {

	public static void main(String[] args) {
		String a="ABCD";
		findPermutation(a, "");

	}
	
	public static void findPermutation(String input,String prepend){
		if(input.length()==1){
			System.out.println(input+prepend);
		}
		
		for(int i=0;i<input.length();i++){
			StringBuilder sb=new StringBuilder(input);
			sb.deleteCharAt(i);
			StringBuilder sbp=new StringBuilder();
			sbp.append(prepend).append(input.charAt(i));
			findPermutation(sb.toString(), sbp.toString());
		}
	}
	
	  public static int findTotalNoOfPalindromes(String inputString) {
	        if (inputString.isEmpty()) {
	            System.out.print("Invalid input.");
	            return -1;
	        }
	        char[] inputStringArray = inputString.toCharArray();
	        int counter = inputStringArray.length;
	        for (int i = 0; i < inputStringArray.length; i++) {
	            String temp = String.valueOf(inputStringArray[i]);
	            for (int j = i + 1; j < inputStringArray.length; j++) {
	                temp = temp + inputStringArray[j];
	                if(CheckPalindrome.checkPalindromeUsingReversal(temp)) {
	                    counter++;
	                }
	            }
	        }
	        return counter;
	    }

}
