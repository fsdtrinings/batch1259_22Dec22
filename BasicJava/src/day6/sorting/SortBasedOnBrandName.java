package day6.sorting;

import java.util.Comparator;

import day5.sets.Laptop;

public class SortBasedOnBrandName implements Comparator<Laptop>{

	@Override
	public int compare(Laptop o1, Laptop o2) {
		
		return o1.getBranName().compareTo(o2.getBranName());
	}

	
	
}
