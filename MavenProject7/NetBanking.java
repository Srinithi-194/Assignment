package com.mph.MavenProject7;

public class NetBanking implements Payment{
	
	private CashPayment cash=new CashPayment();

	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println("user validated and authenticated");
		System.out.println("otp verification successfull");
		System.out.println("Payment Successfull");
		cash.pay(amount);
		
	}

}
