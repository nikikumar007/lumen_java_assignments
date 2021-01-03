package com.training.util;
import java.sql.Connection;
import java.sql.DriverManager;
public class DbConnectionUtil {
 
	private static final String url = "jdbc:mysql://localhost:3306/contactsdata";
    private static final String user = "root";
    private static final String password = "nikhil95"; 
   
	public static Connection getMySqlConnection()
	{
	
		//String fileName="DbConnection.properties";
		Connection con = null;
		try {
		//	InputStream inStream=DBConnectionUtils.class.getClassLoader().getResourceAsStream(fileName);
		//	Properties props=new Properties();
		//	props.load(inStream);
//			con=DriverManager.getConnection(
//					props.getProperty("datasource.url"),
//					props.getProperty("datasource.username"),
//	                props.getProperty("datasource.password")
//	                );
			
			 Class.forName("com.mysql.cj.jdbc.Driver");
	            con = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}


