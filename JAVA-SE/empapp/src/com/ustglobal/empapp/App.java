package com.ustglobal.empapp;
 import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.ustglobal.empapp.dao.EmployeeDAO;
import com.ustglobal.empapp.dao.EmployeeDAOImpl;
import com.ustglobal.empapp.dto.EmployeeBean;
import com.ustglobal.empapp.utill.EmployeeManager;

public class App {
public static void main(String[] args) {
	boolean decision=true;
	while(decision) {
	
	System.out.println("press 1 to get all employee details");
	System.out.println("press 2 to insert employee data");
	System.out.println("press 3 to update employee data");
	System.out.println("press 5 to search single employee");
	
	
	Scanner sc=new Scanner(System.in);
	int ch=sc.nextInt();
	int id=0;
	
	switch(ch) {
	case 1:
		          EmployeeDAO dao=EmployeeManager.getEmployeeDAO();
	        	 List<EmployeeBean> l= dao.getAllEmployeeData();
	        	 if(l!=null) {
	        	 for (Iterator iterator = l.iterator(); iterator.hasNext();) {
					EmployeeBean employeeBean = (EmployeeBean) iterator.next();
					
					System.out.println("id is "+employeeBean.getId());
					System.out.println("name is "+employeeBean.getName());
					System.out.println("name is "+employeeBean.getSal());
					System.out.println("salary is "+employeeBean.getGender());
					
					
				}
	        	 
	        	 }
	        	 else {
	        		 System.out.println("-------------------------no data--------------------");
	        	 }
		          break;
		          
	case 5:       
		          EmployeeDAO dao5=EmployeeManager.getEmployeeDAO();
	              System.out.println("enter id");
	               id=sc.nextInt();
	              
	              EmployeeBean bean=dao5.searchEmployeeData(id);
	             if(bean!=null) {
	            	  System.out.println("id is "+bean.getId());
	            	  System.out.println("name is "+bean.getName());
	            	  System.out.println("salary is "+bean.getSal());
	            	  System.out.println("gender is "+bean.getGender());
	                }
	             else {
	            	 System.out.println("-----------------------no data---------------------");
	             }
	             break;
	case 4:
		          EmployeeDAO dao4=EmployeeManager.getEmployeeDAO();
		          System.out.println("enter id");
	               id=sc.nextInt();
		          int count=dao4.deleteEmployeeData(id);
		          System.out.println(count+" Row(s) Deleted");
		          break;
	case 2:         
		         EmployeeDAO dao2=EmployeeManager.getEmployeeDAO();
		           EmployeeBean bean2=new EmployeeBean();
		           System.out.println("enter id");
		           bean2.setId(sc.nextInt());
		           System.out.println("enter name");
		           bean2.setName(sc.nextLine());
		           System.out.println("enter salary");
		           bean2.setSal(sc.nextInt());
		           System.out.println("enter gender");
		           bean2.setGender(sc.next());
		        count= dao2.insertEmployeeData(bean2);
		           
                    System.out.println(count+" Row(s) Inserted");
                    break;
                     
		
	case 3:
		 EmployeeDAO dao3=EmployeeManager.getEmployeeDAO();
		      EmployeeBean bean3=new EmployeeBean();
              System.out.println("enter id");
              bean3.setId(sc.nextInt());
              System.out.println("enter name");
              bean3.setName(sc.nextLine());
              System.out.println("enter salary");
              bean3.setSal(sc.nextInt());
             System.out.println("enter gender");
             bean3.setGender(sc.next());
           count= dao3.insertEmployeeData(bean3);
         
          System.out.println(count+" Row(s) Updated");
		
		
	default: 
		
		        System.out.println("***********************************************************************");
		
		         decision=false;	
	}
	
	}
	
	
}//end of main
}//end of app
