package com.ustglobal.stock.dao;

import java.util.List;

import com.ustglobal.stock.dto.Product;



public interface ProductDAO {

	public boolean addProduct(Product product);
	public boolean updateProduct(Product product);
	public Product getProductByName(String name);
	public List<Product> getProductByCategory(String category);
	public List<Product> getProductByCompany(String company);
	public List<Product> getAllProduct();
	
	
}
