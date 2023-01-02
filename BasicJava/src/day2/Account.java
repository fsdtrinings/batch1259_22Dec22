package day2;


/*
 *  Java Bean Class Standards / POJO 
 *   1) default constructor
 *   2) getter & setters of all properties
 * 
 * */


public class Account {

	private int accountNumber;
	private String accountHolderName;
	private int balance;
	
	private Transaction transaction;
	
	public Account() {  // default contructor
		}

	public Account(int accountNumber) {
		super();
		this.accountNumber = accountNumber;
	}

	public Account(int accountNumber, String accountHolderName, int balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}
	
	
	
	
	
}//end class
















