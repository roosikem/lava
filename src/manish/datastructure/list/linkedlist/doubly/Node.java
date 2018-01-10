package manish.datastructure.list.linkedlist.doubly;

public class Node {
	Node next;
	Node prev;
	int info;
	
	public Node(int info) {
		this.info=info;
		next=null;
		prev=null;
	}
}
