package com.ustglobal.jdbcapp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class InsertWithCSVFile {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=mysql";
		String sql="insert into employee_info values(?,?,?,?)";
		try(FileReader in=new FileReader("csv.txt");
				
			BufferedReader reader=new BufferedReader(in);
				Connection conn=DriverManager.getConnection(url);
				PreparedStatement pstmt=conn.prepareStatement(sql)){
			
			while(reader.ready()) {
				String line=reader.readLine();
				String datas[]=line.split(",");
				pstmt.setInt(1, Integer.parseInt(datas[0]));
				pstmt.setString(2, datas[1]);
				pstmt.setInt(3, Integer.parseInt(datas[2]));
				pstmt.setString(4, datas[3]);
			    pstmt.addBatch();		
			}
			int []counts=pstmt.executeBatch();
			System.out.println(counts.length+" Row(s) Inserted");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}