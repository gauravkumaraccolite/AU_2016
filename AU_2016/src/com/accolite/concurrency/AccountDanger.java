package com.accolite.concurrency;

public class AccountDanger {

	private static Account acct = new Account();

	public static void main(String[] args) {
		
		Thread one = new Thread(new Transation(acct));
		Thread two = new Thread(new Transation(acct));
		one.setName("Fred");
		two.setName("Lucy");
		one.start();
		two.start();
	}


	}


