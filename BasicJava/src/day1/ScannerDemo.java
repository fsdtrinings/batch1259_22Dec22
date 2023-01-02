package day1;


//Step 1 : import util package
import java.util.Scanner;

public class ScannerDemo {

	
	public static void main(String[] args) {
		
		// create scanner object
		Scanner sc = new Scanner(System.in); // scanner for non string values 
		Scanner sc2 = new Scanner(System.in); // scanner for string values
		
		
		System.out.println("Enter the Number : - ");
		int x = sc.nextInt();
		
		System.out.println("Enter Username : - ");
		String username = sc2.nextLine();
		
		
		System.out.println(x+" and "+username);
		
				
		
		
	}
}
