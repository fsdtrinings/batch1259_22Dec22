package day6.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import day5.sets.Laptop;

public class ObjectSorting1 {
	
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
		
		System.out.println("HashSet :- \n");
		for (Laptop laptop : allLaptops) {
			System.out.println(laptop);
		}
		//---------------------------------------------------------
		
		Set<Laptop> allSortedLaptops = new TreeSet<>();
		allSortedLaptops.addAll(allLaptops);
		
		System.out.println("\n\nTreeSet :- \n");
		for (Laptop laptop : allSortedLaptops) {
			System.out.println(laptop);
		}
		
		// ------ Other Sorting ----
		
		System.out.println("Sort Laptops based on Price ");
		List<Laptop> tempList = new ArrayList<>(allSortedLaptops);
		
		SortBasedOnPrice sortedObj = new SortBasedOnPrice();
		Collections.sort(tempList, sortedObj);
		
		System.out.println("\n\n Sort Based on Price :- \n");
		for (Laptop laptop : tempList) {
			System.out.println(laptop);
		}
		
		
		System.out.println("\n\n\nSort Laptops based on Ram ");
		List<Laptop> tempList2 = new ArrayList<>(allSortedLaptops);
		
		SortBasedOnRamSize sortedObj2 = new SortBasedOnRamSize();
		Collections.sort(tempList2, sortedObj2);
		
		System.out.println("\n\n Sort Based on Price :- \n");
		for (Laptop laptop : tempList2) {
			System.out.println(laptop);
		}
		
		System.out.println("\n\n\nSort Laptops based on Brand Name ");
		List<Laptop> tempList3 = new ArrayList<>(allSortedLaptops);
		
		SortBasedOnBrandName sortedObj3 = new SortBasedOnBrandName();
		Collections.sort(tempList3, sortedObj3);
		
		System.out.println("\n\n Sort Based on Price :- \n");
		for (Laptop laptop : tempList3) {
			System.out.println(laptop);
		}
	}//end of main

}//end of class






















