package com.hdfc.bank.daily.task.inheriatnce;

public class Account {

	private long accountNumber;
	private double balance;
	private Person accountHolder;
//	private double amount;

	public Account() {
		System.out.println("Default Constructor in Account");
		// TODO Auto-generated constructor stub
	}

	public Account(long accountNumber, double balance, Person accountHolder) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.accountHolder = accountHolder;
		System.out.println("Parameter Constr... in Account");
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public Person getAccountHolder() {
		return accountHolder;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setAccountHolder(Person accountHolder) {
		this.accountHolder = accountHolder;
	}

	public void deposit(double amount) {
		balance += amount;

	}

	public void withdraw(double amount) {
		if (balance - amount >= 500) {
			balance -= amount;
		} else {
			System.out.println("low Balance");
		}

	}

	public double getBalance(double balance) {
		return balance;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", balance=" + balance + ", accountHolder=" + accountHolder
				+ "]";
	}

}
