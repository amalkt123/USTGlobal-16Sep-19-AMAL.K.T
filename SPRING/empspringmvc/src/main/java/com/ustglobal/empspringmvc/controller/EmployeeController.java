package com.ustglobal.empspringmvc.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.ustglobal.empspringmvc.dto.EmployeeBean;
import com.ustglobal.empspringmvc.service.EmployeeService;
import com.ustglobal.empspringmvc.service.EmployeeServiceImpl;

@Controller
public class EmployeeController {
	
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
		CustomDateEditor editor=new CustomDateEditor(format,true);
		binder.registerCustomEditor(Date.class,editor);
	}
	//login Page
	@Autowired
	private EmployeeService service;
	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}
	@PostMapping("/login")
	public String login(int id,String password,HttpServletRequest request) {
		EmployeeBean bean=service.login(id, password);
		if(bean==null) {
			request.setAttribute("msg","invalid Credential");
			return "login";
		}
		else {
			HttpSession session=request.getSession();
			session.setAttribute("bean", bean);
			return "home";
		}
	}//end of login
	
	
	
	//register page
	@GetMapping("/register")
	public String registerPage() {
			return "register";
	}
	
	//register
	
	@PostMapping("/register")
	public String register(EmployeeBean bean,ModelMap map) {
		int check=service.register(bean);
		if(check>0) {
			map.addAttribute("msg","you are registered sucessfully and ID is : "+check);
		}
		else {
			map.addAttribute("msg", "email is repeated");
		}
		
		return "login";
	}//end of register
	
	//home page
	@GetMapping("/home")
	public String home(@SessionAttribute(name="bean",required = false) EmployeeBean bean,ModelMap map ) {
		if(bean==null) {
			map.addAttribute("msg","Login first");
			return "login";
		}
		else {
			return "home";
		}
		
		
	}
	@PostMapping("/home")
	public String home() {
		return "home";
	}
	//end of home
	
	//search
	@GetMapping("/search")
	public String search(@RequestParam("id") int id,ModelMap map) {
		EmployeeBean bean=service.searchEmployee(id);
		if(bean==null) {
			map.addAttribute("msg","Data not found");
		}
		else {
			map.addAttribute("bean",bean);
		}
		return "home";
	}
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "login";
	}
	
	//change password page
	@GetMapping("/changepassword")
	public String changePassword(HttpServletRequest request, EmployeeBean bean,ModelMap map ) {
		
	   HttpSession session=request.getSession(false);
		System.out.println(bean);
		if(session!=null) {
		
			return "changepassword";
		}
		else {
			return "login";
		}
	}
	//change password
	@PostMapping("/changepassword")
	public String changePassword(@SessionAttribute(name = "bean")EmployeeBean bean,String password,String cpassword,ModelMap map) {
		if(password.equals(cpassword)) {
			boolean check=service.changePassword(bean.getId(), password);
			if(check) {
				map.addAttribute("msg","password changed sucessfully");
				return "home";

			}
		}
		else {
			map.addAttribute("msg","invalid password");

		}
		return "changepassword";

	}
	//change password end
	
	//update profile page
	@GetMapping("/update")
	public String updateProfile(HttpServletRequest request,ModelMap map ) {
		HttpSession session=request.getSession(false);
		if(session!=null) {
		
			return "update";
		}
		else {
			map.addAttribute("msg","login first");
			return "login";
		}
	}
	
	
	//update profile
	@PostMapping("/update")
	public String updateProfile(HttpSession session,EmployeeBean employeeBean,ModelMap map) {
			EmployeeBean bean=(EmployeeBean)session.getAttribute("bean");
			employeeBean.setId(bean.getId());
			employeeBean.setPassword(bean.getPassword());
		
			boolean check=service.updateEmployee(employeeBean);
			if(check) {
				map.addAttribute("msg","profile updated sucessfully");
				session.setAttribute("bean", employeeBean);
				System.out.println("update 12333344"+bean);
				return "home";

			}
		
		else {
			map.addAttribute("msg","not updated sucessfully");

		}
		return "updateprofile";
	}
	
	//delete
	@GetMapping("/delete")
	public String deleteProfile(HttpSession session,ModelMap map) {
		EmployeeBean bean=(EmployeeBean)session.getAttribute("bean");
		
		boolean check=service.deleteEmployee(bean.getId());
		if(check) {
			try {
		session.invalidate();
		map.addAttribute("msg","profile deleted sucessfully");
		return "login";
			}	
		catch (Exception e) {
			map.addAttribute("msg","profile deleted unsucessfully");
			return "home";
			// TODO: handle exception
		}
		}
		else {
			map.addAttribute("msg","profile deleted unsucessfully");
			return "home";
		}
	
	
	}
		
    
}
