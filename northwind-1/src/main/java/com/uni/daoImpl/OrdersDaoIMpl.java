package com.uni.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.uni.dao.Todo;
import com.uni.entity.Orders;



@Component
public class OrdersDaoIMpl implements Todo<Orders> {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		String SQL = "select o.ShipCountry Orden,count(c.CustomerID) as Cantidad from orders o  \n"
				+ "inner join customers c\n"
				+ "on  o.CustomerID =c.CustomerID\n"
				+ "group by c.Country;";
		return jdbcTemplate.queryForList(SQL);
		
	}

	

	

	

	
	
}
