package com.uni.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uni.dao.Todo;
import com.uni.daoImpl.OrdersDaoIMpl;
import com.uni.entity.Orders;


@Service
public class OrderService implements Todo<Orders> {

	@Autowired
	private OrdersDaoIMpl daoIMpl;

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return daoIMpl.readAll2();
	}

	


}
