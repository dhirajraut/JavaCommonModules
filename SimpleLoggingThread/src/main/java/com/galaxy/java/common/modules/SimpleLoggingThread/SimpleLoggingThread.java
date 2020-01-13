package com.galaxy.java.common.modules.SimpleLoggingThread;

public class SimpleLoggingThread implements Runnable {

	private int counterInSeconds;

	public SimpleLoggingThread(int counterInSeconds) {
		this.counterInSeconds = counterInSeconds;
	}

	public void run() {
		try {
			for (; counterInSeconds > 0; counterInSeconds--) {
				System.out.println(Thread.currentThread().getId() + " " + Thread.currentThread().getName() + ": Counter " + counterInSeconds);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
