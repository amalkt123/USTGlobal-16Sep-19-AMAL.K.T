package com.ustglobal.jdbcapp;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

//import com.mysql.jdbc.Driver;


public class DynamicDeleteQuery1 {
	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		FileReader reader=null;
		
		
		
		
		try {
			reader=new FileReader("db.properties");
			Properties properties=new Properties();
			properties.load(reader);
			Class.forName(properties.getProperty("driver-name"));
			//step1 load the driver
			//Driver driver=new Driver();
			//DriverManager.registerDriver(driver);
			
			//getting the connection
			
			String url=properties.getProperty("url");
			conn=DriverManager.getConnection(url,properties);
			
			
			//step3 issue sql query
			String qry=properties.getProperty("delete-query");
			pstmt=conn.prepareStatement(qry);
			pstmt.setInt(1, Integer.parseInt(args[0]));
			int count=pstmt.executeUpdate();
			
			
			//step4 read the result
			
			System.out.println(count+" row is deleted ");
					
			
			
		}
		catch(Exception e) {
			e.printStackTrace();

		}
		finally {
			
			try {
				if(pstmt!=null)
					pstmt.close();
				if(conn!=null)
					conn.close();
				if(reader!=null)
					reader.close();
				
				
			}
			catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
			}
			}
			
		}
	}

