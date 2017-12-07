package java8String;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Stack;
import java.util.stream.Stream;

import java8Stream.CollectorsExample;

public class TestPalindrome {

	private static final String dictpath = "f:/Hibernate Interview Question.txt";

    public static void main(String[] args) throws Exception {
        long starttime = System.currentTimeMillis();
        try (BufferedReader br=new BufferedReader(new InputStreamReader(TestPalindrome.class.getResourceAsStream("largefile.txt")));
    			Stream<String> wordStream=br.lines();){
        	/*Path dict = Paths.get(dictpath);
        	Stream<String> wordStream = Files.lines(dict);*/
        long palindrome = wordStream
                .filter(TestPalindrome::isPalindrome ) // find all palindromes
                .peek(System.out::println) .count(); // write each match 
                // terminal - return a count
  
        System.out.println("Count of palindromes: "+palindrome);
        System.out.println("Total time elapsed = "+
                (System.currentTimeMillis() - starttime)+" milliseconds");
        }catch(Exception e){
        	e.printStackTrace();
        }
    }
    
    private static boolean isPalindrome(String word) {
    	return checkPalindromeUsingStack(word);
      //  boolean isEven = word.length() % 2 == 0;
        //return isPalindrome(word, isEven, isEven ? 0 : 1);
    }
    
    private static boolean isPalindrome(String word, boolean isEven, int offset) {
        int midpoint = word.length() / 2;
        if (offset > midpoint + (isEven ? -1 : 0) ) {
            return true;
        } 
        char xchar = word.charAt(midpoint - offset + (isEven ? -1 : 0));
        char ychar = word.charAt(midpoint + offset);
        if (xchar != ychar) {
            return false;
        }
        return isPalindrome(word, isEven, offset + 1);
    }
    
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

}
