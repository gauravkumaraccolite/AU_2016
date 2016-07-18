package com.accolite.tortoisehare;

public class TortoiseAndHare implements Runnable {

	@Override
	public void run() {

		int distance = 0;
		while (distance != 101) {
			System.out.println("Distance :: " + distance + " By :: " + Thread.currentThread().getName());
			if (distance == 50 && Thread.currentThread().getName() == "Hare") {
				try {
					Thread.currentThread().sleep(0);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			distance++;

		}
	}
}
