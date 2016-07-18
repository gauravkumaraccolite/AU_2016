package com.accolite.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

	protected BlockingQueue queue = null;

	public Consumer(BlockingQueue queue) {
		this.queue = queue;
	}

	public void run() {
		try {
			
			// consuming messages until exit message is received
			while (true) {
				int element=(int)queue.take();
				System.out.println("Consumed " + element);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
