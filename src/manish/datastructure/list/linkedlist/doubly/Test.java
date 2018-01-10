package manish.datastructure.list.linkedlist.doubly;

public class Test {

	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		list.insertAtEnd(10);
		list.printList();
		System.out.println();
		list.insertAtEnd(20);
		list.printList();
		System.out.println();
		list.insertAtEnd(30);
		list.printList();
		System.out.println();
		list.insertAtEnd(40);
		list.printList();
		System.out.println();
		list.insertAfter(20,60);
		list.printList();
		System.out.println();
		list.insertAfter(30,70);
		list.printList();
		System.out.println();
		list.insertAfter(40,80);
		list.printList();
		System.out.println();
		list.insertBefore(80,90);
		list.printList();
		System.out.println();
		list.insertBefore(30,50);
		list.printList();
		
		System.out.println();
		list.deleteFirstNode();
		list.printList();
		
		System.out.println();
		list.deleteLastNode();
		list.printList();
		
		System.out.println();
		list.deleteNode(70);
		list.printList();
		
		System.out.println();
		list.deleteNode(90);
		list.printList();
		
		System.out.println();
		list.deleteNode(20);
		list.printList();
		
		System.out.println("reverse");
		System.out.println();
		list.reverseList();
		list.printList();

	}

}
