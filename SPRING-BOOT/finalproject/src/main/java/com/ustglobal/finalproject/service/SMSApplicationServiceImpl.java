package com.ustglobal.finalproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.finalproject.dao.SMSApplicationDAO;
import com.ustglobal.finalproject.dto.OrderInfo;
import com.ustglobal.finalproject.dto.ProductInfoBean;

@Service
public class SMSApplicationServiceImpl implements SMSApplicationService {
	@Autowired
	SMSApplicationDAO dao;

	@Override
	public boolean addProduct(ProductInfoBean bean) {
		// TODO Auto-generated method stub
		return dao.addProduct(bean);
	}

	@Override
	public List<ProductInfoBean> viewProduct() {
		// TODO Auto-generated method stub
		return dao.viewProduct();
	}

	@Override
	public boolean updateProduct(OrderInfo bean) {
		// TODO Auto-generated method stub
		return dao.updateProduct(bean);
	}

	@Override
	public boolean removeProduct(int id) {
		// TODO Auto-generated method stub
		return dao.removeProduct(id);
	}

	@Override
	public boolean orderProduct(OrderInfo info) {
		// TODO Auto-generated method stub
		return false;
	}

}
