package day6.sorting;

import java.util.Comparator;

import day5.sets.Laptop;

public class SortBasedOnRamSize implements Comparator<Laptop>{

	@Override
	public int compare(Laptop o1, Laptop o2) {
		
		return o1.getRamSize() - o2.getRamSize();
	}

	
	
}
