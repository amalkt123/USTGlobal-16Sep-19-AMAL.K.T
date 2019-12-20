package com.ustglobal.finalproject.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
public class OrderInfo {
	@Id
	@GeneratedValue
	@Column
	private int id;
	@Column(nullable = false)
	private double totalPrice;
	@Column
	private double totalPriceWithGst;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "OrderHistoryinfo",joinColumns = @JoinColumn(name="id"),inverseJoinColumns = @JoinColumn(name="pid"))    
	private List<ProductInfoBean> productInfoBeans;

}
