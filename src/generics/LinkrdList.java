package generics;

public class LinkrdList {

	public static void main(String[] args){
		Node<String> node1=new Node("Manish");
		Node<String> node2=new Node("Sonam");
		Node<String> node3=new Node("Priya");
		
		node1.next=node2;
		node2.next=node3;
		Node<String> footer=new Node("footer");
		node3.next=footer;
		Node<String> dumy;
		dumy=node1;
		while(dumy.next!=null){
			System.out.println(dumy.getData());
			dumy=dumy.next;
		}
	}
}
