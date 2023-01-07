package day7.map;

import java.util.HashMap;
import java.util.Map;

public class BasicMapp1 {

	
	public static void main(String[] args) {
		
			Map<Integer, String> myMap = new HashMap<>();
			
			myMap.put(1, "India"); // NOTE :- In map we have put method instead of add();
			myMap.put(2,"Russia");
			myMap.put(3,"USA");
			myMap.put(4,"France");
			myMap.put(2,"UK");
			myMap.put(6,"Russia");
			
			System.out.println(" Size of Map :-  "+myMap.size());
			System.out.println("Fetch data based on Key :- "+myMap.get(2));
			System.out.println("\n\n Whole Map :- "+myMap);
			
			System.out.println("----------------------------");
			
			for (Map.Entry<Integer, String> entry : myMap.entrySet()) {
				
				System.out.println(entry.getKey()+" - "+entry.getValue());
			}
		
		
	}//end main
	
}//end class
