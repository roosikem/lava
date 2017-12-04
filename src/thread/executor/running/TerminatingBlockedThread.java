package thread.executor.running;

import java.util.concurrent.TimeUnit;

import thread.common.LoopTaskA;
import thread.common.LoopTaskH;

public class TerminatingBlockedThread {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("#####["+Thread.currentThread().getName()+"] Main Thread starts here ######");

		LoopTaskA task1 = new LoopTaskA();
		LoopTaskA task2 = new LoopTaskA();
		LoopTaskA task3 = new LoopTaskA();
		
		LoopTaskH task4 = new LoopTaskH();
		LoopTaskH task5 = new LoopTaskH();
		
		Thread t1 = new Thread(task1,"Thread-1");
		Thread t2 = new Thread(task2,"Thread-2");
		Thread t3 = new Thread(task3,"Thread-3");
		
		Thread t4 = new Thread(task4,"Thread-4");
		Thread t5 = new Thread(task5,"Thread-5");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		TimeUnit.MILLISECONDS.sleep(3000);
		
		System.out.println("#####["+t1.getName()+"] INTERUPTED ######");
		t1.interrupt();
		System.out.println("#####["+t2.getName()+"] INTERUPTED ######");
		t2.interrupt();
		System.out.println("#####["+t3.getName()+"] INTERUPTED ######");
		t3.interrupt();
		
		System.out.println("#####["+t4.getName()+"] INTERUPTED ######");
		t4.interrupt();
		System.out.println("#####["+t5.getName()+"] INTERUPTED ######");
		t5.interrupt();
		
		System.out.println("#####["+Thread.currentThread().getName()+"] Main Thread end here ######");
	}

}
