package com.hdfc.bank.treads;

public class ThreadDemo extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadDemo t1 = new ThreadDemo();
		t1.setPriority(NORM_PRIORITY);
		t1.setName("ThreadChild");
		System.out.println(t1);

		System.out.println(t1.getId() + " " + t1.getState());
		System.out.println(Thread.currentThread());
		t1.run();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("While run:" + Thread.currentThread().getName());
	}

}
