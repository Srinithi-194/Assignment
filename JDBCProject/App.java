package com.mph.JDBCProject;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded");
        
        String uname="root";
        String pwd="root@39";
        String url="jdbc:mysql://localhost:3306/mph";
        
        try(
        Connection conn=DriverManager.getConnection(url,uname,pwd);
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("select * from Employee");		
        ){
        	 ResultSetMetaData rsmd=rs.getMetaData();
             int columnsCount=rsmd.getColumnCount();
             
             for(int i=1;i<=columnsCount;i++) {
            	 System.out.println(rsmd.getColumnName(i));
             }
        while(rs.next()) {
//        	System.out.println("empid "+rs.getInt(1));
//        	System.out.println("empname "+rs.getString(2));
//        	System.out.println("mobile "+rs.getString(3));
//        	System.out.println("address "+rs.getString(4));
//        	System.out.println("deptid "+rs.getInt(5));
        	for(int i=1;i<=columnsCount;i++) {
        		System.out.println(rsmd.getColumnName(i) + " : " + rs.getString(rsmd.getColumnName(i)));
        	}
        }
        	DatabaseMetaData dbmd=conn.getMetaData();
        	System.out.println(dbmd.getDatabaseProductName());
        	ResultSet rs1=dbmd.getTables(null, null, "%", new String[] {"TABLE"});
        	while(rs1.next()) {
        		System.out.println(rs1.getString("TABLE_NAME"));
        	}
        	rs1.close();
        }
        catch(Exception e) {
        	e.printStackTrace();
        }
//        rs.close();
//        st.close();
//        conn.close();
    }
}
