package day4.wrapper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		ListDemo mainObj = new ListDemo();
		
		List list = new ArrayList();
		// Employee e = new Developer();
		
		
		// NOTE: all the methods of List are compatible with object class
		
		list.add(3); // add is a method use to insert element into list
		list.add(new Employee());
		list.add("Hello");
		list.add(3);
		list.add(6.3);
		list.add(new ClassCastException("Dummy exception"));
		list.add(new Animal());
		
		// --------- iterate the list -------
		
		mainObj.approach1_interation(list);
		System.out.println("--------------------------\n");
		mainObj.approach2_iteration(list);
		System.out.println("--------------------------\n");
		mainObj.apporach3_Iteration(list);
	}
	
	
	public void approach1_interation(List list)
	{
		System.out.println(list);
		
	}
	
	public void approach2_iteration(List list)
	{
		// through enhance for loop / foreach
		
		for (Object element : list) {
			System.out.println(element);
		}
		
	}
	
	public void apporach3_Iteration(List list)
	{
		Iterator itr = list.iterator();
		
		while(itr.hasNext())
		{
			Object element = itr.next();
			System.out.println(element);
		}
		
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}//end class
