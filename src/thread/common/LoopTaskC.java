package thread.common;

import java.util.concurrent.TimeUnit;

public class LoopTaskC implements Runnable {
	public static int count=0;
	public int id=0;
	@Override
	public void run() {
		System.out.println("######<TASK- "+id+"> STARTING #######");
		
		for(int i=10; i>0; i--) {
			System.out.println("<TASK-"+id+">TICK TICK "+i);
			try {
				TimeUnit.MILLISECONDS.sleep((long)Math.random()*1000000000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("######<TASK- "+id+"> DONE #######");

	}

	public LoopTaskC(){
		this.id=++count;
	}
}
