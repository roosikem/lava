package java8.io;

import java.io.File;

public class CountFile {

	public static void main(String[] args) {
		int count=0;
		int dirCount=0;
		File f=new File("F:\\");

		String[] file=f.list();
		for(String s:file){
			File f1=new File(f,s);
			if(f1.isFile()){
			count++;
			System.out.println(s);
		  }
			if(f1.isDirectory()){
				dirCount++;
				System.out.println("Directory "+s);
			}
		}
		System.out.println("total no of file "+count);
		System.out.println("total no of directory "+count);
	}

}
