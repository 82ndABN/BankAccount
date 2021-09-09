package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.AccountLogic;
import model.BankAccount;

/**
 * @author - Aaron Barker, ABN82nd
 * CIS175 - Fall 2021
 * Sep 8, 2021
 */
public class TestLogic1 {

	BankAccount account = new BankAccount();
	AccountLogic logic = new AccountLogic();
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testWithdrawal() {
		
		account.setBalance(3000);
		account.setAmount(300);
		double remaining = logic.calcWithdrawal(account);
		
		assertEquals(2700, remaining, 0.0);
	}
	
	@Test
	public void testDeposit() {
		
		account.setBalance(2000);
		account.setAmount(100);
		double remaining = logic.calcWithdrawal(account);
		
		assertEquals(1900, remaining, 0.0);
	}

}
