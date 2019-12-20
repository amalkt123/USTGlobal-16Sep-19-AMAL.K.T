package com.ustglobal.finalproject.response;

import java.util.List;

import com.ustglobal.finalproject.dto.Cart;
import com.ustglobal.finalproject.dto.OrderInfo;
import com.ustglobal.finalproject.dto.ProductInfoBean;

import lombok.Data;
@Data
public class VendorResponse {
	private int statusCode;
	private String statusMessage;
	private String description;
	private ProductInfoBean productInfoBean;
	private OrderInfo orderInfo;
	List<ProductInfoBean> productInfoBeans;
	List<OrderInfo> orderInfos;
	List<Cart> carts;

}
