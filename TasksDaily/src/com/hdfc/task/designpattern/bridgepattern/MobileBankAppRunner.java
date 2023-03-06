package com.hdfc.task.designpattern.bridgepattern;

public class MobileBankAppRunner  extends AtmRunner{

	public static void main(String[] args) {

		MobileBankAppRunner app = new MobileBankAppRunner();
		
		
	IBank b =	app.getBankObj();
		 

	}

}
