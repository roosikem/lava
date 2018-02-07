package com.journaldev.hibernate.main;

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
		}
		
	}

}
