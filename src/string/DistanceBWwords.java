package string;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DistanceBWwords {

	public static void main(String[] args) {
		try(BufferedReader br=new BufferedReader(new InputStreamReader(DistanceBWwords.class.getResourceAsStream("largefile.txt")))){
			int distance=distanceBWwords(br, "Java", "thread");
			System.out.println(distance);
		}catch(Exception e){
			e.printStackTrace();
		}

	}
	
	public static int distanceBWwords(BufferedReader br,String pair1,String pair2) throws Exception{
		 if ( pair1.isEmpty() || pair2.isEmpty()) {
	            return -1;
	        }
	        if (pair1.equals(pair2)) {
	            return 0;
	        }
	        String line;
		    String word;
		int distance=0, globalDistance=Integer.MAX_VALUE;
		while((line=br.readLine())!=null){
			StringTokenizer token=new StringTokenizer(line," ");
			while(token.hasMoreTokens()){
				word=token.nextToken();
				if(word.equals(pair1)){
					distance=0;
				}else if(word.equals(pair2)){
					globalDistance=Math.min(distance, globalDistance);
				}
				distance++;
			}
		}
		if(globalDistance==Integer.MAX_VALUE || globalDistance==0){
			return -1;
		}else{
			return globalDistance;
		}
		
	}

}
