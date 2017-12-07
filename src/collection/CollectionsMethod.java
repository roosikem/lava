package collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Character[] letters={'M','A','N','I','S','H'};
		List<Character> list=Arrays.asList(letters);
		System.out.printf("%nList Contains: %n");
		print(list);
		
		Collections.reverse(list);
		System.out.printf("%nList After calling reverse: %n");
		print(list);
		Character[] copy=new Character[6];
		List<Character> copyList=Arrays.asList(copy);
		Collections.copy(copyList, list);
		
		System.out.printf("%nList After Copying: %n");
		print(copyList);
		
		Collections.fill(list, 'R');
		System.out.printf("%nList After fill: %n");
		print(list);
	}

	private static void print(List<Character> list){
		for(Character c:list)System.out.printf("%s ",c);
	}
}
