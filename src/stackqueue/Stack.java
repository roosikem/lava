package stackqueue;

import java.util.Arrays;

public class Stack {

	private String[] stackArray;
	int stackSize;
	int topOfstack=-1;
	
	public Stack(int size){
		stackSize=size;
		stackArray=new String[size];
		Arrays.fill(stackArray, "-1");
	}
	
	public void push(String input){
		if(topOfstack+1<stackSize){
			topOfstack++;
			stackArray[topOfstack]=input;
		}
		else
			System.out.println("sory stackArray is overFlow");
		displayTheStack();
		System.out.println("PUSH: "+input+" was added to the stack");
		
	}
	
	public String pop(){
		if(topOfstack>=0){
			displayTheStack();
			System.out.println("POP: "+stackArray[topOfstack]+" was removed from the stack");
			stackArray[topOfstack]="-1";
			displayTheStack();
			return stackArray[topOfstack--];
		}
		else{
			displayTheStack();
			System.out.println("Sory stack is Empty");
			return "-1";
		}
	}
	
	public String peek(){
		displayTheStack();
		System.out.println("PEEK: "+stackArray[topOfstack]+" is at top of the stack");
		return stackArray[topOfstack];
	}
	
	public void pushMany(String multiPleValue){
		String[] temp=multiPleValue.split(" ");
		for(int i=0;i<multiPleValue.length();i++)push(temp[i]);
	}
	public void displayTheStack(){
		
		for(int n = 0; n < 61; n++)System.out.print("-");
		
		System.out.println();
		
		for(int n = 0; n < stackSize; n++){
			
			System.out.format("| %2s "+ " ", n);
			
		}
		
		System.out.println("|");
		
		for(int n = 0; n < 61; n++)System.out.print("-");
		
		System.out.println();
		
		for(int n = 0; n < stackSize; n++){
			
			
			
			if(stackArray[n].equals("-1")) System.out.print("|     ");
			
			else System.out.print(String.format("| %2s "+ " ", stackArray[n]));
			
		}
		
		System.out.println("|");
		
		for(int n = 0; n < 61; n++)System.out.print("-");
		
		System.out.println();
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack st=new Stack(10);
		//st.push("10");
		//st.push("30");
		//st.peek();
		//st.pop();
		st.pushMany("Manish Prajapati Is a Java Developer");
	}
	

}
