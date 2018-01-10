package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Sorting {

	
	public static void selectionSort(int[] array) {
		for(int i = 0; i<array.length; i++) {
			for(int j=0; j<array.length; j++) {
				if(array[i]<array[j]) {
					swap(i,j,array);
				}
			}
		}
	}
	
	public static void bubbleSort(int[] array) {
		int length = array.length;
		boolean swap = false;
		for(int i=0; i<length;i++) {
			for(int j = length-1; j>i; j--) {
				if(array[j] < array[j-1]) {
					int temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;
					swap = true;
				}
				
			}
			if(!swap) {
				break;
			}
		}
	}
	
	public static void insertionSort(int[] array) {
		for(int i = 0; i< array.length-1; i++) {
			for(int j = i+1; j>0;j--) {
				if(array[j] < array[j-1]) {
					swap(j,j-1,array);
				}else {
					break;
				}
			}
		}
	}
	
	
	
	private static void modifiedInsertionSort(int[] array, int startIndex, int increment) {
		for(int i = startIndex; i<array.length; i = i+increment) {
			for(int j = Math.min(i+increment, array.length-1); j - increment >=0; j = j- increment) {
				if(array[j] < array[j-increment]) {
					swap(j, j-increment, array);
				}else {
					break;
				}
			}
		}
	}
	
	private static void shellSort(int[] array) {
		int increment = array.length/2;
		while(increment>=1) {
			for(int startIndex = 0; startIndex <increment; startIndex++) {
				modifiedInsertionSort(array, startIndex, increment);
			}
			increment = increment/2;
		}
	}
	
	public static void quickSort(int[] array, int low, int high) {
		if(low >= high) {
			return;
		}
		
		int pivot = partition(array, low, high);
		quickSort(array, low, pivot-1);
		quickSort(array, pivot+1, high);
	}
	
	public static int partition(int[] array, int low, int high) {
		int pivot = array[low];
		int l = low;
		int h = high;
		while(l<h) {
			while(array[l] <=pivot && l<h) {
				l++;
			}
			while(array[h] > pivot) {
				h--;
			}
			if(l<h) {
				swap(l,h,array);
			}
			printArray(array);
		}
		swap(low,h,array);
		System.out.println("pivot => "+array[h]);
		printArray(array);
		return h;
	}
	
	
	public static int binarySearch(int[] array , int find) {
		int min = 0;
		int max = array.length - 1;
		while(min <= max) {
			int mid = min + (max-min)/2;
			if(array[mid] == find) {
				return mid;
			}if(array[mid] > find) {
				max = mid -1;
			}else {
				min = mid+1;
			}
		}
		return 0;
	}
	
	
	public static int getLargeSequenceSum(int[] array) {

		Map<Integer, ArrayList<Integer>> hash = new HashMap<Integer, ArrayList<Integer>>();
		ArrayList<Integer> consucutive = new ArrayList<>();
		int length = array.length;
		boolean swap = false;
		for (int i = 0; i < length; i++) {
			int count = 0;
			for (int j = length - 1; j > i; j--) {

				if (array.length - 1 == count + 1) {
					if (array[j - 1] == (array[j] - 1)) {
						consucutive.add(array[j - 1]);
						hash.put(j, consucutive);
					}
				}
				if (array[j] != (array[j - 1] + 1)) {
					try {
						if ((array[j] != (array[j - 1] + 1)) && (array[j] + 1 == (array[j + 1]))) {
							consucutive.add(array[j]);
							hash.put(j, consucutive);
						}
					} catch (ArrayIndexOutOfBoundsException e) {

					}
					consucutive = new ArrayList<>();
				} else {
					consucutive.add(array[j]);
					hash.put(j, consucutive);
				}
				count++;

			}
			if (!swap) {
				break;
			}
		}

		ArrayList<Integer> sum = new ArrayList<>();

		for (Map.Entry<Integer, ArrayList<Integer>> entry : hash.entrySet()) {
			int total = 0;
			for (Integer f : entry.getValue()) {
				total += f;
			}
			sum.add(total);
		}
		Collections.sort(sum);
		if (sum != null && sum.size() > 1) {
			return sum.get(sum.size() - 1);
		}
		return 0;
	}
	
	public static void swap(int i, int j, int[] array) {
		int temp = array[j];
		array[j] = array[i];
		array[i] = temp;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*System.out.println("Bubble Sort");
		
		int a[] = new int[] {2,7,1,5,3,8,4,9,6,10};
		bubbleSort(a);
		
		System.out.println("Selection Sort");
		int selection[] = new int[] {2,7,1,5,3,8,4,9,6,10};
		selectionSort(selection);
		printArray(selection);
		
		System.out.println("Insertion Sort");
		int insertion[] = new int[] {2,7,1,5,3,8,4,9,6,10};
		insertionSort(insertion);
		printArray(insertion);
		
		System.out.println("Shell Sort");
		int shellSort[] = new int[] {2,7,1,5,3,8,4,9,6,10};
		shellSort(shellSort);
		printArray(shellSort);
		
		System.out.println("Quick Sort");
		int quickSort[] = new int[] {2,7,1,5,3,8,4,9,6,10};
		quickSort(quickSort,0,quickSort.length-1);
		printArray(quickSort);*/
		
		/*int sum[] = new int[] {1,2,3,4,6,8,9,11,12,13,5,6,7,23,435,56,57,58,90};
		System.out.println(getLargeSequenceSum(sum));
		
		int binarySearch[] = new int[] {1,2,3,4,5,6,7,8,9,10};
		quickSort(binarySearch,0,binarySearch.length-1);
		System.out.println(binarySearch(binarySearch,9));
		System.out.println(binarySearch[binarySearch(binarySearch,9)]);;*/
		
		int boxCount[] = new int[10000000];
	    for(int i=0; i < boxCount.length; i++)
	    {
	    	Random r = new Random();
	        boxCount[i]  =  (int) r.nextInt(7)*6 + 1;
	    }
	    
	    long b = System.currentTimeMillis();
	    bubbleSort(boxCount);
	    System.out.println("time for executing bubble sort "+ (System.currentTimeMillis()-b));
	    printArray(boxCount);
		
	}
	
	public static void printArray(int[] array) {
		for(int i : array) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	public static void sort(int[] a) {
		int count = 1;
		for(int i=0;i<a.length;i++) {
			if(count == a.length) {
				if(a[i]<a[count-2]) {
					int temp = a[i];
					a[i] = a[count-2];
					a[count-2] = temp;
					i=-1;
					count=0;
				}
			}else {
				if(a[i]>a[count]) {
					int temp = a[i];
					a[i] = a[count];
					a[count] = temp;
					i=-1;
					//count=0;
				}
			}
			count++;
		}
		
	}

}
