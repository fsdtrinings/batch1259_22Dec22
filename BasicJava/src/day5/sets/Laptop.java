package day5.sets;

public class Laptop {

	
	private int id;
	private String branName;
	private int cost;
	private int ramSize;
	
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laptop(int id, String branName, int cost, int ramSize) {
		super();
		this.id = id;
		this.branName = branName;
		this.cost = cost;
		this.ramSize = ramSize;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBranName() {
		return branName;
	}
	public void setBranName(String branName) {
		this.branName = branName;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getRamSize() {
		return ramSize;
	}
	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((branName == null) ? 0 : branName.hashCode());
		result = prime * result + cost;
		result = prime * result + id;
		result = prime * result + ramSize;
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
		Laptop other = (Laptop) obj;
		if (branName == null) {
			if (other.branName != null)
				return false;
		} else if (!branName.equals(other.branName))
			return false;
		if (cost != other.cost)
			return false;
		if (id != other.id)
			return false;
		if (ramSize != other.ramSize)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Laptop [id=" + id + ", branName=" + branName + ", cost=" + cost + ", ramSize=" + ramSize + "]";
	}
	
	
}
