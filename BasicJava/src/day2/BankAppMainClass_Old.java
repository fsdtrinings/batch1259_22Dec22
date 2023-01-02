package day2;

public class BankAppMainClass_Old {

	public static void main(String[] args) {
		
		BankAppMainClass_Old app = new BankAppMainClass_Old(); 
		// have to create the class object , in order to call outside main method 
		// NOTE : printAccountDetails method is non-static method , which cannot be accessed without object
		
		
		Account a = new Account();
		// Creation of Business Object
		
		app.printAccountDetails(a);
		// calling of app behaviour
		
		//===============================================
		
		Account a2 = new Account(101);
		app.printAccountDetails(a2);
		
		// ----------------------------------------------------
		
		Account a3 = new Account(101,"Ramesh",2000);
		app.printAccountDetails(a3);
		
		
		
	}
	
	
	public void printAccountDetails(Account a)
	{
		System.out.println(" ---------------------------------------------");
		System.out.println(" Account Number :- "+a.getAccountNumber());
		System.out.println(" Account Holder Name :- "+a.getAccountHolderName());
		System.out.println(" Account Balance :- "+a.getBalance());
		
	}
}




















