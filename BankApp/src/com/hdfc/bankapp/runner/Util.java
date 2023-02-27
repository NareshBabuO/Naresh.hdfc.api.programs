package com.hdfc.bankapp.runner;

import com.hdfc.bankapp.impl.BankImpl2;
import com.hdfc.bankapp.inteface.IBank;

public class Util {

	public static IBank getObject() {
		return new BankImpl2();

	}

}
