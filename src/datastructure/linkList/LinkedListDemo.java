package datastructure.linkList;

import org.omg.PortableServer.CurrentOperations;

class Link{
	
	public String bookName;
	public int milisold;
	public Link next;
	public Link(String bookName,int milisold){
		this.bookName=bookName;
		this.milisold=milisold;
	}
	
	public void display(){
		System.out.println(bookName +": "+milisold+",000,00");
	}
	
	public String toString(){
		return bookName;
	}
}

class LinkList{
	Link firstLink;
	
	public LinkList(){
		firstLink=null;
	}
	
	public boolean isEmpty(){
		return (firstLink==null);
	}
	
	public void insertFirstLink(String bookName,int milisold){
		Link link=new Link(bookName, milisold);
		link.next=firstLink;
		firstLink=link;
		
	}
	
	public Link removeFirst(){
		Link linkrefference=firstLink;
		if(!isEmpty()){
			firstLink=firstLink.next;
		}else{
			System.out.println("Empty first Link");
		}
		return linkrefference;
	}
	
	public void display(){
		Link thelink=firstLink;
		while(thelink!=null){
			thelink.display();
			System.out.println("Next Link "+thelink.next);
			thelink=thelink.next;
			System.out.println();
		}
	}
	
	public Link find(String bookName){
		Link theLink=firstLink;
		if(!isEmpty()){
			while(theLink.bookName!=bookName){
				if(theLink.next==null){
					return null;
				}else{
					theLink=theLink.next;
				}
			}
		}else{
			System.out.println("Empty Linked List");
		}
		return theLink;
	}
	
	public Link removeLink(String bookName){
	
		Link currentLink=firstLink;
		Link previousLink=firstLink;
		if(currentLink.bookName!=bookName){
			if(currentLink.next==null){
				return null;
			}
			else{
				previousLink =currentLink;
				currentLink=currentLink.next;
			}
		}
		if(currentLink==previousLink){
			firstLink=firstLink.next;
		}else{
			previousLink.next=currentLink.next;
		}
		return currentLink;
	}
}


public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkList list=new LinkList();
		list.insertFirstLink("Manish", 500);
		list.insertFirstLink("Ramesh", 400);
		list.insertFirstLink("Kamal", 200);
		list.insertFirstLink("Gajanand", 800);
		list.insertFirstLink("Strut", 900);
		list.insertFirstLink("james", 600);
		list.insertFirstLink("Kristy", 100);
		list.display();
		
	}

}
