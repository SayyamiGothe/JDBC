package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Select {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c=DriverManager.getConnection("jdbc:oracle:thin:@192.168.31.9:1522:xe","system","Aadhar123");
		Statement stmt=c.createStatement();
		ResultSet rs=stmt.executeQuery("select * from student");
		ResultSetMetaData rm=rs.getMetaData();
		
		
		int n=rm.getColumnCount();
		for(int i=1;i<=n;i++)
		{
			System.out.print(rm.getColumnName(i)+"\t");//rm to get the name of the column
		}
		System.out.println();
		
		while(rs.next())//rs foe printing the row data
		{
			for(int i=1;i<=n;i++)
			{
				System.out.print(rs.getString(i)+"\t");
			}
			System.out.println();
			
		}
//RESUTSET is an object which encapsulates the sets of rows of the database.
		
	}

}
