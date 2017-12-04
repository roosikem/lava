package thread.executor.running;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import thread.common.LoopTaskA;

public class UsingFixedThreadPool {

	public static void main(String[] args) {
		System.out.println("Main Thread starts here......");
		
		ExecutorService execService = Executors.newFixedThreadPool(3);
		execService.submit(new LoopTaskA());
		execService.submit(new LoopTaskA());
		execService.submit(new LoopTaskA());
		execService.submit(new LoopTaskA());
		execService.submit(new LoopTaskA());
		execService.submit(new LoopTaskA());
		
		execService.shutdown();
		execService.submit(new LoopTaskA());
		System.out.println("Main Thread end here.......");
	}

}
