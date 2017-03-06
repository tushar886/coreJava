package com.legacyFuture;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureClient {

	public static void main(String[] args) {
		
		final ExecutorService exec = Executors.newFixedThreadPool(10);
		
		final Callable<String> slowCallable = new SlowThreadCallable();
		final Callable<String> fastCallable = new FastThreadCallable();
		
		List<Future<String>> futureList = new ArrayList<Future<String>>();
		
		for (int i = 1; i<= 10; i++) {
			
			final Future<String> futureSlow = exec.submit(slowCallable); 
			final Future<String> futureFast = exec.submit(fastCallable); 
			
			futureList.add(futureSlow);
			futureList.add(futureFast);
		}
		
		System.out.println("---------Start printing the exceutors now------------------");
		
		for (Future<String> fut : futureList) {
			
			try {
				System.out.println(new Date() + "----" + fut.get());
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("--------------All tasks executed. Shutting down the executor-------------");
		
		//gracefully shut down the executor
		exec.shutdown();
	}
}
