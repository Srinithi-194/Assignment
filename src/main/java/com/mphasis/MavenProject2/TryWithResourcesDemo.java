package com.mphasis.MavenProject2;

public class TryWithResourcesDemo implements AutoCloseable{

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("resource closed successfully");
		
	}
	
	public static void main(String arg[]) {
//		try(TryWithResourcesDemo demo=new TryWithDemoResources())
//		{
//			
//		}
	}

}
