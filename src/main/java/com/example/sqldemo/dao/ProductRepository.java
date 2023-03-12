package com.example.sqldemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sqldemo.model.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>{

}
