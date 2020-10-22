package com.cognizant.truyum.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
public class ConnectionHandler {
	private static Connection con=null;
	public static Connection getConnection()
	{
		try 
		{
			
			FileInputStream fis=new FileInputStream("connection.properties");//check the datatype of connection.properties
			Properties props=new Properties();
			props.load(fis);
			Class.forName(props.getProperty("driver"));
			con=DriverManager.getConnection(props.getProperty("connection-url"),props.getProperty("user"),props.getProperty("password"));
		}
		catch(Exception e)
		{
			System.out.println("Connection was not Established");
		}
		return con;
	}

}
