package string;

import java.util.HashMap;
import java.util.Map;

public class Isomorphic {

	public static void main(String[] args) {


		System.out.println(Isomorphic.isIsomorphic("bar", "foh"));
		System.out.println(isIsomorphic("tletur", "turtlm"));
		System.out.println(isIsomorphic("tletur", "turtle"));
	}
	
	public static boolean isIsomorphic(String s1,String s2){
		if(s1.length()!=s2.length()){
			return false;
		}
		if(s1.length()==1){
			return true;
		}
		
		Map<Character,Integer> map1=new HashMap<Character, Integer>();
		Map<Character,Integer> map2=new HashMap<Character, Integer>();
		StringBuilder sb1=new StringBuilder();
		StringBuilder sb2=new StringBuilder();
		
		for(int i=0;i<s1.length();i++){
			char char1=s1.charAt(i);
			char char2=s2.charAt(i);
			if(map1.get(char1)==null){
				map1.put(char1, i);
				sb1.append(i);
			}
			else{
				sb1.append(map1.get(char1));
			}
			if(map2.get(char2)==null){
				map2.put(char2, i);
				sb2.append(i);
			}else{
				sb2.append(map2.get(char2));
				
			}
			System.out.println(sb1.toString()+" "+sb2.toString());
			if(!sb1.toString().equalsIgnoreCase(sb2.toString())){
				return false;
			}
		}
		return true;
	}

}
