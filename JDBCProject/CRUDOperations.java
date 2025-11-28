package com.mph.JDBCProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUDOperations {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");
        
        
        String uname="root";
        String pwd="root@39";
        String url="jdbc:mysql://localhost:3306/mph";
        
        try(
        Connection conn=DriverManager.getConnection(url,uname,pwd);
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("select * from department");){
        	
        	String query="insert into department values(?,?,?)  ";
        	PreparedStatement ps=conn.prepareStatement(query);
        	ps.setInt(1, 104);
        	ps.setString(2, "Sales");
        	ps.setString(3, "Mangalore");
        	
        	
        	int i=ps.executeUpdate();
        	System.out.println("row inserted successfully");	
        	
        }catch(Exception e) {
        	e.printStackTrace();
        }

	}

}
