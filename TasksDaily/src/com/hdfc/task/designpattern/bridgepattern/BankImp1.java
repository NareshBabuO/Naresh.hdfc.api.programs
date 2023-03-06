package com.hdfc.task.designpattern.bridgepattern;




public abstract class BankImp1 extends Object implements IBank{
	
	public BankImp1() {
		
		super(); // Object();
		
	}
	

	

	@Override
	public void deposit() {


		System.out.println("Amount Deposited Successfully...");
		

	}
	
	public abstract void withdraw();

	

}
