package com.mphasis.MavenProject2;

public class CreditCard implements Payment {

	@Override
	public void pay(double amount) {
		if(Payment.validateAmount(amount)) {
			System.out.println("Amount Paid" + amount+"using creditcard");
			generateReceipt(amount);
		}
		else {
			System.out.println("Payment failed,Invalid amount");
		}
		
	}

}
