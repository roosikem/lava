package manish.datastructure.list.linkedlist.single;

public class Node {

	public int info;
	public Node link;
	
	Node(int info){
		this.info=info;
		link=null;
	}

	@Override
	public String toString() {
		return "Node [info=" + info + ", link=" + link + "]";
	}
	
}
