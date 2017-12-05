package manish.programs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Programs {

	//	Longest Consecutive Sequence (Java)
	public static int longestConsecutive(int[] num) {
		// if array is empty, return 0
		if (num.length == 0) {
			return 0;
		}
	 
		Set<Integer> set = new HashSet<Integer>();
		int max = 1;
	 
		for (int e : num)
			set.add(e);
	 
		for (int e : num) {
			int left = e - 1;
			int right = e + 1;
			int count = 1;
	 
			while (set.contains(left)) {
				count++;
				set.remove(left);
				left--;
			}
	 
			while (set.contains(right)) {
				count++;
				set.remove(right);
				right++;
			}
	 
			max = Math.max(count, max);
		}
	 
		return max;
	}
	
	//cumulative  sum
	public static int getValue(int[] array){
		int length = array.length;
		int lastIndex = 0;
		int sum = 0;
		for(int i=0; i<length; i++){
			for(int j = i+1; j<length; j++){
				if(array[i]>array[j]){
					i = j;
					lastIndex = j;
					break;
				}
			}
		}
		
		for(int i = lastIndex; i<length; i++){
			sum += array[i];
		}
		
		return sum;
	}
	
	public static int[] bubbleSort(int[] array){
		 int length = array.length;
		 boolean isSwap = false;
		 for(int i=0; i<length; i++){
			 for(int j = length-1 ; j>0; j++){
				 if(array[j]<array[j+1]){
					 int temp = array[j];
					 array[j] = array[j-1];
					 array[j-1] = temp;
					 isSwap = true;
				 }
			 }
			 if(!isSwap){
				 System.out.println("break at index "+i);
				 break;
			 }
		 }
			return array;
		}
		
	
	
	public static void difference(){
		byte a = 127;
		byte b = 127;
		// b = a+b; // error : connot convert from int to byte
		b+=a;
	}
	
	
	
	
	static int solveSum(int a, int b){
		return a+b;
	}
	
	static int solveSum(int a, int[] b){
		int sum=0;
		for(int i=0;i<a;i++){
			sum +=b[i];
		}
		return sum;
	}
	
	
	static int fabonoci(int number){
		if (number == 1 || number ==2){
			return 1;
		}
		return fabonoci(number -1)+fabonoci(number -2);
	}
	
	public static boolean isPrimeNumber(int number) {
		if (number == 2 || number == 3) {
			return true;
		}
		if (number % 2 == 0) {
			return false;
		}
		int sqrt = (int) Math.sqrt(number) + 1;
		for (int i = 3; i < sqrt; i += 2) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static String reverse(String input) {
		if (input == null || input.isEmpty()) {
			return input;
		}
		return input.charAt(input.length() - 1) + reverse(input.substring(0, input.length() - 1));
	}
	
	public static boolean isPalindromNumber(Integer number) {
		String text = String.valueOf(number); 
		String reverse = reverse(text);
		if (text.equals(reverse)) {
			return true;
		}
		return false;
	}
	
	private static boolean isArmStrong(int number) {
		int result = 0;
		int orig = number;
		while (number != 0) {
			int remainder = number % 10;
			result = result + remainder * remainder * remainder;
			number = number / 10;
		}
		if (orig == result) {
			return true;
		}

		return false;
	}
	
	public static int factorial(int number) {
		if (number == 0) {
			return 1;
		}
		return number * factorial(number - 1);
	}

	
	/** * Java Method to reverse String array in place * * @param array */
	public static void reverse(String[] array) {
		if (array == null || array.length < 2) {
			return;
		}
		for (int i = 0; i < array.length / 2; i++) {
			String temp = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = temp;
		}
	}

	/** * Java Method to check Anagaram String * * @param array */
	public static boolean isAnagramUsingIterative(String s1, String s2) {

		char[] s1Array = s1.toCharArray();
		for (char c : s1Array) {
			int index = s2.indexOf(c);
			if (index != -1) {
				s2 = s2.substring(0, index) + s2.substring(index + 1, s2.length());
			} else {
				break;
			}
		}
		if (s2.isEmpty()) {
			return true;
		}
		return false;
	}

	/** * Java Method to check Anagaram String * * @param array */
	public static boolean isAnagramUsingStringBuiler(String s1, String s2) {
		char[] s1Array = s1.toCharArray();
		StringBuilder sb = new StringBuilder(s2);
		for (char c : s1Array) {
			int index = sb.indexOf("" + c);
			if (index != -1) {
				sb = sb.deleteCharAt(index);
			} else {
				break;
			}
		}
		if (sb.toString().isEmpty()) {
			return true;
		}
		return false;
	}

	/** * Java Method to check Anagaram String * * @param array */
	public static boolean isAnagramUsingMap(String s1, String s2) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		StringBuilder sb = new StringBuilder();
		sb.append(s1).append(s2);
		for (int i = 0; i < sb.length(); i++) {
			if (map.containsKey(sb.charAt(i))) {
				map.put(sb.charAt(i), map.get(sb.charAt(i)) + 1);
			} else {
				map.put(sb.charAt(i), 1);
			}
		}
		Integer one = new Integer(2);
		for (Integer i : map.values()) {
			if (!one.equals(i)) {
				return false;
			}
		}
		return true;
	}
	
	/** * Java Method to check Rotation of String * * @param array */
	public static boolean isRoteted(String s1,String s2){
		if(s1.length()!=s2.length()){
			return false;
		}
		s1=s1+s1;
		return isSubString(s1, s2);
	}
	/** * Java Method to check Rotation of String * * @param array */
	public static boolean isSubString(String s1,String s2){
		return s1.contains(s2);
	}
	
	/** * Java Method to common String * * @param array */
	public static String commonstring(List<String> list){
		String commonString =list.get(0);
		for(int i=0;i<list.size()-1;i++){
			commonString=findCommon(commonString, list.get(i+1));
		}
		
		return commonString;
	}
	
	public static String findCommon(String input1,String input2){
		String temp="";
		int minLength=Math.min(input1.length(), input2.length());
		for(int i=0;i<minLength;i++){
			if(input1.charAt(i)==input2.charAt(i)){
				temp=temp+input1.charAt(i);
			}else{
				break;
			}
		}
		
		return temp;
	}

	

	public static void main(String[] args){
		//int k[] = new int[]{100,1,2,101,2,4,5,102};
		//System.out.println(getValue(k));
		/*Scanner in = new Scanner(System.in);
		int a;
		a = in.nextInt();
		int b;
		b = in.nextInt();
		int sum;
		sum = solveSum(a,b);
		System.out.println(sum);*/
		for(int i=1; i<=12; i++){ System.out.print(fabonoci(i) +" "); }

		System.out.println(isPalindromNumber(123));
		System.out.println(isPalindromNumber(121));
		
		System.out.println("isArmstrong "+isArmStrong(153));
		System.out.println("isArmstrong "+isArmStrong(371));
		
		System.out.println("isRotated "+isRoteted("MANISH", "MHANIS"));
		
	}

}
