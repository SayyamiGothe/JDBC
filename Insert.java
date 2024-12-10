package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
 Class.forName("oracle.jdbc.driver.OracleDriver");
 Connection c=DriverManager.getConnection("jdbc:oracle:thin:@192.168.31.9:1522:xe","system","Aadhar123");
 Statement stmt=c.createStatement();
 stmt.executeUpdate("insert into student values(2,'sammmmmm', 28)");
		 System.out.println("One Record Inserted Successfully");

}
}