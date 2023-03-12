package com.example.sqldemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.sqldemo.dao.ProductRepository;
import com.example.sqldemo.model.Product;


@RestController
public class ProductController {

	@Autowired
	ProductRepository productRepository;
	
	@PostMapping(value = "/add-product")
	public String addProduct(@RequestBody Product productData) {
		productRepository.save(productData);
		return "employee saved";
	}
	
	@GetMapping(value = "/get-all")
	List<Product> getAllEmp(){
		return productRepository.findAll();
	}
}
