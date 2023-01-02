package day2;

public class Bank_Transaction {
	
	public static void main(String[] args) {
		
		Bank_Transaction obj = new Bank_Transaction();
		
		// Step 1: Create dummy object
		Transaction t = new Transaction();
		
		// STep 2: provide values through setter methods
		t.settId(151515);
		t.setAmount(500);
		t.setTransactionDate("2 Jan 2023");
		t.setTransactionType("Withdrawal");
		t.setStatus(true);
		t.setTransactionMode("UPI Fund Transfer");
		
		obj.printTransaction(t);
		
		
		
		
	}
	
	public void printTransaction(Transaction t)
	{
		System.out.println(" tId  "+t.gettId());
		System.out.println(" amount "+t.getAmount());
		System.out.println(" Date "+t.getTransactionDate());
		System.out.println(" Type "+t.getTransactionType());
		System.out.println(" status "+t.isStatus());
		System.out.println(" mode "+t.getTransactionMode());
		
		
	}

}
