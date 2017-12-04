package thread.common;

import java.util.concurrent.TimeUnit;

public class LoopTaskH implements Runnable {
	public static int count=0;
	public int instanceNumber=0;
	private String taskId;
	private boolean sleepInterupted = false;
	
	@Override
	public void run() {
		String currentThreadName = Thread.currentThread().getName();
		System.out.println("######["+currentThreadName+"]<"+taskId+"> STARTING #######");
		
		for(int i=10;; i++) {
			System.out.println("["+currentThreadName+"]<"+taskId+">TICK TICK "+i);
			try {
				TimeUnit.MILLISECONDS.sleep((long)Math.random()*3000);
			} catch (InterruptedException e) {
				System.out.println("######["+currentThreadName+"]<"+taskId+"> SLEEP INTERUPTED #######");
				sleepInterupted = true;
			}
			doSomeMoreWork();
			if(sleepInterupted || Thread.interrupted()) {
				System.out.println("######["+currentThreadName+"]<"+taskId+"> INTERUPTED CANCELLING #######");
				break;
			}
		}
		
		System.out.println("######["+currentThreadName+"]<"+taskId+"> DONE #######");

	}

	public void doSomeMoreWork() {
		System.out.println("######["+Thread.currentThread().getName()+"]<"+taskId+"> DOING SOME MORE WORK #######");
	}
	
	public LoopTaskH(){
		this.instanceNumber=++count;
		this.taskId = "LoopTaskH"+instanceNumber;
	}
}
