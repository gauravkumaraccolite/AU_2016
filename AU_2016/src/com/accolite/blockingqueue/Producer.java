package com.accolite.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

	protected BlockingQueue queue = null;

	public Producer(BlockingQueue queue) {
		this.queue = queue;
	}

	public void run() {
		for (int i = 0; i < 100; i++) {
			
			try {
				Thread.sleep(100);
				queue.put(i);
				System.out.println("Produced " + queue.peek());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
