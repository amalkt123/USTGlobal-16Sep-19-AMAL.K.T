package com.ustglobal.filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {
	public static void main(String[] args) {
		try(FileReader in=new FileReader("csv.txt");
		BufferedReader reader =new BufferedReader(in)){
			while(reader.ready())
			{
				String line=reader.readLine();
				String[] words=line.split(",");
				System.out.println("id is "+words[0]);
				System.out.println("name is "+words[1]);
				System.out.println("salary is "+words[2]);
				System.out.println("gender is "+words[3]);
			}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}

}
