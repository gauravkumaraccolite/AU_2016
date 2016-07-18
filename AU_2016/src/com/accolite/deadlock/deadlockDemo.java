package com.accolite.deadlock;
class Account {
    double balance;
    int id;
    public Account(int id, double balance){
         this.balance = balance;
         this.id = id;
    }
    void withdraw(double amount){
         balance -= amount;
    } 
    void deposit(double amount){
         balance += amount;
    }
}

public class deadlockDemo {

	  public static void main(String [] args){
          final Account a = new Account(1,1000);
          final Account b = new Account(2,300);
          Thread a1 = new Thread(){
                public void run(){
                    transfer(a,b,200);
                    System.out.println("a1");
                }
          };
          Thread b1 = new Thread(){
                public void run(){
                    transfer(b,a,300);
                    System.out.println("b1");
                }
          };
          a1.start();
          b1.start();
    }
    public static void transfer(Account from, Account to, double amount){
         synchronized(from){
        	 	System.out.println("Enter thread"+ Thread.currentThread().getName());
              synchronized(to){
            	  System.out.println("Enter thread into "+ Thread.currentThread().getName());
                   from.withdraw(amount);
                   to.deposit(amount);
              }
         }
    }
	
	
}
