package manish.datastructure.list.linkedlist.single;

public class SingleLinkedList {
	Node start;

	public SingleLinkedList() {
		start = null;
	}

	public void insertToBeginning(int data) {
		Node node = new Node(data);
		node.link = start;
		start = node;
	}

	public void insertToEnd(int data) {
		Node p;
		Node node = new Node(data);
		p = start;
		if (p == null) {
			start = node;
			return;
		}
		while (p.link != null)
			p = p.link;

		p.link = node;
	}

	public void insertAfter(int data, int x) {
		Node p;
		p = start;
		while (p != null) {
			if (p.info == x)
				break;
			p = p.link;
		}
		if (p == null)
			System.out.println(x + " element not found in a list.");
		else {
			Node node = new Node(data);
			node.link = p.link;
			p.link = node;
		}
	}

	public void insertBefore(int data, int x) {
		Node p = start;
		Node temp;
		if (null == p) {
			System.out.println("List is empty");
		} else {
			if (p.info == x) {
				temp = new Node(data);
				temp.link = start;
				start = temp;
			}
			p = start;
			while (p != null) {
				if (p.link.info == x)
					break;
				p = p.link;
			}
			if (null == p)
				System.out.println(x + " element not found in a list.");
			else {
				temp = new Node(data);
				temp.link = p.link;
				p.link = temp;
			}
		}
	}

	public void insertAtPostition(int data, int x) {
		Node p = start;
		Node temp;
		int i;
		if (null == p) {
			System.out.println("List is empty");
		} else {
			if (x == 1) {
				temp = new Node(data);
				temp.link = start;
				start = temp;
			}
			p = start;
			for (i = 1; i < x - 1 && p != null; i++)
				p = p.link;

			if (null == p)
				System.out.println("you can insert only upto " + i + " th position.");
			else {
				temp = new Node(data);
				temp.link = p.link;
				p.link = temp;
			}
		}
	}

	public void printLst() {
		if (null == start)
			System.out.println("List is empty");
		else {
			Node p = start;
			while (null != p) {
				System.out.print(p.info + " ");
				p = p.link;
			}
		}
	}

	public void searchElement(int x) {
		if (null == start)
			System.out.println("List is empty");
		else {
			int i = 1;
			Node p = start;
			while (null != p.link) {
				if (p.info == x)
					break;
				i++;
				p = p.link;
			}
			if (p == null)
				System.out.println("Element not found in a list");
			System.out.println("Element found at " + i + " th position : " + p.info);
		}
	}

	public void deleteFirstNode() {
		if(start==null)
			return;
		start=start.link;
	}
	
	public void deleteLastNode() {
		if(start==null)
			return;
		if(start.link==null)
			start=null;
		Node p =start;
		while(p.link.link!=null)
			p=p.link;
		p.link=null;
	}
	
	public void deleteNode(int x) {
		if(start==null) {
			System.out.println("List is Emplty");
			return;
		}
		if(start.info==x) {
			start=start.link;
			return;
		}
		Node p =start;
		while(p.link!=null) {
			if(p.link.info==x)
				break;
			p=p.link;
		}
		if(p.link==null) {
			System.out.println("Element "+x+" not present in a list");
		}else
			p.link=p.link.link;
			
	}
	
	public void reverseList() {
		if(start==null)
			return;
		Node p,prev,next;
		prev=null;
		p=start;
		while(p!=null) {
			next=p.link;
			p.link = prev;
			prev = p;
			p = next;
		}
		start = prev;
	}
	
	public void bubbleSortExchangeData() {
		Node p,q,end;
		for(end=null;end!=start.link;end=p) {
			for(p=start;p.link!=end;p=p.link) {
				q=p.link;
				if(p.info>q.info) {
					int temp = p.info;
					p.info = q.info;
					q.info = temp;
				}
			}
		}
	}
	
	public void bubbleSortExchangeLink() {
		Node p,q,r,temp,end;
		for(end=null;end!=start.link;end=p) {
			for(r=p=start;p.link!=end;r=p,p=p.link) {
				q=p.link;
				if(p.info>q.info) {
					p.link=q.link;
					q.link = p;
					if(p!=start)
						r.link = q;
					else
						start = q;
					temp = p;
					p = q;
					q = temp;
				}
			}
		}
	}
	
	public SingleLinkedList mergeList(SingleLinkedList list) {
		SingleLinkedList mergeList = new SingleLinkedList();
		mergeList.start = merge(start, list.start);
		return mergeList;
	}
	
	private Node merge(Node p1,Node p2) {
		Node startM;
		if(p1.info<=p2.info) {
			startM = new Node(p1.info);
			p1=p1.link;
		}else {
			startM = new Node(p2.info);
			p2 = p2.link;
		}
		Node pM = startM;
		while(p1!=null && p2!=null) {
			if(p1.info<=p2.info) {
				pM.link = new Node(p1.info);
				p1=p1.link;
			}else {
				pM.link = new Node(p2.info);
				p2 = p2.link;
			}
			pM=pM.link;
		}
		while(p1!=null) {
			pM.link = new Node(p1.info);
			p1=p1.link;
			pM=pM.link;
			
		}
		while(p2!=null) {
			pM.link = new Node(p2.info);
			p2=p2.link;
			pM=pM.link;
			
		}
		return startM;
	}
	
	public SingleLinkedList mergeLinkarrange(SingleLinkedList list) {
		SingleLinkedList mergeList = new SingleLinkedList();
		mergeList.start = merge1(start, list.start);
		return mergeList;
	}
	
	private Node merge1(Node p1,Node p2) {
		Node startM;
		if(p1.info<=p2.info) {
			startM = p1;
			p1=p1.link;
		}else {
			startM = p2;
			p2 = p2.link;
		}
		Node pM = startM;
		while(p1!=null && p2!=null) {
			if(p1.info<=p2.info) {
				pM.link = p1;
				p1=p1.link;
				pM=pM.link;
			}else {
				pM.link = p2;
				p2=p2.link;
				pM=pM.link;
			}
		}
		if(p1==null) 
			pM.link = p2;
			else
				pM.link = p1;
		return startM;
	}
	
	public Node findCycle() {
		Node slowM = start,fastM = start;
		if(start==null || start.link == null)
			return null;
		while(fastM!=null && fastM.link!=null) {
			slowM = slowM.link;
			fastM = fastM.link.link;
			if(slowM==fastM)
				 return slowM;
			 
		}
		return null;
	}
	
	public void removeCycle() {
		Node c = findCycle();
		if(c == null)
			return;
		Node p=c,q=c;
		int lengthCycle = 0;
		do {
			lengthCycle++;
			q = q.link;
		}while(p!=q);
		
		p = start;
		int lengthRemaining = 0;
		while(p!=q) {
			lengthRemaining++;
			p=p.link;
			q=q.link;
		}
		
		int totalLength = lengthCycle + lengthRemaining;
		p =start;
		for(int i=0;i<totalLength-1;i++)
			p=p.link;
		p.link = null;
	}
	
	public void insertCycle(int x) {
		if(start == null)
			return;
		Node p =start,prev = null,px=null;
		while(p!=null) {
			if(p.info == x)
				px = p;
			prev = p;
			p=p.link;
		}
		if(px!=null)
			prev.link = px;
		else
			System.out.println(x+" not present in a list");
	}
	
	@Override
	public String toString() {
		return "SingleLinkedList [start=" + start + "]";
	}

}
