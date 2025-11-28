package com.mphasis.MavenProject2;

public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p=new Person("srinithi",123,17);
		System.out.println(p);
		try {
			p.checkEligibility();
		} catch (AgeNotSufficientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("application closed");

	}

}
 
