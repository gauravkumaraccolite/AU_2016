package com.accolite.threadintroduction;

public class IntroductionDemo {

	 public static void main(String args[]){
		MyThreaad t2 = new MyThreaad(); 
		MyThreaad t1 = new MyThreaad(); 
		t1.setName("even");
		t2.setName("Odd");
		t1.start();
		t2.start();

	 }
	
}
