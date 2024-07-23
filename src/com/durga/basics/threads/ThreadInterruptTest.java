package com.durga.basics.threads;

public class ThreadInterruptTest {

	public static void main(String[] args) {
		ThreadInterrup t = new ThreadInterrup();
		t.start();
		//This method will be executed when thread t is in sleep state
		t.interrupt(); // --->1
		System.out.println("end of main thread");
	}

}

class ThreadInterrup extends Thread {
	public void run() {
		try {
			for (int i = 0; i < 15; i++) {
				System.out.println("i am lazy Thread :" + i);
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			System.out.println("i got interrupted");
		}
	}
}