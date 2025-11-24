package com.demo.MavenProject;

public class SavingAccount extends Account{
	
	private double balance;

	

	public SavingAccount(long accNumber, String accHolderName, String bankName, String iFSC, String branchName,
			double balance) {
		super(
				);
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "SavingAccount [balance=" + balance + ", AccNumber=" + getAccNumber() + ", BankName="
				+ getBankName() + ", iFSC=" + getiFSC() + ", BranchName=" + getBranchName() + ", Pin="
				+ getPin() + ", String=" + super.toString() + ", AccHolderName=" + getAccHolderName() + "]";
	}

	public void withDraw(double amount)
	{
		if(amount<this.balance) {
			this.balance=this.balance-amount;
			System.out.println("Withdraw Successfull");
		}
		else
		{
			System.out.println("Insufficient balance");
		}
	}
		
		public void deposit(double amount){
			this.balance=this.balance+amount;
			System.out.println("Deposited Successfully");
		}
		public double checkBalance() {
			return this.getBalance();
		}

}
