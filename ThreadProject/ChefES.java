package com.mph.ThreadProject;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ChefES extends Thread {

	private String order;
	public ChefES(String order) {
		// TODO Auto-generated constructor stub
		this.order=order;
	}
	
	@Override
	public void run() {
		System.out.println(getName() + " is preparing " + order);
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(getName() + " served " + order);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExecutorService manager=Executors.newFixedThreadPool(4);
		
		String[] menu= {"dhosa","biriyani","chicken curry","fried rice","curd rice","potato fry","chicken 65"};
		for(String item:menu) {
			ChefES chefThread=new ChefES(item);
			manager.submit(chefThread);
		}
		manager.shutdown();

	}

}
