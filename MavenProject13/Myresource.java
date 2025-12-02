package com.mph.MavenProject13;

public class Myresource implements AutoCloseable {

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Resource Closed");
	}
	
	public static void main(String[] args) throws Exception {
		
		Myresource rs=getResource();
		System.out.println(rs.hashCode());
		System.out.println("requesting gc");
		System.gc();
		
	}
	public static Myresource getResource() throws Exception {
		try(Myresource resource=new Myresource();){
			System.out.println("resource using");
			return resource;
		}
		
	}

}
