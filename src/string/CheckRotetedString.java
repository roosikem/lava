package string;

public class CheckRotetedString {

	public static void main(String[] args) {

		System.out.println(isRoteted("abcd", "cdab"));
	}

	public static boolean isRoteted(String s1,String s2){
		if(s1.length()!=s2.length()){
			return false;
		}
		s1=s1+s1;
		return isSubString(s1, s2);
	}
	public static boolean isSubString(String s1,String s2){
		return s1.contains(s2);
	}
}
