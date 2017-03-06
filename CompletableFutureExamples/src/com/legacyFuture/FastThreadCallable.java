package com.legacyFuture;

import java.util.concurrent.Callable;

public class FastThreadCallable implements Callable<String> {

	@Override
	public String call() throws Exception {
		Thread.sleep(2000);
		return Thread.currentThread().getName() + " Fast Thread";
	}
}
