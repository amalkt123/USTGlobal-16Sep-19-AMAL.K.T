package com.ustglobal.rms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.rms.dao.RMSDAO;
import com.ustglobal.rms.dto.OrderBean;
import com.ustglobal.rms.dto.ProductBean;
import com.ustglobal.rms.dto.RetailerBean;
@Service
public class RMSServiceImpl implements RMSService {
	@Autowired
	private RMSDAO dao;

	@Override
	public RetailerBean login(int id, String password) {
		// TODO Auto-generated method stub
		return dao.login(id, password);
	}

	@Override
	public boolean changePassword(int id, String password) {
		// TODO Auto-generated method stub
		return dao.changePassword(id,password);
	}

	@Override
	public int Register(RetailerBean bean) {
		// TODO Auto-generated method stub
		return dao.Register(bean);
	}

	@Override
	public ProductBean searchProduct(int id) {
		// TODO Auto-generated method stub
		return dao.searchProduct(id);
	}

	@Override
	public OrderBean displayOrder(int id) {
		// TODO Auto-generated method stub
		return dao.displayOrder(id);
	}

}
