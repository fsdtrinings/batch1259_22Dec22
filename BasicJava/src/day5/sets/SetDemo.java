package day5.sets;

import java.util.HashSet;
import java.util.TreeSet;

import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		
		Set<Integer> set = new TreeSet<>();
		
		set.add(12);
		set.add(120);
		set.add(1);
		set.add(912);
		
		System.out.println("--->> "+set.size());
		
		for (Integer element : set) {
			System.out.println(element);
		}
		
	}
}
