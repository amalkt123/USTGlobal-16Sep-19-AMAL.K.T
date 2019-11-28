package com.ustglobal.jdbcapp;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.jdbc.Driver;
import java.sql.PreparedStatement;


public class ExecuteDynamicInsertQuery1 {
	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		FileReader reader=null;
		
		
		
		
		
		try {
			reader=new FileReader("db.properties");
			Properties properties=new Properties();
			properties.load(reader);
			//step1 load the driver
			//Driver driver=new Driver();
			//DriverManager.registerDriver(driver);
			Class.forName(properties.getProperty("driver-class"));
			//getting the connection
			
			String url=properties.getProperty("url");
			conn=DriverManager.getConnection(url,properties);
			
			
			//step3 issue sql query
			String qry=properties.getProperty("insert-query");
			pstmt=conn.prepareStatement(qry);
			int id=Integer.parseInt(args[0]);
			pstmt.setInt(1, id);
			
			pstmt.setString(2, args[1]);
			
			int salary= Integer.parseInt(args[2]);
			pstmt.setInt(3, salary);
			pstmt.setString(4, args[3]);
			int count=pstmt.executeUpdate();
			
			
			//step4 read the result
			
			System.out.println(count+" rows inserted ");
					
			
			
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

