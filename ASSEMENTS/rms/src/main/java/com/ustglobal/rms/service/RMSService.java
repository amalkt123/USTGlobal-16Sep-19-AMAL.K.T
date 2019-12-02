package com.ustglobal.rms.service;

import com.ustglobal.rms.dto.OrderBean;
import com.ustglobal.rms.dto.ProductBean;
import com.ustglobal.rms.dto.RetailerBean;

public interface RMSService {
	RetailerBean login(int id,String password);
	boolean changePassword(int id,String passwordc);
	int Register(RetailerBean bean);
	ProductBean searchProduct(int id);
	OrderBean displayOrder(int id);
	
	
	

}
