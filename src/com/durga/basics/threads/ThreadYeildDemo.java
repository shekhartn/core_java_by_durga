package com.durga.basics.threads;

public class ThreadYeildDemo {

	
	public static void main(String[] args) {
		/* yield test 
		 * To pause current executing Thread for giving the chance of remaining waiting Threads of same priority.
		 * */
		ThreadYeildTest test=new ThreadYeildTest();
		test.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("main thread");
		}
	}

}

class ThreadYeildTest extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			Thread.yield();
			System.out.println("child thread");
		}
	}
}
