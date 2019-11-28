package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;;

public class DeleteWithTryResources {
	public static void main(String[] args) {

		try(FileReader reader=new FileReader("db.properties")){
			Properties properties=new Properties();
			properties.load(reader);
			Class.forName(properties.getProperty("driver-class"));
			try(Connection conn=DriverManager.getConnection(properties.getProperty("url"),properties);
					PreparedStatement pstmt=conn.prepareStatement(properties.getProperty("delete-query"));
					){   
                       pstmt.setInt(1, Integer.parseInt(args[0]));
                      
                      int count= pstmt.executeUpdate();

                       System.out.println(count+" row is deleted");

				
			}


			catch (Exception e) {
				e.printStackTrace();
			}

	}catch (Exception e) {

		e.printStackTrace();
		}
	}
		
	}



