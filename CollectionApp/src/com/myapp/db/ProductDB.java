package com.myapp.db;

import java.util.ArrayList;
import java.util.List;

import com.myapp.entity.Product;
import com.myapp.util.ProductUtil;

/* Replace class with actual DB*/

public class ProductDB {

	
	List<Product> allProducts = new ArrayList<>();
	
	
	public List<Product> getAllProduct()
	{
		return allProducts;// select * from Products;
	}
	
	public List<Product> getAllProductByCategory(String searchCategory)
	{
		//return allProducts;// select * from Products where category='laptop';
		
		List<Product> outputProducts = new ArrayList<>();
		
		for (Product product : allProducts) {
			if(product.getCategory().equalsIgnoreCase(searchCategory))
			{
				outputProducts.add(product);
			}
		}
		
		return outputProducts;
	}
	
	
	public List<Product> getAllProductByCategoryAndPriceRange(String searchCategory,int range1,int range2)
	{
		//return allProducts;// select * from Products where category='laptop';
		
		List<Product> outputProducts = new ArrayList<>();
		
		for (Product product : allProducts) {
			if(product.getCategory().equalsIgnoreCase(searchCategory) && (product.getCost()>= range1 && product.getCost()<=range2))
			{
				outputProducts.add(product);
			}
		}
		
		return outputProducts;
	}
	
	
	
	public Product saveProductInDB(Product product)
	{
		if(product != null)
		{
			product.setPid(ProductUtil.getRandomID());
			boolean status =  allProducts.add(product);
			if(status) return product;
			else return null;
			
		}
		else
		{
			return null;
		}
		
	}
	
}
