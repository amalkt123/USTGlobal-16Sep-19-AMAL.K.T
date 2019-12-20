package com.ustglobal.finalproject.service;

import java.util.List;

import com.ustglobal.finalproject.dto.OrderInfo;
import com.ustglobal.finalproject.dto.ProductInfoBean;

public interface SMSApplicationService {
	
	 boolean addProduct(ProductInfoBean  bean);
     List<ProductInfoBean> viewProduct();
     boolean updateProduct(OrderInfo info);
     boolean removeProduct(int id);
     boolean orderProduct(OrderInfo info);


}
