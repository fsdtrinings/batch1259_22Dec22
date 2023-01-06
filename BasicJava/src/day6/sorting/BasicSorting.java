package day6.sorting;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import day5.sets.Laptop;

public class BasicSorting {
	
public static void main(String[] args) {
		
		Set<Integer> set1 = new HashSet<>();
		set1.add(12);
		set1.add(32);
		set1.add(72);
		set1.add(17);
		set1.add(99);
		set1.add(9);
		set1.add(29);
		set1.add(44);
		
		System.out.println("HashSet :- \n"+set1);
		
		Set<Integer> set2 = new TreeSet<>();
		set2.addAll(set1);
		System.out.println("TreeSet :- \n"+set2);
		
		
	}

}
