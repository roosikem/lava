package java8.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteUsingBuffered {

	public static void main(String[] args)throws IOException {
		   int count = 0;
		   int totalLine=0;
	        BufferedReader br = null;
	        BufferedWriter fileWriter1 = new BufferedWriter(new FileWriter("F:\\Manish\\test1.txt"));
	        BufferedWriter fileWriter2 = new BufferedWriter(new FileWriter("F:\\Manish\\test2.txt"));

	        try {
	            String currentLine;
	            br = new BufferedReader(new FileReader("F:\\Manish\\largefile.txt"));
	            while(br.readLine() != null)totalLine++;
	            br.close();
	            br = new BufferedReader(new FileReader("F:\\Manish\\largefile.txt"));
	            while ((currentLine = br.readLine()) != null) {
	                count++;
	                if (count <= (totalLine/2)) {
	                    fileWriter1.write(currentLine + "\n");
	                    fileWriter1.newLine();
	                    fileWriter1.flush();
	                } else {
	                    fileWriter2.write(currentLine + "\n");
	                    fileWriter2.newLine();
	                    fileWriter2.flush();
	                    
	                }
	            }
	            System.out.println(totalLine/2);
	        } finally {
	            if (br != null) {
	                br.close();
	            }
	            fileWriter1.close();
	            fileWriter2.close();
	        }

	}

}
