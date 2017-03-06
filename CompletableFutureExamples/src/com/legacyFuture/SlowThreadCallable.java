package com.legacyFuture;

import java.util.concurrent.Callable;

public class SlowThreadCallable implements Callable<String> {

	@Override
	public String call() throws Exception {
        
		Thread.sleep(4000);
		return Thread.currentThread().getName() + " Slow Thread";
	}
}
