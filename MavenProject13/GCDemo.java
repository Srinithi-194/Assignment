package com.mph.MavenProject13;

public class GCDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		Test test=new Test();
		test=null;
		System.out.println("GC requested manually");
		System.gc();
		Runtime.getRuntime().gc();
		
		Thread.sleep(700);
		System.out.println("Completed");
	}

}

class Test{
	
	@Override
	protected void finalize() throws Throwable{
		System.out.println("Garbage collected");
	}
	
}
