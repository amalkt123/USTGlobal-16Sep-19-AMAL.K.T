package com.ustglobal.finalproject.dao;

import java.util.List;

import com.ustglobal.finalproject.dto.OrderInfo;
import com.ustglobal.finalproject.dto.ProductInfoBean;

public interface SMSApplicationDAO {
	
     boolean addProduct(ProductInfoBean  bean);
     List<ProductInfoBean> viewProduct();
     boolean updateProduct(OrderInfo info);
     boolean removeProduct(int id);
     boolean orderProduct(ProductInfoBean infoBean);
     List<ProductInfoBean> viewAllProduct();
     List<OrderInfo> viewOrderinfo();
     

}
