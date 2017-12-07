package java8Stream;

import java.io.File;
import java.io.FileFilter;

public class FirstLambda {

	
	public static void main(String[] args) {
		/*FileFilter filter=new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				// TODO Auto-generated method stub
				return pathname.getName().endsWith(".txt");
			}
		};*/
		FileFilter filterLamda=(File pathname)->pathname.getName().endsWith(".txt");
		
		File dir=new File("F:/");
		File[] files=dir.listFiles(filterLamda);
		for(File f:files){
			System.out.println(f);
		}
	}
}
