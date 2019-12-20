package com.ustglobal.finalproject.controller;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.ustglobal.finalproject.response.VenderResponse;
import com.ustglobal.finalproject.dto.Cart;
import com.ustglobal.finalproject.dto.OrderInfo;
import com.ustglobal.finalproject.dto.ProductInfoBean;
import com.ustglobal.finalproject.service.SMSApplicationService;

@CrossOrigin(origins = "*",allowedHeaders = "*",allowCredentials = "true")
@RestController
public class SMSApplicationController {
	private final int SUCCESS_STATUS_CODE=200;
	private final int FAILD_STATUS_CODE=400;
	private final String SUCCESS_MESSAGE="success";
	private final String FAILD_MESSAGE="faild";
	@Autowired
	SMSApplicationService service;
	@PostMapping(path = "/add-product",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	VenderResponse addProduct(@RequestBody ProductInfoBean bean) {
		System.out.println(bean.getCategory());
		boolean check=service.addProduct(bean);
		VenderResponse venderResponse=new VenderResponse();
		  if(check) {
	             venderResponse.setStatusCode(SUCCESS_STATUS_CODE);
	             venderResponse.setStatusMessage(SUCCESS_MESSAGE);
	             venderResponse.setDescription("success");
	     }
	     else {
	    	 venderResponse.setStatusCode(FAILD_STATUS_CODE);
	    	 venderResponse.setStatusMessage(FAILD_MESSAGE);
	     }
	    return venderResponse;

	}
	
	
	@PostMapping(path = "/updateproduct",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
VenderResponse updateBook(@RequestBody ProductInfoBean bean) {
		System.out.println(bean.getCategory());
		boolean check=service.addProduct(bean);
	VenderResponse venderResponse=new VenderResponse();
	  if(check) {
          venderResponse.setStatusCode(SUCCESS_STATUS_CODE);
          venderResponse.setStatusMessage(SUCCESS_MESSAGE);
          venderResponse.setDescription("updated successfully");
  }
  else {
 	 venderResponse.setStatusCode(FAILD_STATUS_CODE);
 	 venderResponse.setStatusMessage(FAILD_MESSAGE);
  }
 return venderResponse;

	}
	

	
	@PostMapping(path = "/deleteproduct",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	VenderResponse delteBook(@RequestBody ProductInfoBean bean) {
		System.out.println(bean.getCategory());
		boolean check=service.addProduct(bean);
		VenderResponse venderResponse=new VenderResponse();
		  if(check) {
	             venderResponse.setStatusCode(SUCCESS_STATUS_CODE);
	             venderResponse.setStatusMessage(SUCCESS_MESSAGE);
	            venderResponse.setDescription("deleted sucdessfully");
	     }
	     else {
	    	 venderResponse.setStatusCode(FAILD_STATUS_CODE);
	    	 venderResponse.setStatusMessage(FAILD_MESSAGE);
	     }
	    return venderResponse;

	}
	

	
	@GetMapping(path = "view-product",produces = MediaType.APPLICATION_JSON_VALUE)
    VenderResponse viewProduct(){
    	
     List<ProductInfoBean> beans=service.viewProduct();
     VenderResponse venderResponse=new VenderResponse();
     System.out.println(beans.size());
     if(!beans.isEmpty()) {
             venderResponse.setStatusCode(SUCCESS_STATUS_CODE);
             venderResponse.setStatusMessage(SUCCESS_MESSAGE);
             venderResponse.setProductInfoBeans(beans);
     }
     else {
    	 venderResponse.setStatusCode(FAILD_STATUS_CODE);
    	 venderResponse.setStatusMessage(FAILD_MESSAGE);
     }
    return venderResponse;
    	
    }
	
	
	
	@PostMapping(path ="/add-cart",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	VenderResponse addCart(@RequestBody Cart bean){
		boolean check=service.addCart(bean);
		VenderResponse  response=new VenderResponse();
		if(check){
		    response.setStatusCode(SUCCESS_STATUS_CODE);
			response.setStatusMessage(SUCCESS_MESSAGE);
			response.setDescription("addes successfully");
		}
		else {
			response.setStatusMessage(FAILD_MESSAGE);
			response.setStatusCode(FAILD_STATUS_CODE);
		}
		
		return response;
		
	}
	@GetMapping(path = "/view-cart",produces = MediaType.APPLICATION_JSON_VALUE)
	VenderResponse viewCart(){
		VenderResponse response=new VenderResponse();
		List<Cart> carts=service.viewCart();
		if(!carts.isEmpty()) {
			response.setStatusCode(SUCCESS_STATUS_CODE);
			response.setStatusMessage(SUCCESS_MESSAGE);
			response.setCarts(carts);
		}
		else {
			response.setStatusCode(FAILD_STATUS_CODE);
			response.setStatusMessage(FAILD_MESSAGE);
		}
		return response;
	}
	
	@PostMapping(path ="/order",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	VenderResponse order(@RequestBody OrderInfo  bean){
		boolean check=service.orderProduct(bean);
		VenderResponse  response=new VenderResponse();
		if(check){
		    response.setStatusCode(SUCCESS_STATUS_CODE);
			response.setStatusMessage(SUCCESS_MESSAGE);
			response.setDescription("addes successfully");
		}
		else {
			response.setStatusMessage(FAILD_MESSAGE);
			response.setStatusCode(FAILD_STATUS_CODE);
		}
		
		return response;
		
	}

	
}
