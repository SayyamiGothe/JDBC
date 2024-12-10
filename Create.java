package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Create {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c=DriverManager.getConnection("jdbc:oracle:thin:@192.168.31.9:1522:xe"
				,"system","Aadhar123");
		Statement stmt=c.createStatement();
	
		
		stmt.execute("create table student(rollno number(3), name varchar2(10), marks number(3))");
		System.out.println("table created");
	
	}
	
	

}
