package com.accolite.threadintroduction;

public class MyThreaad extends Thread {

	public void run(){
	
		System.out.println("HelloWorld");
		System.out.println(MyThreaad.currentThread().getName());
		
		
	}
	
	
}
