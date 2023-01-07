package day7.map;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import day5.sets.Laptop;

public class MapUnderstanding2 {

	List<Laptop> allLaptops = new ArrayList<>();
	
			 // default values or already values
	public MapUnderstanding2() {
		Laptop l1 = new Laptop(101, "Dell-1", 50505, 8);
		Laptop l2 = new Laptop(102, "HP-1", 20505, 4);
		Laptop l3 = new Laptop(103, "Acer-1", 30505, 8);
		Laptop l4 = new Laptop(104, "Dell-2", 150505, 16);
		Laptop l5 = new Laptop(105, "HP-123", 140505, 16);
		Laptop l6 = new Laptop(106, "Dell-123", 40505, 8);
		Laptop l7 = new Laptop(107, "HP-3", 15005, 4);
		Laptop l8 = new Laptop(108, "Acer-3", 70505, 8);
		

		allLaptops.add(l1);
		allLaptops.add(l2);
		allLaptops.add(l3);
		allLaptops.add(l4);
		allLaptops.add(l5);
		allLaptops.add(l6);
		allLaptops.add(l7);
		allLaptops.add(l8);
	}

	public static void main(String[] args) {

		MapUnderstanding2 mainObj = new MapUnderstanding2();
		
		//mainObj.addLaptop();
		
		//mainObj.printDetails();
		
		mainObj.printLaptopsBasedOnGroup(mainObj.groupLaptopBasedOnRamSize());
		
	}//end main
	
	public void addLaptop()
	{
		
		
	}
	
	
	public void printLaptopsBasedOnGroup(Map<Integer, List<Laptop>> map)
	{
		for (Map.Entry<Integer, List<Laptop>> entry : map.entrySet()) {
			
			System.out.println(entry.getKey());
			for (Laptop laptop : entry.getValue()) {
				System.out.println(laptop);
			}
			
			System.out.println("____________________________________________");
		}
	}
	
	public Map<Integer, List<Laptop>> groupLaptopBasedOnRamSize()
	{
		Map<Integer, List<Laptop>> laptopGroups = new HashMap<>();  // empty map
		
		for (Laptop laptop : allLaptops) {
			
			Integer key = laptop.getRamSize();
			
			if(laptopGroups.containsKey(key))
			{
				List<Laptop> allLaptops = laptopGroups.get(key);
				allLaptops.add(laptop);
				laptopGroups.put(key, allLaptops);
			}
			else
			{
				List<Laptop> newList = new ArrayList<>();
				newList.add(laptop);
				
				laptopGroups.put(key,newList);
			}
			
		}
		
		return laptopGroups;
		
		// ----------------------------------------------------------
		
		
	}
	
	public void printDetails()
	{
		System.out.println("HashSet :- \n");
		for (Laptop laptop : allLaptops) {
			System.out.println(laptop);
		}
	}
	
}//end class




















