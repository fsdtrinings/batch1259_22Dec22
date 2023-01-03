package day3exc;

import java.util.Scanner;

public class DoSelectTestApp {

	
	public static void main(String[] args) {
		
		DoSelectTestApp testApp = new DoSelectTestApp();
		try {
			testApp.startTest();
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
	
	public void startTest()throws TestSuspendedException
	{
		System.out.println("Test Started ..");
		
		System.out.println(" Do u want to visit google <y/n>");
		String choice = new Scanner(System.in).nextLine();
		
		if(choice.equalsIgnoreCase("y"))
		{
			TestSuspendedException testExc = new TestSuspendedException("Test Suspended , becoz u switch the window");
			throw testExc; // throw always used along with throws
		}
		else
		{
			System.out.println("Contiue Test");
		}
	}
	
}
