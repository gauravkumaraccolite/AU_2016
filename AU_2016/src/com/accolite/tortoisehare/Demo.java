package com.accolite.tortoisehare;



public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		//The join method allows one thread to wait for the completion of another. If t is a Thread object whose thread is currently executing,
		//causes the current thread to pause execution until t's thread terminates. 
		//t.join();

		
		
		// Thread Priority 0-5-10

		 Thread tortoise = new Thread(new TortoiseAndHare());
	     Thread hare = new Thread(new TortoiseAndHare());
	     Thread cheetah = new Thread(new TortoiseAndHare());
	     tortoise.setName("Tortoise");
	     hare.setName("Hare");
	     cheetah.setName("Cheetah");
	     tortoise.setPriority(10);
	     cheetah.setPriority(1);
	     hare.setPriority(5);
	     cheetah.start();
	     hare.start();
	     tortoise.start();
	     cheetah.join();

	}

}
