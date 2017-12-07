package string;

public class CheckStringSubSequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String s1="Manish";
		String s2="anishM";
		System.out.println(s1.contains(s2));
       System.out.println(checkStringSubsequence("Manish", "anish"));
	}
	
	public static boolean checkStringSubsequence(String parentString,String childString){
		if (childString.isEmpty() || parentString.isEmpty() || childString.length() > parentString.length()) {
            return false;
        }
		
		for(int i=0;i<parentString.length();i++){
			if(parentString.charAt(i)==childString.charAt(0)){
				childString=childString.substring(1,childString.length());
			}
			if(childString.isEmpty()){
				return true;
			}
		}
		return false;
	}

}
