package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;

public class Preapred {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c=DriverManager.getConnection("jdbc:oracle:thin:@192.168.31.9:1522:xe","system","Aadhar123");
		PreparedStatement psmt=c.prepareStatement("insert into student values(?,?,?)");
		psmt.setInt(1, Integer.parseInt(args[0]));
		psmt.setString(2, args[1]);
		psmt.setInt(3, Integer.parseInt(args[2]));
		psmt.executeUpdate();
		System.out.print("one record inserted");
	}
}
