package datastructure;

public class PrintArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array=new int[10];
		for(int i=0;i<array.length;i++){
			array[i]=i;
		}
		for(int i=0;i<77;i++)System.out.printf("-");
		System.out.println();
		for(int a:array){
			System.out.printf("%s",a);
			System.out.printf("   |\t");
			}
		System.out.println();
		for(int i=0;i<77;i++)System.out.printf("-");
		System.out.println();	
		
	}

}
