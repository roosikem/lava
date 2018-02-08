package com.example.web.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadFile implements Runnable{

	private int end;
	private int start;
	private String[] directory;
	
	public ReadFile(int start, int end, String[] directory){
		this.end =end;
		this.start = start;
		this.directory = directory;
	}
	
	public void run() {
		for(int i = start; i<end;i++){
			System.out.println(directory[i]);
			FileInputStream Fread=null;
			 FileOutputStream Fwrite =null;
			try {
				File yourFile = new File("D:/Test2/"+directory[i]);
				yourFile.createNewFile();
				Fread = new FileInputStream("D:/Test/"+directory[i]);
				Fwrite=new FileOutputStream(yourFile,false) ; 
		            System.out.println("File is Copied"); 
		            int c; 
		            while((c=Fread.read())!=-1) 
		            Fwrite.write((char)c); 
		            Fread.close(); 
		            Fwrite.close(); 
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					Fread.close();
					Fwrite.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
	           
			}
           
		}
		
	}

}
