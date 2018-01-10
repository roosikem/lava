package string;

import java.util.HashMap;
import java.util.Map;

public class LongestSubString {

	public static void main(String[] args) {
		String manish="Manish Ma";
		String result=longestSubString(manish);
		System.out.println(result);

	}
	
	public static String longestSubString(String input){
		String logestSoFar="";
		String GloballogestSofar="";
		Map<Character,Integer> map=new HashMap<Character, Integer>();
		for(int i=0;i<input.length();i++){
			char character=input.charAt(i);
			if(logestSoFar.indexOf(character)==-1){	
				if(!map.containsKey(input.charAt(i))){
					map.put(character, i);
				}
				logestSoFar=logestSoFar+character;
			}else{
				logestSoFar=input.substring(map.get(character)+1,i+1);
				map.put(character, i);
			}
		}
		if(logestSoFar.length()>GloballogestSofar.length()){
			GloballogestSofar=logestSoFar;
		}
		
		return GloballogestSofar;
	}

}
