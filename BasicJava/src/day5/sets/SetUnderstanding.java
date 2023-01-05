package day5.sets;

import java.util.HashSet;
import java.util.Set;

public class SetUnderstanding {
	
	public static void main(String[] args) {
		
		Set<Laptop> allLaptops = new HashSet<>();
		
		Laptop l1 = new Laptop(101, "Dell", 50505, 8);
		Laptop l2 = new Laptop(102, "HP", 20505, 4);
		Laptop l3 = new Laptop(103, "Acer", 30505, 8);
		Laptop l4 = new Laptop(104, "Dell", 150505, 16);
		Laptop l5 = new Laptop(104, "Dell", 150505, 16);
		
		
		allLaptops.add(l1);
		allLaptops.add(l2);
		allLaptops.add(l3);
		allLaptops.add(l4);
		allLaptops.add(l5);
		
		
		for (Laptop laptop : allLaptops) {
			System.out.println(laptop);
		}
		
		
	}

}
