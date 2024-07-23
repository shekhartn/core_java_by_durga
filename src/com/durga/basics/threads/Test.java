package com.durga.basics.threads;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// Defining a thread
		// By extending Thread class
		MyThread thread = new MyThread();
		// thread.start();
		// thread.run();
//		for (int i=0;i<10;i++) {
//			Thread.sleep(500);
//			System.out.println("Main thread-"+(i+1));
//		}

		// overloading run() method
		MyThread1 thread1 = new MyThread1();
		thread1.start();
		System.out.println("Main method");
		
		// overriding start() method and case 9
		thread1.start();
		//thread1.start();//case 9 IllegalThreadStateException
		
		
		
	}

}

class MyThread extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Child thread-" + (i + 1));
		}
	}
}

class MyThread1 extends Thread {
	public void run() {
		System.out.println("run method");
	}
	public void run(int i) {
		System.out.println("single args run()");
	}
	public void start() {
		super.start();//run method executes
		System.out.println("start method");
	}
}
