package string;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class RepeatingStringSequence {

	public static void main(String[] args) {
       String a="ABABBABABBABABBABABBABBABBBABBABBBABBABAGFGFAGFAGAFGAFGAFFAGAFFAGAFFAGAFFAGAFFAGAFFAGAFFAGAFFAG";
       printRepeatingSequence(a, 3);
	}
	
	public static void printRepeatingSequence(String input,int sequenceLength){
		Set<String> temp=new HashSet<String>();
		Map<String,Integer> repeatedString=new TreeMap<String, Integer>();  
		int i=0;
		int j=i+sequenceLength;
		while(j<=input.length()){
			if(!temp.add(input.substring(i,j))){
				if(repeatedString.containsKey(input.substring(i, j))){
					repeatedString.put(input.substring(i, j), repeatedString.get(input.substring(i, j))+1);
				}else{
					repeatedString.put(input.substring(i, j), 1);
				}
				
			}
			i++;
			j=i+sequenceLength;
		}
		System.out.println(repeatedString);
	}

}
