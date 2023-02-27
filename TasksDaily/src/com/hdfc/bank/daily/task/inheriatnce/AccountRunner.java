package com.hdfc.bank.daily.task.inheriatnce;

public class AccountRunner {

	public static void main(String[] args) {
		Person smith = new Person("Smith", 33);
		Account account = new Account(587450, 5000, smith);

		Person kathy = new Person("Kathy", 22);
		Account account1 = new Account(2258952, 3000, kathy);

		account.deposit(2000);
		account1.withdraw(2000);

		System.out.println(account);
		System.out.println(account1);

	}

}
