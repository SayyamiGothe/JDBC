package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ScannerPrepared {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		 Connection c=DriverManager.getConnection("jdbc:oracle:thin:@192.168.31.9:1522:xe","system","Aadhar123");
		 PreparedStatement psmt=c.prepareStatement("select marks from student where rollno=?");
		 Scanner sc=new Scanner(System.in);
	  int rollno=sc.nextInt();
	  psmt.setInt(1, rollno);
	  ResultSet rs=psmt.executeQuery();
	  rs.next();
	  System.out.print(rs.getInt(1));
	}

}
