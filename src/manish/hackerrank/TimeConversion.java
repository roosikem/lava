package manish.hackerrank;

import java.util.Scanner;

public class TimeConversion {
	 static String timeConversion(String s) {
	        String[] ta = s.split(":");
	        String hours = ta[0];
	        String min = ta[1];
	        String sec = ta[2].substring(0,2);
	        int tempHours;
	        
	        if(ta[2].substring(2,4).equalsIgnoreCase("PM")){
	            if(Integer.parseInt(hours) < 12){
	                tempHours = Integer.parseInt(hours);
	                tempHours +=12;
	                hours = Integer.toString(tempHours);
	                
	            }
	        }
	        if(ta[2].substring(2,4).equalsIgnoreCase("AM")){
	            if(Integer.parseInt(hours) == 12){
	                tempHours = Integer.parseInt(hours);
	                tempHours +=12;
	                hours = "00";
	            }
	        }
	        
	        return hours+":"+min+":"+sec;
	        
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String s = in.next();
	        String result = timeConversion(s);
	        System.out.println(result);
	    }
}
