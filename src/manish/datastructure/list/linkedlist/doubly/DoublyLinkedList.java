package manish.datastructure.list.linkedlist.doubly;

public class DoublyLinkedList {

	Node start;
	
	public void insertAtBegaining(int info) {
		if(start!=null) {
			Node temp = new Node(info);
			temp.next = start;
			start.prev = temp;
			start = temp;
		}else {
			Node temp = new Node(info);
			start = temp;
		}
	}
	
	public void insertAtEnd(int info) {
		if(start == null) {
			insertAtBegaining(info);
			return;
		}
		Node p = start;
		while(p.next!=null) {
			p = p.next;
		}
		if(p!=null) {
			Node temp = new Node(info);
			p.next = temp;
			temp.prev = p;
		}
	}
	
	public void insertAfter(int x, int info) {
		if(start == null) {
			System.out.println("List is Empty");
			return;
		}
		Node p = start;
		while(p!=null) {
			if(p.info == x)
				break;
			p = p.next;
		}
		if(p!=null) {
			if(p.next!=null) {
				Node temp = new Node(info);
				p.next.prev = temp;
				temp.next = p.next;
				p.next = temp;
				temp.prev = p;
				
			}else if(p.next == null) {
				insertAtEnd(info);
				return;
			}
		}
		else {
			System.out.println(x+" element not found in a list");
		}
	}
	
	public void insertBefore(int x,int info) {
		if(start == null) {
			System.out.println("List is empty");
			return;
		}
		Node p = start;
		while(p!=null) {
			if(p.info == x)
				break;
			p = p.next;
		}
		if(p!=null) {
			Node temp = new Node(info);
			temp.prev = p.prev;
			temp.next = p;
			p.prev.next = temp;
			p.prev = temp;
		}else {
			System.out.println(x+" not found in a list");
		}
	}
	
	public void deleteFirstNode() {
		if(start==null)
			return;
		if(start.next==null) {
			start=null;
			return;
		}
		start = start.next;
		start.prev = null;
			
	}
	
	public void deleteLastNode() {
		if(start==null)
			return;
		if(start.next==null) {
			start=null;
			return;
		}
		Node p = start;
		while(p.next!=null) {
			p=p.next;
		}
		p.prev.next = null;
		
	}
	
	public void deleteNode(int x) {
		if(start==null)
			return;
		if(start.next==null) {
			if(start.info == x) {
				start = null;
			}else {
				System.out.println(x+" not found in a list");
			}
			return;
		}
		if(start.info==x) {
			start = start.next;
			start.prev = null;
			return;
		}
		
		Node p = start;
		while(p.next!=null) {
			if(p.info == x) {
				break;
			}
			p=p.next;
		}
		if(p.next!=null) {
			if(p.info == x) {
				p.prev.next = p.next;
				p.next.prev = p.prev;
			}else {
				System.out.println(x+" element not found in a list");
			}
		}else {
			if(p.info == x)
				//deleteLastNode();
				p.prev.next = null;
			else 
				System.out.println(x+" element not found in a list");
		}
	}
	
	public void reverseList() {
		if(start==null)
			return;
		DoublyLinkedList list = new DoublyLinkedList();
		list.start = start;
		Node p=list.start;
		while(p.next!=null)
			p = p.next;
		
	   start = null;
	   start = p;
	    
		
	}
	
	public void printList() {
		if(start==null)
			return;
		Node p =start;
		while(p!=null) {
			System.out.print(p.info+"  ");
			p = p.next;
		}
	}
}
