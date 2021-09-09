package model;

/**
 * @author - Aaron Barker, ABN82nd
 * CIS175 - Fall 2021
 * Sep 8, 2021
 */


public class BankAccount {

////declarations
	String owner;
	double balance = 0;
	double amount = 0;

////getters & setters
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
////constructors
	public BankAccount() {
		
	}
	
	public BankAccount(String owner, double balance) {
		super();
		this.owner = owner;
		this.balance = balance;
	}
	
}
