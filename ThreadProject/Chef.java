package com.mph.ThreadProject;

public class Chef extends Thread{
	
	private final String[] orders;
	public Chef(String... orders) {
		this.orders=orders;
	}
	
	@Override
	public void run() {
		for(String item:orders) {
			System.out.println(getName()+" is preparing " + item);
			
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println(getName() + " got interrupted ");
			}
			System.out.println(getName() + " served " +item);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Chef c1=new Chef("dhosa","biriyani");
		Chef c2=new Chef("chicken curry","fried rice");
		Chef c3=new Chef("curd rice","potato fry");
		Chef c4=new Chef("rice","mutton curry");
		
		c1.setName("chef-1");
		c2.setName("chef-2");
		c3.setName("chef-3");
		c4.setName("chef-4");
		
		c1.start();
		c2.start();
		c3.start();
		c4.start();
		
		c1.join();
		c2.join();
		c3.join();
		c4.join();
		
		
	}

}
