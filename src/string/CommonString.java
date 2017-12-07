package string;

import java.util.Arrays;
import java.util.List;

public class CommonString {
	 private static String commonString = "";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String[] a={"aaab","aaabc","aabd"};
      List<String> list=Arrays.asList(a);
      String common=commonstring(list);
      System.out.println(common);
	}
	
	public static String commonstring(List<String> list){
		commonString =list.get(0);
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

}
