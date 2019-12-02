package com.ustglobal.rms.dao;

import com.ustglobal.rms.dto.OrderBean;
import com.ustglobal.rms.dto.ProductBean;
import com.ustglobal.rms.dto.RetailerBean;

public interface RMSDAO {
	RetailerBean login(int id,String password);
	boolean changePassword(int id,String password);
	int Register(RetailerBean bean);
	ProductBean searchProduct(int id);
	OrderBean displayOrder(int id);
	


}
