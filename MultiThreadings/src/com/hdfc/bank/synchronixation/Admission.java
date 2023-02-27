package com.hdfc.bank.synchronixation;

public class Admission implements Runnable {

	static int seats = 60;

	public static void main(String[] args) {

		Admission ad = new Admission();
		Thread thread = new Thread(ad, "Nagesh");
		Thread thread1 = new Thread(ad, "Ramesh");

		System.out.println("***Welcome***");
		System.out.println("No of Seats: " + seats);
		thread.start();
		thread1.start();

	}

	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub

		if (seats > 0) {

			try {
				Thread.sleep(1000);
				
				System.out.println("seat Allocated to: " + Thread.currentThread().getName());
				
				seats = seats + 1;
			} 
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("seat is full, Please Try next Year");
		}
	}

}
