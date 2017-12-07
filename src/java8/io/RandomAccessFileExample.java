package java8.io;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileExample {

	public static void main(String[] args) throws IOException {
	
		
		RandomAccessFile rf =new RandomAccessFile("F:\\Manish\\text1.txt", "rw");
		String name="Manish Prajapati is java Devloper";
		
		rf.writeUTF(name);
		
		rf.seek(0);
	
		rf.close();
		
    
	}

}
