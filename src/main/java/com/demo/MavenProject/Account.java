package com.demo.MavenProject;

public class Account {

	private long accNumber;
	private String accHolderName;
	private String bankName;
	private String iFSC;
	private String branchName;
	private int pin;

	

	public long getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getiFSC() {
		return iFSC;
	}

	public void setiFSC(String iFSC) {
		this.iFSC = iFSC;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}


	public Account(int accNumber, String accHolderName, String bankName, String iFSC, String branchName, int pin) {
		super();
		this.accNumber = accNumber;
		this.accHolderName = accHolderName;
		this.bankName = bankName;
		this.iFSC = iFSC;
		this.branchName = branchName;
		this.pin = generatePin();
		
	}
	
	private int generatePin() {
		int newPin = (int) Math.round(Math.random() * 10000);
		return newPin;
	}

	@Override
	public String toString() {
		return "Account [accNumber=" + accNumber + ", accHolderName=" + accHolderName + ", bankName=" + bankName
				+ ", iFSC=" + iFSC + ", branchName=" + branchName + ", pin=" + pin + "]";
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void withDraw(double amount) {
		System.out.println("Account withdraw");
	}
	
	public void deposit(double amount) {
		System.out.println("Account Deposit");
	}

	
}
