package com.view;

import com.entity.Accountant;
import com.entity.Employee;

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
	} 
	
	public void doEmployeeThings(Employee e)
	{
		System.out.println("Employee Name "+e.getEmployeeName());
		System.out.println("Employee ID "+e.getEmpId());
		System.out.println("Employee Salary "+e.getSalary());
		
		//System.out.println("Employee Working File "+e.getTaxFile());
		// above line of code give us an error
		
		// solution :- Type cast the object
		Accountant a = (Accountant)e;
		System.out.println("Tax File Name "+a.getTaxFileName());
		
	}
	
	
	
}









