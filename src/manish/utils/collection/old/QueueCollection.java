package manish.utils.collection.old;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueCollection {

	public static void main(String[] args) {
		Queue<Integer> queueA = new LinkedList<Integer>();
		queueA.add(2);
		queueA.offer(4);
		queueA.add(5);
		queueA.add(8);
	    
	    Integer b = 	queueA.poll();
	    System.out.println("get element "+b);
	    
		Iterator<Integer> it = queueA.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
