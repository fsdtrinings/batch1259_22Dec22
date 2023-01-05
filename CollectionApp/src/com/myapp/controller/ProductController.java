package com.myapp.controller;

import java.util.List;

import com.myapp.db.ProductDB;
import com.myapp.entity.Product;

/* Server code */
public class ProductController {
	
	ProductDB db ;
	
	public ProductController() {
		db = new ProductDB();
	}
	
	public List<Product> getAllProducts()
	{
		return db.getAllProduct();
	}
	
	public Product insertProduct(Product userInputproduct)
	{
		// validate property values
		// security 
		Product savedProduct = db.saveProductInDB(userInputproduct);
		return savedProduct;
		
	}

	public List<Product> getProductsByCategory(String userInputCategory)
	{
		return db.getAllProductByCategory(userInputCategory);
	}
	
	public List<Product> getProductsByCategoryAndPriceRange(String userInputCategory,int searchRange1,int searchRange2)
	{
		return db.getAllProductByCategoryAndPriceRange(userInputCategory,searchRange1,searchRange2);
	}
	
	
	
}//end of class














