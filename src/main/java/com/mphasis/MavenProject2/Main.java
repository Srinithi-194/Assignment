package com.mphasis.MavenProject2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditCard cc=new CreditCard();
		cc.pay(4500);
		
		Upi upi=new Upi();
		upi.pay(50);

		Payment pay=(amount) ->{
			if(Payment.validateAmount(amount)) {
				System.out.println("Amount paid" + amount + "using UPI");
			}
			else {
				System.out.println("Payment decline");
			}
		};
		pay.pay(100);
		
		
	}

}
