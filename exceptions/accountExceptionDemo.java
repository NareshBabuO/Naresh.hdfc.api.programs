package com.hdfc.task.exceptions;

public class accountExceptionDemo {

	public static void main(String[] args) {

		int[] account = { 426588, 40011788, 440147785, 88223044 };
		double[] balance = { 5000, 7500, 650, 8500 };

		

		 for (int i = 0; i < account.length; i++) {
	            System.out.println("Account number: " + account[i] + ", Balance: " + balance[i]);

	            try {
	                if (balance[i] < 1000) {
	                    throw new BalanceIsLowException(
	                            " balance is low" + " " + "Account: "
	                                    + account[i] + ", Balance: " + balance[i]);
	                }
	            } catch (BalanceIsLowException e) {
	                System.out.println("Exception: " + e.getMessage());
	            }
	        }
	}

}
