package com.durga.basics.threads;

public class ThreadDeamonTest {

	public static void main(String[] args) {
		// Daemon threads will in background
		System.out.println(Thread.currentThread().isDaemon());// main thread is always non daemon thread.So child also
																// non daemon by default
		DeamonTest t = new DeamonTest();
		System.out.println(t.isDaemon()); // 1
		//t.setDaemon(true);
		t.start();
		// t.setDaemon(true);//We can't set daemon flag after starting thread
		System.out.println(t.isDaemon());
		System.out.println("main thread");
	}

}

class DeamonTest extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("lazy thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
		}
	}
}