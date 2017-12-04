package thread.executor.running;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import thread.common.LoopTaskB;

public class UsingCachedThreadPool2 {

	public static void main(String[] args) {
		System.out.println("Main Thread starts here......");
		
		ExecutorService execService = Executors.newCachedThreadPool();
		execService.submit(new LoopTaskB());
		execService.submit(new LoopTaskB());
		execService.submit(new LoopTaskB());
		execService.submit(new LoopTaskB());
		execService.submit(new LoopTaskB());
		execService.submit(new LoopTaskB());
		execService.submit(new LoopTaskB());
		execService.submit(new LoopTaskB());
		execService.submit(new LoopTaskB());
		execService.submit(new LoopTaskB());
		execService.submit(new LoopTaskB());
		execService.submit(new LoopTaskB());
		execService.shutdown();
		System.out.println("Main Thread end here.......");
	}

}
