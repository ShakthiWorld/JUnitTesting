package com.bank.service;

import static org.junit.Assert.*;

import org.junit.Test;

public class AccountServiceTest {

	@Test
	public void createAccount_returns_valid_id_when_bal_gt_minbal() {
		
		AccountService service=new AccountService();
		
		int id=service.createNewAccount("SA", 10001);
		
		assertTrue(id>0);
		
	}

}
