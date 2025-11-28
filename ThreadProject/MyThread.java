package com.mph.ThreadProject;

public class MyThread extends Thread{

	@Override
	public void run() {
		System.out.println(this.getName()+ " is running");
		for(int i=1;i<=5;i++) {
			System.out.println(this.getName() + "is running "+i);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread t=new MyThread();
		MyThread t1=new MyThread();
		t.start();
		t1.start();

	}

}
