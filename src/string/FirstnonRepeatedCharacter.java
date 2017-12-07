package string;

import java.util.HashSet;
import java.util.Set;

public class FirstnonRepeatedCharacter {

	public static void main(String[] args) {
		
		String teemp="ManishManishKa";
		char c=firstNonRepeatedChar(teemp);
		System.out.println(c);
	}

	public static char firstNonRepeatedChar(String input){
		char[] inputChars=input.toCharArray();
		Set<Character> set=new HashSet<>();
		
		for(int i=0;i<input.length();i++){
			if(set.add(inputChars[i])){
				for(int j=i+1;j<input.length();j++){
					if(inputChars[i]==inputChars[j]){
						break;
					}
					else if(j==input.length()-1){
						return inputChars[i];
					}
				}
			}
		}
		return " ".charAt(0);
	}
}
