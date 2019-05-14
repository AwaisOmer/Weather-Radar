package com.weather.pojos;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataSource {
	private String Host;
	private String Username;
	private String Password;
	
	void setHost(String host) {
		this.Host=host;
	}
	
	void setUsername(String user) {
		this.Username=user;
	}
	
	void setPassword(String pass) {
		this.Password=pass;
	}
	
	Connection getConnectin(){
		try {
			
			Driver d = (Driver)Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
			Connection con = DriverManager.getConnection( Host, Username, Password );
			return con;
		}
		
		catch(Exception e) {
			System.out.println(e);
			
		}
		return null;
		
	}
}
