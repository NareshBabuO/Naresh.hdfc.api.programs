package com.hdfc.bankapp.impl;

import com.hdfc.bankapp.inteface.IBank;

public abstract class BankImpl1 implements IBank {

	/*
	 * @Override public void deposit() { // TODO Auto-generated method stub
	 * 
	 * System.out.println("Amount Deposited Successfully.."); }
	 * 
	 * public abstract void withdraw();
	 */

	public BankImpl1() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposit() {

		System.out.println("Amount Deposited Successfully...");

	}

	public abstract void withdraw();

}
