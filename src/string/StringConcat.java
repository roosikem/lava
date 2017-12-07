package string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StringConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader input;
		BufferedWriter output;
		String word, words;
		word=words="";
		String file="f:\\Manish\\Program use file\\abc.txt";
		long startTime, stopTime,duration;
		startTime=stopTime=duration=0;
		try{
			input=new BufferedReader(new FileReader(file));
			output=new BufferedWriter(new FileWriter("f:\\Manish\\Program use file\\concat.txt",true));
			startTime=System.nanoTime();
			while((word=input.readLine())!=null){
				words +=word+",";
				System.out.println(words);
				//output.write(words);
				//output.flush();
			}
			stopTime=System.nanoTime();
			duration=stopTime-startTime;
		}
		catch(IOException e){
			System.out.println(e.toString());
		}
		System.out.println("Time to concation: "+ duration);
		try{
			input=new BufferedReader(new FileReader(file));
			output=new BufferedWriter(new FileWriter("f:\\Manish\\Program use file\\concatBuilder.txt",true));
			startTime=System.nanoTime();
			StringBuffer sb=new StringBuffer();
			while((word=input.readLine())!=null){
				sb.append(word+",");
				//output.write(sb.toString());
				//output.flush();
			}
			stopTime=System.nanoTime();
			duration=stopTime-startTime;
		}
		catch(IOException e){
			System.out.println(e.toString());
		}
		System.out.println("Time to concation: "+ duration);
	}

}
