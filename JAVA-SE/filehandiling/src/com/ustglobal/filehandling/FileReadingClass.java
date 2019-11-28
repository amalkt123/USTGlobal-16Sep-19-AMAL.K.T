package com.ustglobal.filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingClass {
	public static void main(String[] args) {
		String path="C:\\Users\\hp\\Desktop\\text.txt";
		FileReader reader=null;
		try {
	                reader=new FileReader(path);
	                int i= reader.read();
	                while(i!=-1) {
	           
	            char ch=(char)i;
	           
	            System.out.print(ch);
	            i= reader.read();
	          //  System.out.println(i);
	 
	                }
	}catch(IOException e) {
		e.printStackTrace();
	}
	}

}
