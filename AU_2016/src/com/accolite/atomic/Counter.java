package com.accolite.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter extends Thread {
	int counter;
	AtomicInteger atomicCounter= new AtomicInteger(0) ;

	public void run(){
		for (int i = 0; i < 100; i++) {
			counter=counter+1;
			System.out.println("Atomic Counter:  " +atomicCounter.incrementAndGet());
			System.out.println("Counter : "+ counter);
			
		}
		
		
		
	}
	
	
	
}
