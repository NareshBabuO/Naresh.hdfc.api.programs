package com.hdfc.bank.multitread.demo;

public class MyThread extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub

		for (int i = 1; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());
			super.run();
		}
	}
}
