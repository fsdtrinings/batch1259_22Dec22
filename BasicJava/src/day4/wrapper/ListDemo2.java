package day4.wrapper;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {
	
	public static void main(String[] args) {
		
		ListDemo2 mainObj = new ListDemo2();
		
		List<Integer> list = new ArrayList<>();
		
		list.add(14);
		list.add(9);
		list.add(140);
		list.add(44);
		list.add(219);
		list.add(88);
		list.add(109);
		list.add(220);
		list.add(69);
		list.add(73);
		
		
		// list.add(new Employee()); // error becoz employee is not a Integer value
		
		System.out.println("\n\n -----------In Range ---------------------------------\n");
		mainObj.printValuesInRange(25, 100,list);
		
		
		System.out.println("\n\n -----------Search Element ---------------------------------\n");
		int searchElement = 109; // get from user through scanner 
		boolean status = mainObj.isElementInTheList(searchElement, list);
		System.out.println(searchElement+" status:-  "+status);
		
		
		System.out.println("\n\n -----------Get All Even Numbers ---------------------------------\n");
		List<Integer> allEvenNumbers = mainObj.getAllEvenNumbers(list);
		for (Integer data : allEvenNumbers) {
			System.out.println(data);
		}
		
	}
	
	public void printValuesInRange(int r1,int r2,List<Integer> list)
	{
		for (Integer element : list) {
			if(element>=r1 && element<=r2)
			{
				System.out.println(element);
			}
		}
	}

	public boolean isElementInTheList(int searchElement,List<Integer> list)
	{
		
		boolean isFound = false;
		
		for (Integer element : list) {
			
			if(element == searchElement)
			{
				isFound = true;
				break;
			}
			
		}
		
		
		return isFound;
	}

	public List<Integer> getAllEvenNumbers(List<Integer> list)
	{
		List<Integer> outputList = new ArrayList<>();
		
		for (Integer element : list) {
			
			if(element%2 == 0)
			{
				outputList.add(element);
			}
		}
		
		return outputList;
	}


	public List<Integer> getAllPrimenumbers(List<Integer> list)
	{
		return null;
	}
	
	public List<Integer> getAlloddValues(List<Integer> list)
	{
		return null;
	}
	
	
	
}


















