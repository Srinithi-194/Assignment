package com.mph.ThreadProject;

public class BankAccount {
	
	private double balance=5000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount account=new BankAccount();
		Runnable r=()->{
			account.withDraw(3000);
		};
		Thread t1=new Thread(r,"user1");
		Thread t2=new Thread(r,"user2");
		
		t1.start();
		t2.start();

	}

	private void withDraw(double amount) {
		// TODO Auto-generated method stub
		
		System.out.println(Thread.currentThread().getName()+" is running");
		synchronized (this) {
			
		if(amount>balance) {
			System.out.println("Insufficient balance");
		}
		else {
			System.out.println(Thread.currentThread().getName()+" withdrawing");
			balance-=amount;
		}
		System.out.println(balance);
		}
	}

}
