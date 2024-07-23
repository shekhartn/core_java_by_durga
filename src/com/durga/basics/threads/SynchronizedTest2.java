package com.durga.basics.threads;

public class SynchronizedTest2 {

	// class level synchronization
	static synchronized void display(String time, String name) {
		System.out.println("Hey," + time + " Mr." + name + " executed by " + Thread.currentThread().getName());
		try {
			for (int i = 0; i < 3; i++) {
				System.out.println("Mike testing by " + name + " :::" + (i + 1));
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
		}
	}

	static void drawing() {
		System.out.println("Drawing by " + Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
	}

	void singing() {
		System.out.println("Singing by " + Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
	}

	void dancing() {
		System.out.println("Dancing by " + Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
	}

	public static void main(String[] args) {
		SynchronizedTest2 test1 = new SynchronizedTest2();
		SynchronizedTest2 test2 = new SynchronizedTest2();
		SynchronizedTest2 test3 = new SynchronizedTest2();
		SynchronizedTest2 test4 = new SynchronizedTest2();
		SynchronizedDemo1 demo1 = new SynchronizedDemo1(test1, "Good Evening", "Shekhar");
		SynchronizedDemo1 demo2 = new SynchronizedDemo1(test2, "Good Morning", "Karthik");
		SynchronizedDemo1 demo3 = new SynchronizedDemo1(test3, "Good night", "Ramesh");
		SynchronizedDemo1 demo4 = new SynchronizedDemo1(test4, "Good afternoon", "Hanmanthu");

		demo1.start();
		demo2.start();
		demo3.start();
		demo4.start();

	}

}

class SynchronizedDemo1 extends Thread {
	private SynchronizedTest2 test;
	private String time;
	private String name;

	public SynchronizedDemo1(SynchronizedTest2 test, String time, String name) {
		this.test = test;
		this.time = time;
		this.name = name;
		this.setName("Thread-" + name);
	}

	public void run() {
		test.display(time, name);
		test.dancing();
		test.drawing();
		test.singing();
	}
}