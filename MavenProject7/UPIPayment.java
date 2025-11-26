package com.mph.MavenProject7;

public class UPIPayment implements Payment{
	
	private CashPayment cash=new CashPayment();

	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println("NetBanking");
		System.out.println("User validated");
		System.out.println("OTP verification done");
		System.out.println("Payment Successfull");
		cash.pay(amount);
		
	}

}
