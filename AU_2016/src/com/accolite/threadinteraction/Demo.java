package com.accolite.threadinteraction;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> taskQueue = new ArrayList<Integer>();
	      int MAX_CAPACITY = 5;
	      Thread tProducer = new Thread(new Producer(taskQueue, MAX_CAPACITY), "Producer");
	      Thread tConsumer = new Thread(new Consumer(taskQueue), "Consumer");
	      tProducer.start();
	      tConsumer.start();
		
	}

}
