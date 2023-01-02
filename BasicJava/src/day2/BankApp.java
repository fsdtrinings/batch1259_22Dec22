package day2;

public class BankApp {

	public static void main(String[] args) {
		
		BankApp  app = new BankApp();
		
		Account a = new Account(101, "Mike", 2000);
		
		Transaction t = new Transaction();
		
		t.settId(151515);
		t.setAmount(500);
		t.setTransactionDate("2 Jan 2023");
		t.setTransactionType("Withdrawal");
		t.setStatus(true);
		t.setTransactionMode("UPI Fund Transfer");
		
		a.setTransaction(t);// linking transaction with account
		
		app.printAccountDetails(a);
		
	}
	
	
	public void printAccountDetails(Account a)
	{
		System.out.println(" ---------------------------------------------");
		System.out.println(" Account Number :- "+a.getAccountNumber());
		System.out.println(" Account Holder Name :- "+a.getAccountHolderName());
		System.out.println(" Account Balance :- "+a.getBalance());
		
		System.out.println(" tId  "+a.getTransaction().gettId());
		System.out.println(" amount "+a.getTransaction().getAmount());
		System.out.println(" Date "+a.getTransaction().getTransactionDate());
		System.out.println(" Type "+a.getTransaction().getTransactionType());
		System.out.println(" status "+a.getTransaction().isStatus());
		System.out.println(" mode "+a.getTransaction().getTransactionMode());
		
	}
}
