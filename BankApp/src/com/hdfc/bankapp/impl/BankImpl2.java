package com.hdfc.bankapp.impl;

public class BankImpl2 extends BankImpl1 {

	public BankImpl2() {
		super();
	}

	@Override
	public void withdraw() {

		System.out.println("Amount Withdraw Successfully...");

	}

	public void changePin() {
		
		System.out.println("PIN Changed..");
	}
}
