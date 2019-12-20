package com.ustglobal.finalproject.dao;

import java.util.List;

import com.ustglobal.finalproject.dto.Cart;
import com.ustglobal.finalproject.dto.OrderInfo;
import com.ustglobal.finalproject.dto.ProductInfoBean;

public interface SMSApplicationDAO {
	
     boolean addProduct(ProductInfoBean  bean);
     boolean addCart(Cart bean);
     List<Cart>viewCart();
     List<ProductInfoBean> viewProduct();
     boolean updateProduct(ProductInfoBean bean);
     boolean removeProduct(int id);
     boolean orderProduct(OrderInfo infoBean);
     List<ProductInfoBean> viewAllProduct();
     List<OrderInfo> viewOrderinfo();
     boolean deleteProduct(ProductInfoBean bean);
     

}
