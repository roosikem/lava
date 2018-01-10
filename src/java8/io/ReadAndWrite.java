package java8.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadAndWrite {

	public static void main(String[] args)throws IOException {
		   int count = 0;
	        BufferedReader br = null;
	        FileWriter fileWriter1 = new FileWriter("F:\\Manish\\test1.txt");
	        FileWriter fileWriter2 = new FileWriter("F:\\Manish\\test2.txt");

	        try {
	            String currentLine;
	            br = new BufferedReader(new FileReader("F:\\Manish\\largefile.txt"));
	            while ((currentLine = br.readLine()) != null) {
	                count++;
	                if (count <= 5) {
	                    fileWriter1.write(currentLine + "\n");
	                } else {
	                    fileWriter2.write(currentLine + "\n");
	                    
	                }
	            }
	        } finally {
	            if (br != null) {
	                br.close();
	            }
	            fileWriter1.close();
	            fileWriter2.close();
	        }

	}

}
