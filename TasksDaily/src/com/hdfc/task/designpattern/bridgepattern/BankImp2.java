package com.hdfc.task.designpattern.bridgepattern;




public class BankImp2  extends BankImp1 {
		
	public BankImp2() {
		super(); // BankImp1();
		
	}
	

	@Override
	public void withdraw() {


		System.out.println("Amount Withdraw Successfully...");
		
	}
	
	
	public void changePin() {
		
		System.out.println("PIN Changed..");
		
	}
	
	
	
	
	

}
