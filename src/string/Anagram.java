package string;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start=0;
		long end=0;
		 start=System.nanoTime();
		System.out.println(isAnagramUsingIterative("manish", "imansh"));
		 end =System.nanoTime()-start;
		System.out.println(end);
		start=System.nanoTime();
		System.out.println(isAnagramUsingStringBuiler("manish", "imansh"));
		 end =System.nanoTime()-start;
		 System.out.println(end);
		 start=System.nanoTime();
		System.out.println(isAnagramUsingMap("manish", "imansh"));
		 end =System.nanoTime()-start;
		 System.out.println(end);

	}
	
	public static boolean isAnagramUsingIterative(String s1,String s2){
		
		char[] s1Array=s1.toCharArray();
		for(char c:s1Array){
			int index=s2.indexOf(c);
			if(index != -1){
				s2=s2.substring(0,index)+s2.substring(index+1,s2.length());
			}else{
				break;
			}
		}
		if(s2.isEmpty()){
			return true;
		}
		return false;
	}
	
	public static boolean isAnagramUsingStringBuiler(String s1,String s2){
		char[] s1Array=s1.toCharArray();
		StringBuilder sb=new StringBuilder(s2);
		for(char c:s1Array){
			int index=sb.indexOf(""+c);
			if(index != -1){
				sb=sb.deleteCharAt(index);
			}
			else{
				break;
			}
		}
		if(sb.toString().isEmpty()){
			return true;
		}
		return false;
	}
	
	public static boolean isAnagramUsingMap(String s1,String s2){
		Map<Character,Integer> map=new HashMap<Character, Integer>();
		StringBuilder sb=new StringBuilder();
		sb.append(s1).append(s2);
		for(int i=0;i<sb.length();i++){
			if(map.containsKey(sb.charAt(i))){
				map.put(sb.charAt(i), map.get(sb.charAt(i))+1);
			}else{
				map.put(sb.charAt(i), 1);
			}
		}
		Integer one=new Integer(2);
		for(Integer i:map.values()){
			if(!one.equals(i)){
				return false;
			}
		}
	return true;	
	}

}
