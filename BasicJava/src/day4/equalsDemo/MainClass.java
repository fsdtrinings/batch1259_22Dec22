package day4.equalsDemo;

public class MainClass {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Ramesh",101, 2000,"Pune");
		Employee e2 = new Employee("Suresh",102, 2000,"Banglore");
		Employee e3 = new Employee("Ramesh",101, 2000,"Pune");
		
		
		/*
		boolean b1 = (e1 == e2);
		System.out.println(b1);
		
		boolean b2 = (e1 == e3);
		System.out.println(b2);
		*/
		
		
		boolean b1 = (e1.equals(e2));
		System.out.println(b1);
		
		boolean b2 = (e1.equals(e3));
		System.out.println(b2);
		
		
		
		
		
		
	}
}
