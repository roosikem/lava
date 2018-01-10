package java8String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class CheckPalindrome {
	private static final String dictpath = "f:/Hibernate Interview Question.txt";
    public static boolean checkPalindromeUsingStack(String inputString) {
        boolean isPalindrome = true;
        Stack<Character> tempStack = new Stack<Character>();
        int i, j = 0;
        if (inputString.length() % 2 == 0) {
            i = inputString.length() / 2 - 1;
            j = i + 1;
        } else {
            i = inputString.length() / 2;
            j = i;
        }
        char[] stringArray = inputString.toCharArray();
        if (stringArray[i] != stringArray[j]) {
            isPalindrome = false;
            return isPalindrome;
        }
        for (int k = 0; k < i; k++) {
            tempStack.push(stringArray[k]);
        }
        for (int l = j + 1; l < inputString.length(); l++) {
            if (stringArray[l] == tempStack.pop()) {
                continue;
            } else {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }

    public static boolean checkPalindromeUsingReversal(String inputString) {
        String reverseString = new StringBuilder(inputString).reverse().toString();
        return reverseString.equals(inputString);
    }
    
    public static void main(String[] args){
    	 //String path = new File("").getAbsoluteFile().getAbsolutePath() + "\\" + filePath;
         // try-with-resources. We dont have to explicitly close the file using finally block.
    	//  Path dict = Paths.get(dictpath);
    	Long start=System.currentTimeMillis();
         try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(CheckPalindrome.class.getResourceAsStream("largefile.txt")))) {
        	 String line;
             String token;
             while ((line = bufferedReader.readLine()) != null) {
                 StringTokenizer tokenizer = new StringTokenizer(line, " ().\"");
                 while (tokenizer.hasMoreTokens()) {
                     token = tokenizer.nextToken();
                   checkPalindromeUsingStack(token);
                 }
             }
         } catch (IOException e) {
             e.printStackTrace();
         }
    	
    	//checkPalindromeUsingReversal("abcdftghdyghsfdg");
    	System.out.println(System.currentTimeMillis()-start);
    }
}

