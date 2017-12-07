package java8.io;

import java.io.RandomAccessFile;

public class RandomAccess3Write {

	public static void main(String[] args) {
		String data="world";
		int i=32;
		try(RandomAccessFile rf =new RandomAccessFile("F:\\Manish\\text1.txt", "rw");){
			rf.seek(8);
			String remaining=rf.readLine();
			rf.seek(8);
			rf.write(i);
			rf.writeBytes(data);
			rf.writeUTF(remaining);
			
		}catch(Exception e){
			
		}

	}

}
