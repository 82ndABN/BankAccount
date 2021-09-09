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
public class TestLogic2 {

	BankAccount account = new BankAccount();
	AccountLogic logic = new AccountLogic();
	
	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void testNull() {
		
		assertNull(account.getOwner());
	}
	
	@Test
	public void testNotNull() {
		account.setOwner("Billy");
		
		assertNotNull(account.getOwner());
	}

}
