package datastructure.sorting;

public class BubbleSort {

private int[] array = new int[50];
	
	private int length = 10;
	
	public void generateRandomArray(){
		
		for(int i = 0; i < length; i++){
			
			array[i] = (int)(Math.random()*10)+10;
			
		}
		
	}
	
	public void printArray(){
		
		System.out.println("----------");
		for(int i = 0; i < length; i++){
			
			System.out.print("| " + i + " | ");
			System.out.println(array[i] + " |");
			
			System.out.println("----------");
			
		}
		
	}
	
	
   public  void bubbleSort(){
	   
	   for(int i=length-1;i>1;--i){
		   for(int j=0;j<i;j++){
			   if(array[j]>array[j+1]){
				   swapValue(j,j+1);
				   printHorzArray(i,j);
			   }
			   printHorzArray(i,j);
		   }
	   }
   }
   
   public void selectionSort(){
	   for(int x=0;x<length;x++){
		   int minimum=x;
		   for(int y=x;y<length;y++){
			   if(array[minimum]>array[y]){
				   minimum=y;
			   }
		   }
		   swapValue(x, minimum);
		   printHorzArray(x, -1);
	   }
   }
   public void binarySearch(int value){
	   int lowIndex=0;
	   int highIndex=length-1;
	   while(lowIndex<=highIndex){
		   int middleIndex=(lowIndex+highIndex)/2;
		   if(array[middleIndex]<value)lowIndex=middleIndex+1;
		   else if(array[middleIndex]>value)highIndex=middleIndex-1;
		   else{
			   System.out.println("Search found for "+value+" at index "+middleIndex);
			   lowIndex=highIndex+1;
		   }
		   printHorzArray(middleIndex, -1);
	   }
   }
   public void swapValue(int indexOne,int indexTwo){
	   int temp=array[indexOne];
	   array[indexOne]=array[indexTwo];
	   array[indexTwo]=temp;
   }
	
   public void insertionSort(){
	   for(int i=1;i<length;i++){
		   int j=i;
		   int toInsert=array[i];
		   while((j>0)&& array[j-1]>toInsert){
			   array[j]=array[j-1];
			   j--;
			   printHorzArray(i, j);
		   }
		   array[j]=toInsert;
		   printHorzArray(i, j);
		   
	   }
   }
   
   public void printHorzArray(int i, int j){
		
		for(int n = 0; n < 51; n++)System.out.print("-");
		
		System.out.println();
		
		for(int n = 0; n < length; n++){
			
			System.out.print("| " + n + "  ");
			
		}
		
		System.out.println("|");
		
		for(int n = 0; n < 51; n++)System.out.print("-");
		
		System.out.println();
		
		for(int n = 0; n < length; n++){
			
			System.out.print("| " + array[n] + " ");
			
		}
		
		System.out.println("|");
		
		for(int n = 0; n < 51; n++)System.out.print("-");
		
		System.out.println();
		
		// END OF FIRST PART
		
		
		// ADDED FOR BUBBLE SORT
		
		if(j != -1){
		
			// ADD THE +2 TO FIX SPACING
			
			for(int k = 0; k < ((j*5)+2); k++)System.out.print(" ");
			
			System.out.print(j);
			
		}
		
		
		// THEN ADD THIS CODE
		
		if(i != -1){
			
			// ADD THE -1 TO FIX SPACING
			
			for(int l = 0; l < (5*(i - j)-1); l++)System.out.print(" ");
			
			System.out.print(i);
			
		}
		
		System.out.println();
		
	}
   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    BubbleSort b=new BubbleSort();
    b.generateRandomArray();
   // b.bubbleSort();
    //b.binarySearch(12);
    //b.selectionSort();
    b.insertionSort();
		
	}
}
