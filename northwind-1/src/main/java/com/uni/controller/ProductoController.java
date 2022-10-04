package com.uni.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uni.service.ProductoService;
@RestController
@RequestMapping("/zz")
public class ProductoController {

	@Autowired
	private ProductoService productoService;
	
	@GetMapping("/pro")
	public List<Map<String, Object>> readAll2(){		
		return productoService.readAll2();
	}
}
