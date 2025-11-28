package com.mphasis.MavenProject2;

public interface Payment {
	
	public void pay(double amount);
	
	public default void generateReceipt(double amount) {
		System.out.println("Receipt generaated successfully : "+ amount);
	}
	
	public static boolean validateAmount(double amount) {
		return amount>0;
	}


}
