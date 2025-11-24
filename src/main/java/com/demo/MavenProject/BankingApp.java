package com.demo.MavenProject;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class BankingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SavingAccount sa=new SavingAccount(3458,"Srinithi","ICICI","ICIC01","Porur",100000.0);
		System.out.println(sa);
		sa.withDraw(40000);
		sa.deposit(50000);
		System.out.println(sa.checkBalance());
		System.out.println(sa);
		
		
		
		
		
		

	}

}
