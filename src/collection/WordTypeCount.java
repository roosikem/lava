package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class WordTypeCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,Integer> myMap=new HashMap<>();
		createMap(myMap);
		displayMap(myMap);

	}
    private static void createMap(Map<String,Integer> mymap){
    	System.out.println("Enter A sentence");
    	Scanner in=new Scanner(System.in);
    	String words=in.nextLine();
    	String[] tokens=words.split(" ");
    	for(String word:tokens){
    		if(mymap.containsKey(word)){
    			mymap.put(word, mymap.get(word)+1);
    		}
    		else{
    			mymap.put(word, 1);
    		}
    	}
    	in.close();
    }
    
    private static void displayMap(Map<String,Integer> mymap){
    	
    	Set<String> keys=mymap.keySet();
    	
    	TreeSet<String> sortedstring=new TreeSet<>(keys);
    	System.out.printf("%nMap Contains: %nKey\t\tValue%n");
    	for(String key:sortedstring){
    		System.out.printf("%-10s%10s%n",key,mymap.get(key));
    	}
    	
    	/*Iterator<String> it=keys.iterator();
    	while(it.hasNext()){
    		if(it.next().equals("Manish")){
    			it.remove();
    		}
    	}
    	System.out.println(mymap);*/
    }
	
}
