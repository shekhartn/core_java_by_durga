package com.durga.basics.threads;

public class SynchronizedTest {

	// object level synchronization
	 synchronized void display(String time, String name) {
		System.out.print("Hey," + time);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		System.out.println(" Mr."+name);
	}

	public static void main(String[] args) {
		// object level synchronization is achieved with using same object in diff threads & using static on display method
		SynchronizedTest test = new SynchronizedTest();
		SynchronizedDemo demo1 = new SynchronizedDemo(test, "Good Evening", "Shekhar");
		SynchronizedDemo demo2 = new SynchronizedDemo(test, "Good Morning", "Karthik");
		demo1.start();
		demo2.start();
		try {
			Thread.sleep(11000);
		} catch (InterruptedException e) {
		}
		// object level synchronization breaks by using different objects
		SynchronizedDemo demo3 = new SynchronizedDemo(new SynchronizedTest(), "Good night", "Ramesh");
		SynchronizedDemo demo4 = new SynchronizedDemo(new SynchronizedTest(), "Good afternoon", "Hanmanthu");
		demo3.start();
		demo4.start();
		
		//// class level synchronization is achieved with using static on display method
	}

}

class SynchronizedDemo extends Thread {
	private SynchronizedTest test;
	private String time;
	private String name;

	public SynchronizedDemo(SynchronizedTest test, String time, String name) {
		this.test = test;
		this.time = time;
		this.name = name;
	}

	public void run() {
		test.display(time, name);
	}
}