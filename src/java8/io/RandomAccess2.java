package java8.io;

import java.io.RandomAccessFile;

public class RandomAccess2 {

	public static void main(String[] args) {
		
		
		try(RandomAccessFile rf =new RandomAccessFile("F:\\Manish\\text1.txt", "rw");){
			//System.out.println(rf.readLine());
			
			rf.seek(8);
			
			//System.out.println(rf.readLine());
			int c=0;
			while((c=rf.read())!=-1){
				System.out.print((char)c);
			}
		}catch(Exception e){
			
		}

	}

}
