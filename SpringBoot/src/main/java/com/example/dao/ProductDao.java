package com.example.dao;

import com.example.model.City;
import com.example.model.Products;

import java.util.List;

public interface ProductDao {
	
	List<Products> getAllProducts();

	List<Products> getProductsById(String id);

}
