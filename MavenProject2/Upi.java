package com.mphasis.MavenProject2;

public class Upi implements Payment {

	@Override
	public void pay(double amount) {
		if (Payment.validateAmount(amount)) {
			System.out.println("Amount Paid" + amount + "uding creditcard");
			generateReceipt(amount);
		} else {
			System.out.println("Payment failed,Invalid amount");
		}

	}
	
	@Override
	public void generateReceipt(double amount){
		Payment.super.generateReceipt(amount);
		System.out.println("Thank you for using UPI");
		
	}

}
