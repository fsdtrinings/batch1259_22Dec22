package com.myapp.entity;

public class Product {

	private int pid;
	private String productName;
	private int cost;
	private String category;
	private float starRating;  // Avg Customer raiting
	private int unitsInStore; // stock 
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int pid, String productName, int cost, String category, float starRating, int unitsInStore) {
		super();
		this.pid = pid;
		this.productName = productName;
		this.cost = cost;
		this.category = category;
		this.starRating = starRating;
		this.unitsInStore = unitsInStore;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public float getStarRating() {
		return starRating;
	}
	public void setStarRating(float starRating) {
		this.starRating = starRating;
	}
	public int getUnitsInStore() {
		return unitsInStore;
	}
	public void setUnitsInStore(int unitsInStore) {
		this.unitsInStore = unitsInStore;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + cost;
		result = prime * result + pid;
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		result = prime * result + Float.floatToIntBits(starRating);
		result = prime * result + unitsInStore;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (cost != other.cost)
			return false;
		if (pid != other.pid)
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		if (Float.floatToIntBits(starRating) != Float.floatToIntBits(other.starRating))
			return false;
		if (unitsInStore != other.unitsInStore)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", productName=" + productName + ", cost=" + cost + ", category=" + category
				+ ", starRating=" + starRating + ", unitsInStore=" + unitsInStore + "]";
	}
	
	
	
}
