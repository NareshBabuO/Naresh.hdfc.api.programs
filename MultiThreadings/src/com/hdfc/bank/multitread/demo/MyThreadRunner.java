package com.hdfc.bank.multitread.demo;

public class MyThreadRunner {

	public static void main(String[] args) {

		MyThread myThread = new MyThread();
		myThread.setName("Child-1");
		myThread.start();

		MyThread myThread2 = new MyThread();
		myThread2.setName("Child-2");
		myThread2.start();

	}

}
