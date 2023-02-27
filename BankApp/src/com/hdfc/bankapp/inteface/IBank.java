package com.hdfc.bankapp.inteface;

public interface IBank {

	public static final String IFSC = "HDFC001";

	public abstract void deposit();

	public abstract void withdraw();

}
