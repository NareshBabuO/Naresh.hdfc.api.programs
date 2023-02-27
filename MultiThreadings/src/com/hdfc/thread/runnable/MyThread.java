package com.hdfc.thread.runnable;

public class MyThread implements Runnable {

	public static void main(String[] args) {

		Runnable t = new MyThread();
		Thread td = new Thread(t);
		td.setName("Thread-1");

		td.start();

		Thread td1 = new Thread(t);

		td1.setName("Thread-2");
		td1.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}

}
