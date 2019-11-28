package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;;

public class UpdateWithTryResources {
	public static void main(String[] args) {

		try(FileReader reader=new FileReader("db.properties")){
			Properties properties=new Properties();
			properties.load(reader);
			Class.forName(properties.getProperty("driver-class"));
			try(Connection conn=DriverManager.getConnection(properties.getProperty("url"),properties);
					PreparedStatement pstmt=conn.prepareStatement(properties.getProperty("update-query"));
					){   
                       pstmt.setInt(4, Integer.parseInt(args[0]));
                       pstmt.setString(1, args[1]);
                       pstmt.setInt(2, Integer.parseInt(args[2]));
                       pstmt.setString(3, args[3]);
                      int count= pstmt.executeUpdate();

                       System.out.println(count+" row is updated");

				
			}


			catch (Exception e) {
				e.printStackTrace();
			}

	}catch (Exception e) {

		e.printStackTrace();
		}
	}
		
	}



