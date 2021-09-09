package model;

/**
 * @author - Aaron Barker, ABN82nd
 * CIS175 - Fall 2021
 * Sep 8, 2021
 */


public class AccountLogic {

	public double calcWithdrawal(BankAccount account) {
		double dblReturn = 0;
		double amount = account.getAmount();
		
		dblReturn = account.getBalance() - amount;
		
		return dblReturn;
	}
	
	public double calcDeposit(BankAccount account) {
		double dblReturn = 0;
		double amount = account.getAmount();
		
		dblReturn = account.getBalance() - amount;
		
		return dblReturn;
	}
}
