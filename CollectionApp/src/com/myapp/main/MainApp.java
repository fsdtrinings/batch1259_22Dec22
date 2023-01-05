package com.myapp.main;

import java.util.List;
import java.util.Scanner;

import com.myapp.controller.ProductController;
import com.myapp.entity.Product;

/* USER Code */
public class MainApp {

	Scanner sc = new Scanner(System.in);
	ProductController server = new ProductController();
	
	public static void main(String[] args) {
		
		MainApp app = new MainApp();
		
		while(true)
		{
			System.out.println("\n\n-------- App MENU ---------");
			System.out.println("1.Insert Product In Database.");
			System.out.println("2.Display All Products.");
			System.out.println("3.Search Product by Category.");
			System.out.println("4.Search Product by Category & Cost Range");
			System.out.println("0. EXIT ");
			
			System.out.println(" --- Enter Choice :- ");
			int choice = Integer.parseInt(app.sc.nextLine());
			
			switch (choice) {
				case 1:
					app.takeUserInputForProduct();
					break;
				
				case 2:
					app.displayAllProducts();
					break;
					
					
				case 3:
					app.getProductsByCategory();
					break;
				
				case 4:
					app.getProductsByCategoryAndPriceRange();
					break;
					
				
				
				case 0:
					System.exit(0);
					break;
				

	
				default:
					break;
			}//end of switch
			
		}//end of while
		
		
	}//end main
	
	
	public void displayAllProducts() {
		List<Product> allProducts = server.getAllProducts();
		
		System.out.println("\n\n ----All Saved Products---");
		
		for (Product product : allProducts) {
			displayProducts(product, "");
		}
		
	}


	public void takeUserInputForProduct()
	{
		try {
			System.out.println("\n\t Enter Product Details \n");
			System.out.println("\n Enter Product Category ");
			String category = sc.nextLine();
			
			System.out.println("\n Enter Product Name ");
			String productName = sc.nextLine();
			
			System.out.println("\n Enter Product Cost ");
			int cost = Integer.parseInt(sc.nextLine());
			
			System.out.println("\n Enter Product Avg Rating ");
			float starRating = Float.parseFloat(sc.nextLine());
			
			System.out.println("\n Enter Units In Store");
			int unitsInStore = Integer.parseInt(sc.nextLine());
			
			// NOTE : id will be auto generated ...
			
			Product userInputProduct = new Product(0, productName, cost, category, starRating, unitsInStore);
			// Now click the submit button
			Product serverSavedProduct = server.insertProduct(userInputProduct);
			
			if(serverSavedProduct != null)
				displayProducts(serverSavedProduct,"Product Inserted !!!");
			else
				displayErrors("Product Not Saved , Try again or check Authority ");
			
		}
		catch (Exception e) {
			displayErrors(" Wrong Input , Enter Again");
			takeUserInputForProduct();
		}
	
	}
	
	public void displayErrors(String errorMsg)
	{
		System.out.println("_______ !!! Error !!! _________________________");
		System.out.println(errorMsg);
	}
	
	public void getProductsByCategory()
	{
		
		System.out.println("\n Enter Search Product Category ");
		String category = sc.nextLine();
		
		List<Product> outputData = server.getProductsByCategory(category);
		System.out.println(" -------- ALL  "+category+" --------------");
		for (Product product : outputData) {
			displayProducts(product, "");
		}
	}
	
	public void getProductsByCategoryAndPriceRange()
	{
		System.out.println("\n Enter Search Product Category ");
		String category = sc.nextLine();
		
		System.out.println("\n Enter Search Price Range 1 ");
		int priceRange1 = Integer.parseInt(sc.nextLine());
		
		System.out.println("\n Enter Search Price Range 2 ");
		int priceRange2 = Integer.parseInt(sc.nextLine());
		
	
		
		List<Product> outputData = server.getProductsByCategoryAndPriceRange(category, priceRange1, priceRange2);
		System.out.println(" -------- ALL  "+category+" --------------");
		for (Product product : outputData) {
			displayProducts(product, "");
		}
	}
	
	public void displayProducts(Product p,String tagline)
	{
		System.out.println(tagline);
		System.out.println(p.getPid()+" - "+p.getProductName()+" - "+p.getCategory()+" - "+p.getCost()+" - "+p.getStarRating());
	}
	
}//end main class










