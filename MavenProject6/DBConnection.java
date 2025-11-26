package com.mph.MavenProject6;

public class DBConnection {
	
	private static DBConnection instance;
	
	private DBConnection() {
		System.out.println("instance created");
	}
	
	public static DBConnection getInstance() {
		
		if(instance==null) {
			instance=new DBConnection();
		}
		return instance;
	}

}
