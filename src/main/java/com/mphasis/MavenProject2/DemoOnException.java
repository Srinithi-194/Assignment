package com.mphasis.MavenProject2;

public class DemoOnException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=5;
		int b[]= {2,3,4,5};
		String str=null;
		try {
			System.out.println(str.charAt(5));
		}
		catch(NullPointerException ae) {
			ae.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException aeb) {
			aeb.printStackTrace();
		}
		catch(RuntimeException re) {
			re.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Application Closed Successfully");

	}

}
