package string;

public class LengthOfString {

	public static void main(String[] args) {

		int length=lengthOfString("Manish");
		System.out.println("Manish".length());
		System.out.println(length);
	}

	public static int lengthOfString(String s){
		int i=0;
		try{
			for(i=0;;i++){
				s.charAt(i);
			}
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("length is");
		}
		
		return i;
	}
}
