package com.example.web.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestFileUsingThead {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		File f = new File("D:/Test");
		String[] directory = f.list();
		List<String> arrayList = Arrays.asList(directory);
		
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> number = new ArrayList<Integer>();
		for (int start = 0; start < arrayList.size(); start += 1000) {
	        int end = Math.min(start + 1000, arrayList.size());
	        List<String> sublist = arrayList.subList(start, end);
	        list.add(sublist.size());
	    }
		
		for(int i=0;i<list.size();i++){
			if(i==0){
				number.add(list.get(i));
			}else if(i == list.size() -1){
				number.add(list.get(i)+number.get(i-1));
			}else {
				number.add(list.get(i)+number.get(i-1));
			}
		}
		long startTime = System.currentTimeMillis();
		ExecutorService executor = Executors.newFixedThreadPool(number.size());
		for(int j = 0; j<number.size();j++){
			if(j==0){
				ReadFile f1 = new ReadFile(0,number.get(j)-1,directory);
				executor.execute(f1);
			}else if(j == number.size() -1){
				ReadFile f1 = new ReadFile(number.get(j-1),number.get(j)-1,directory);
				executor.execute(f1);
				//System.out.println(number.get(j));
			}
			
			else{
				ReadFile f1 = new ReadFile(number.get(j),number.get(j+1)-1,directory);
				executor.execute(f1);
			}
			
		}
		
		executor.shutdown();
        while (!executor.isTerminated()) {
        }
        System.out.println("Finished all threads");
        
        System.out.println(System.currentTimeMillis()-startTime);
	}
	
	 
	 
	 

}
