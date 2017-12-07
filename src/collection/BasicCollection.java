package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class BasicCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] colors={"Red","White","Yellow","Blue","Orange","Magenta","Cyan"};
		List<String> list=new ArrayList<String>();
		for(String color:colors)list.add(color);
		
		String[] removeColors={"Yellow","Magenta","Cyan"};
		List<String> removeList=new ArrayList<String>();
		for(String color:removeColors)removeList.add(color);
		
		System.out.println("ArrayList Element******");
		for(int i=0;i<list.size();i++)System.out.printf("%s ",list.get(i));
		
		removeColors(list,removeList);
		System.out.printf("%n%nArraylist After Calling removeColors:%n");
		for(String color:list)System.out.printf("%s ",color);
	} 
	
	public static void removeColors(Collection<String> c1,Collection<String> c2){
		Iterator<String> it=c1.iterator();
		while(it.hasNext()){
			if(c2.contains(it.next())){
				it.remove();
			}
		}
	}

}
