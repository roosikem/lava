package collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] a={"Manish","Manish","Kapil"};
		List<String> list=Arrays.asList(a);
		Set<String> s=new HashSet<>();
		for(String ls:list){
		if(!s.add(ls)){
			System.out.println(ls);
		}
			}
		System.out.println(s);
		
		
	}
	
	

}
