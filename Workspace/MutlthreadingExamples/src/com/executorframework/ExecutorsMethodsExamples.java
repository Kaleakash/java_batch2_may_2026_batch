package com.executorframework;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

class Task implements Callable<Thread>{
	@Override
	public Thread call() throws Exception {
		Thread t = Thread.currentThread();
		Thread.sleep(3000);
		return t;
	}
}
public class ExecutorsMethodsExamples {

	public static void main(String[] args) throws Exception{
		//ThreadPoolExecutor tpe = new Thread
		// TODO Auto-generated method stub
		Task tt = new Task();
		//ExecutorService es = Executors.newSingleThreadExecutor();
		//ExecutorService es = Executors.newFixedThreadPool(3);
		ExecutorService es = Executors.newCachedThreadPool();
		Executor es1 = Executors.newCachedThreadPool();
//		for(int i=0;i<10;i++) {
//			 Future<Thread> ff =  es.submit(tt);
//			 System.out.println(ff.get());
//		}
		//System.out.println(es1.);
		Future<Thread> fu = es.submit(tt);
		Thread.sleep(2000);
		fu.cancel(true);
		System.out.println(fu.get());
		es.shutdown();
	
	}

}
