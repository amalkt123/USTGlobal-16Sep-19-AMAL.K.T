package com.ustglobal.finalproject.response;

import java.util.List;

import com.ustglobal.finalproject.dto.Cart;
import com.ustglobal.finalproject.dto.OrderInfo;
import com.ustglobal.finalproject.dto.ProductInfoBean;

import lombok.Data;
@Data
public class VenderResponse {
	private int statusCode;
	private String statusMessage;
	private ProductInfoBean productInfoBean;
	private OrderInfo orderInfo;
	private List<ProductInfoBean> productInfoBeans;
	private List<OrderInfo> orderInfos;
	private List<Cart> carts;
	private String description;

}
