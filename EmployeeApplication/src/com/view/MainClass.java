package com.view;

import com.entity.Accountant;
import com.entity.Employee;
import com.entity.Engineer;

public class MainClass {

	public static void main(String[] args) {
		
		MainClass mainObj = new MainClass();
		
		//Employee e1 = new Accountant();
		
		Accountant a = new Accountant();
		a.setEmpId(101);
		a.setEmployeeName("Ramesh");
		a.setSalary(2000);
		a.setWorkLocation("Mumbai");
		a.setTaxFileName("Sales Tax File : 1234");
		
		mainObj.doEmployeeThings(a);
		System.out.println("\n--------------------------------------------------\n");
		
		Engineer dev = new Engineer();
		dev.setEmpId(102);
		dev.setEmployeeName("Neha");
		dev.setProjectName("ICICI- Bank App");
		dev.setSalary(2500);
		dev.setWorkLocation("Banglore");
		dev.setClientCallDetails("Daily Stand up 6:00 PM");
		
		mainObj.doEmployeeThings(dev);
	} 
	
	public void doEmployeeThings(Employee e)
	{
		System.out.println("Employee Name "+e.getEmployeeName());
		System.out.println("Employee ID "+e.getEmpId());
		System.out.println("Employee Salary "+e.getSalary());
		
		//###  Below is the code for Accountant ###
		
		//System.out.println("Employee Working File "+e.getTaxFile());
		// above line of code give us an error
		
		// solution :- Type cast the object
		if(e instanceof Accountant)
		{
			Accountant a = (Accountant)e;
			System.out.println("Tax File Name "+a.getTaxFileName());
		}
		
		//###  Below is the code for Engineer ###
		
		
		if(e instanceof Engineer)
		{
			Engineer abc = (Engineer) e;
			System.out.println("Client Call Details "+abc.getClientCallDetails());
			System.out.println("Project Name "+abc.getProjectName());
		}
		
		
	}
	
	
	
}









