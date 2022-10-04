package com.uni.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.uni.dao.Todo;
import com.uni.entity.Producto;

@Component
public class ProductoDaoImpl implements Todo<Producto>{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		String SQL = "select c.CategoryName as nombre ,count(p.CategoryID) as Cantidad from products p \r\n"
				+ "inner join categories c\r\n "
				+ "on  p.CategoryID =c.CategoryID\r\n "
				+ "group by p.CategoryID;";
		return jdbcTemplate.queryForList(SQL);
	}

}
