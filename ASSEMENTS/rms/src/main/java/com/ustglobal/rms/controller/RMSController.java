package com.ustglobal.rms.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.ustglobal.rms.dto.OrderBean;
import com.ustglobal.rms.dto.ProductBean;
import com.ustglobal.rms.dto.RetailerBean;
import com.ustglobal.rms.service.RMSService;


@Controller
public class RMSController {
@Autowired
private RMSService service;	
	
	
	
	
	
//	@InitBinder
//	public void initBinder(WebDataBinder binder) {
//		SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
//		CustomDateEditor editor=new CustomDateEditor(format,true);
//		binder.registerCustomEditor(Date.class,editor);
//	}
	//login Page

	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}
	@PostMapping("/login")
	public String login(int id,String password,HttpServletRequest request) {
	       RetailerBean bean=service.login(id, password);
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
	
	
	
	@GetMapping("/home")
	public String home(@SessionAttribute(name="bean",required = false) RetailerBean bean,ModelMap map ) {
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
		ProductBean bean=service.searchProduct(id);
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
	public String changePassword(HttpServletRequest request, RetailerBean bean,ModelMap map ) {
		
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
	public String changePassword(@SessionAttribute(name = "bean")RetailerBean bean,String password,String cpassword,ModelMap map) {
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
	
	//cart
	@GetMapping("/cart")
	public String displayOrderPage(@SessionAttribute(name="bean",required = false) RetailerBean bean,ModelMap map ) {
		if(bean==null) {
			map.addAttribute("msg","Login first");
			return "login";
		}
		else {
			return "cart";
		}
	}
	
	
	@GetMapping("/order")
	public String displayOrder(@SessionAttribute("bean")RetailerBean rbean,ModelMap map) {
		OrderBean bean=service.displayOrder(rbean.getId());
		if(bean==null) {
			map.addAttribute("msg","Data not found");
		}
		else {
			map.addAttribute("bean",bean);
		}
		return "order";
	}

		
	
	
	
	
	
	
}
