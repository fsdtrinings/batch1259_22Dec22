package day6.sorting;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import day5.sets.Laptop;

public class BasicSorting2 {
	
public static void main(String[] args) {
		
		Set<Character> set1 = new HashSet<>();
		set1.add('P');
		set1.add('A');
		set1.add('M');
		set1.add('Z');
		set1.add('B');
		
		System.out.println("HashSet :- \n"+set1);
		
		Set<Character> set2 = new TreeSet<>();
		set2.addAll(set1);
		System.out.println("TreeSet :- \n"+set2);
		
		
	}

}
