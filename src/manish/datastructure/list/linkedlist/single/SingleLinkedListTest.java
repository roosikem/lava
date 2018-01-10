package manish.datastructure.list.linkedlist.single;

public class SingleLinkedListTest {

	public static void main(String[] args) {
		/*SingleLinkedList list = new SingleLinkedList();
		list.printLst();
		list.insertToBeginning(10);
		list.insertToBeginning(20);
		list.insertAfter(30, 20);
		list.insertBefore(40, 10);
		list.insertAtPostition(50, 5);
		list.insertAtPostition(60, 5);
		list.insertToEnd(10);
		list.insertBefore(40, 10);
		list.printLst();
		System.out.println();
		list.searchElement(40);
		list.printLst();
		list.deleteFirstNode();
		System.out.println();
		list.printLst();
		
		list.deleteLastNode();
		System.out.println();
		list.printLst();
		list.deleteNode(40);
		System.out.println();
		list.printLst();
		System.out.println();
		list.reverseList();
		list.printLst();
		System.out.println();
		list.bubbleSortExchangeData();
		list.printLst();
		
		System.out.println();
		list.bubbleSortExchangeLink();
		list.printLst();*/
		
		SingleLinkedList list1 = new SingleLinkedList();
		list1.insertToBeginning(50);
		list1.insertToBeginning(30);
		list1.insertToBeginning(40);
		list1.insertToBeginning(60);
		list1.bubbleSortExchangeLink();
		
		SingleLinkedList list2 = new SingleLinkedList();
		list2.insertToBeginning(70);
		list2.insertToBeginning(80);
		list2.insertToBeginning(90);
		list2.insertToBeginning(20);
		list2.bubbleSortExchangeLink();
		
		//SingleLinkedList s = list2.mergeList(list1);
	//	s.printLst();
		
		SingleLinkedList s2 = list2.mergeLinkarrange(list1);
		//s2.printLst();
		
		SingleLinkedList list3 = new SingleLinkedList();
		list3.insertToBeginning(10);
		list3.insertToEnd(20);
		list3.insertToEnd(30);
		list3.insertToEnd(40);
		list3.insertToEnd(50);
		list3.insertToEnd(60);
		list3.insertToEnd(70);
		list3.insertToEnd(80);
		
		list3.printLst();
		list3.insertCycle(40);
		Node s = list3.findCycle();
		if(s!=null)
		    System.out.println("Cycle detect at "+s.info);
		else
			System.out.println("cycle not detect");
		list3.removeCycle();
		list3.printLst();
	}

}
