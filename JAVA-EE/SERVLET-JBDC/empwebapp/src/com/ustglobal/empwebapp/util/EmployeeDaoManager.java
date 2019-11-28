package com.ustglobal.empwebapp.util;

import com.ustglobal.empwebapp.dao.EmployeeDAO;
import com.ustglobal.empwebapp.dao.EmployeeDaojdbcimpl;

public class EmployeeDaoManager {

   private EmployeeDaoManager() {
		// TODO Auto-generated constructor stub
	}
   public static EmployeeDAO getEmployeeDAO() {
	   return new EmployeeDaojdbcimpl();
   }
}
