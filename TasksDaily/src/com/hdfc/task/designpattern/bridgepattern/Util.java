package com.hdfc.task.designpattern.bridgepattern;

public class Util {
	
	
	public static IBank getObject(){
		
		
		return new BankImp2();
		
	}

}
