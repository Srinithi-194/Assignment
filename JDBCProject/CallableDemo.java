
package com.mph.JDBCProject;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class CallableDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

Class.forName("com.mysql.cj.jdbc.Driver");
        
        
        String uname="root";
        String pwd="root@39";
        String url="jdbc:mysql://localhost:3306/mph";
        
        Connection conn=DriverManager.getConnection(url,uname,pwd);
        CallableStatement cs=conn.prepareCall("{call printNumsrepeat()}");
        ResultSet rs= cs.executeQuery();
        System.out.println(rs.getInt(1));
	}

}

