package com.ustglobal.springmvc.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ustglobal.springmvc.beans.Employee;

@Controller
public   class HelloController {
	//date
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
		CustomDateEditor editor=new CustomDateEditor(format,true);
		binder.registerCustomEditor(Date.class,editor);
	}
	
	
	
	
	@RequestMapping(path = "/hello")//by using @RequestMapping annotation we can make a method as servlet
	public String hello(@RequestParam("name") String name,
			            @RequestParam("id") int id,//spring will automatcally convert in into corresponding type
			            ModelMap map) {
		
		map.addAttribute("name",name);
		map.addAttribute("id",id);
		
		map.addAttribute("msg","Hello World");
		
		map.addAttribute("request","ModelMap is same as HttpServletRequest");
		//return "WEB-INF/view/index.jsp"; if you are not provide InternalResourceViewResolver prefix and suffix property in root-servlet.xml
		return "index";
	}

	
	
	@RequestMapping(path = "/hai/{name}/{id}")//to send value in path
	public String hello(@PathVariable("name")String name,
			            @PathVariable("id") int id,
			            HttpServletRequest request) {
		request.setAttribute("name",name);
		request.setAttribute("id",id);
		request.setAttribute("request","ModelMap is same as HttpServletRequest");
	
		return "index";
	}
	
	
	
	@RequestMapping(path = "/form") //to get form.jsp
	public String formPage() {
		return "form";
	}
//	@RequestMapping(path="/form",method = RequestMethod.POST)
//	public String form(int id,String name,
//			String password,String gender,
//			ModelMap map) {
//		map.addAttribute("id",id);
//		map.addAttribute("name",name);
//		map.addAttribute("password",password);
//		map.addAttribute("gender",gender);
//	
//		return "formoutput";
//	}
//	
	
	@RequestMapping(path="/form",method = RequestMethod.POST)
	public String form(Employee employee,ModelMap map) {
		map.addAttribute("id",employee.getId());
		map.addAttribute("name",employee.getName());
		map.addAttribute("password",employee.getPassword());
		map.addAttribute("gender",employee.getGender());
		map.addAttribute("doj",employee.getDoj());
	
		return "formoutput";
	}
	
	
	
	
	
	//cookie create
	
	@RequestMapping(path="create-cookie")
	public String createCookie(ModelMap map,HttpServletResponse response) {
		
		Cookie cookie=new Cookie("name","Diya");
		response.addCookie(cookie);
		return "createcookie";
	}
	//cookie read
	@RequestMapping(path="read-cookie")
	public String readcookie(ModelMap map, 
			                 @CookieValue(name="name",required = false) String name) {
		map.addAttribute("name",name);
		return "readcookie";
	}
	
	
	
	//redirect
	@RequestMapping(path = "/redirect")
	public String redirect() {
		return "redirect:http://www.google.com";
		
	}
	//forward
	@RequestMapping(path = "/forward")
	public String forward() {
		return "forward:hi/amal/1";
	}

}
