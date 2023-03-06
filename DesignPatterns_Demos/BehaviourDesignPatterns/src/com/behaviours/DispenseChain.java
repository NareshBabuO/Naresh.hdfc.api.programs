package com.behaviours;

public interface DispenseChain {
	
	
	public void setNextChain(DispenseChain nextChain);
	
	public void dispense(Currency cur);

}
