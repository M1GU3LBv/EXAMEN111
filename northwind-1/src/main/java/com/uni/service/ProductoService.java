package com.uni.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uni.dao.Todo;
import com.uni.daoImpl.ProductoDaoImpl;
import com.uni.entity.Orders;
@Service
public class ProductoService implements Todo<Orders>{
@Autowired
	private ProductoDaoImpl daoIMpl;

@Override
public List<Map<String, Object>> readAll2() {
	// TODO Auto-generated method stub
	return daoIMpl.readAll2();
}

}
