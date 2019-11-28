package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;;

public class SelectWithTryResources {
	public static void main(String[] args) {

		try(FileReader reader=new FileReader("db.properties")){
			Properties properties=new Properties();
			properties.load(reader);
			Class.forName(properties.getProperty("driver-class"));
			try(Connection conn=DriverManager.getConnection(properties.getProperty("url"),properties);
					Statement statement=conn.createStatement();
					ResultSet rs=statement.executeQuery(properties.getProperty("select-query"))
					){   




				while(rs.next()) {

					System.out.println("id is "+rs.getInt("id"));

					System.out.println("name is "+rs.getString("name"));

					System.out.println("salary is "+rs.getInt("salary"));

					System.out.println("gender is "+rs.getString("gender"));
				}
			}


			catch (Exception e) {
				e.printStackTrace();
			}

	}catch (Exception e) {

		e.printStackTrace();
		}
	}
		
	}



