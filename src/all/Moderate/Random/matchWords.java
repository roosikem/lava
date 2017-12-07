package all.Moderate.Random;
import java.util.Scanner;

/*
 	Match words -- Google
	Question
	Does a given file name match a single - star pattern ? (Do not use regex)
    index.html matches *.html
    foo.txt does not match *.html

    matches(â€œindex.htmlâ€?, â€œ*htmlâ€?) returns true
    matches(â€œfoo.txtâ€?, â€œ*htmlâ€?) returns false
    matches(â€œcatâ€?, â€œc*tâ€?) returns true
*/

// Refernce: https://sites.google.com/site/spaceofjameschen/home/String/match-words -- google

// Assumption: No two * can be together!
public class matchWords
{
	public static boolean Matches(String text, String pattern)
    {
        if (text.isEmpty() && pattern.isEmpty())
        {
        	return true;
        }
        
        int i = 0;
        
        for ( ; i < pattern.length() && i < text.length() ; i++)
        {
            if (pattern.charAt(i) == '*')
            {
                return Matches(text.substring(i + 1), pattern.substring(i)) || Matches(text.substring(i + 1), pattern.substring(i+1));
            }

            if(text.charAt(i) != pattern.charAt(i))
            {
            	return false;
            }
        }

        if (text.length() - 1 >= i || pattern.length() - 1 >= i)
        {
        	return false;
        }

        return true;
    }
	
	public static void main(String[] args)
	{
		System.out.println("***************Match Words**************");
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String text = in.nextLine();
		System.out.println();
		System.out.print("Enter the pattern string; ");
		String pattern = in.nextLine();
		System.out.println();
		System.out.println("The pattern matches the entered text? " +Matches(text, pattern));
		in.close();
	}	
}
