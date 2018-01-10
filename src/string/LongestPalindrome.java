package string;

import java8String.CheckPalindrome;

public class LongestPalindrome {

	public static void main(String[] args) {
		String a="aabaacdd";
		String longest=longestPalindrom(a);
		int count=findTotalNoOfPalindromes(a);
		System.out.println(longest);
		System.out.println(count);

	}
	
	public static String longestPalindrom(String input){
		
		String temp="";
		String longestPlindrom="";
		char[] inputarray=input.toCharArray();
		for(int i=0;i<input.length();i++){
			temp=String.valueOf(inputarray[i]);
			for(int j=i+1;j<input.length();j++){
				temp=temp+String.valueOf(inputarray[j]);
				if(CheckPalindrome.checkPalindromeUsingStack(temp)){
					if(temp.length()>longestPlindrom.length()){
						longestPlindrom=temp;
					}
				}
			}
		}
		return longestPlindrom;
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
	                    System.out.println(temp);
	                	counter++;
	                }
	            }
	        }
	        return counter;
	    }

}
