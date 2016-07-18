package com.accolite.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 BlockingQueue queue = new ArrayBlockingQueue(5);

	        Producer producer = new Producer(queue);
	        Consumer consumer = new Consumer(queue);

	        new Thread(producer).start();
	        new Thread(consumer).start();

	      
	}

}
