package com.ustglobal.finalproject.service;

import java.util.List;

import com.ustglobal.finalproject.dto.Cart;
import com.ustglobal.finalproject.dto.OrderInfo;
import com.ustglobal.finalproject.dto.ProductInfoBean;

public interface SMSApplicationService {
	
	 boolean addProduct(ProductInfoBean  bean);
     List<ProductInfoBean> viewProduct();
     boolean addCart(Cart bean);
     List<Cart>viewCart();
     boolean updateProduct(ProductInfoBean info);
     boolean removeProduct(int id);
     boolean orderProduct(OrderInfo info);
     boolean deleteProduct(ProductInfoBean bean);
     List<OrderInfo> orderInfos();
     


}
