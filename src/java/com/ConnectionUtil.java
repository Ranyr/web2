package com;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtil 
{
	static Connection con=null;
	public static Connection getConnection()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");//load driver
			System.out.println("Driver Loaded successfully");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3307/project","root","root");
			System.out.println("Connection Done");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return con;
	}

}