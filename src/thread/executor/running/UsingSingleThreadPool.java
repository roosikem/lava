package thread.executor.running;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import thread.common.LoopTaskC;

public class UsingSingleThreadPool {

	public static void main(String[] args) {
		System.out.println("Main Thread starts here......");
		
		ExecutorService execService = Executors.newSingleThreadExecutor();
		execService.submit(new LoopTaskC());
		execService.submit(new LoopTaskC());
		execService.submit(new LoopTaskC());
		execService.submit(new LoopTaskC());
		execService.submit(new LoopTaskC());
		execService.submit(new LoopTaskC());
		execService.submit(new LoopTaskC());
		execService.submit(new LoopTaskC());
		execService.submit(new LoopTaskC());
		execService.submit(new LoopTaskC());
		execService.submit(new LoopTaskC());
		execService.submit(new LoopTaskC());
		execService.shutdown();
		System.out.println("Main Thread end here.......");
	}

}
