package manish.hackerrank;

import java.util.Scanner;

public class BirthdayCakeCandles {

	static int birthdayCakeCandles(int n, int[] ar) {
        int tallest = 0;
        int frequency = 0;
        
        
        for(int i=0; i < n; i++){
            int height = ar[i];
            
            if(height > tallest){
                tallest = height;
                frequency = 1;
            }
            else if(height == tallest) frequency++;
        }
        return frequency;
    }
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
