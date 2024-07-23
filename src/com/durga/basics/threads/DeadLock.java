package com.durga.basics.threads;

public class DeadLock implements Runnable {

	DeadLockDemo1 demo1 = new DeadLockDemo1();
	DeadLockDemo2 demo2 = new DeadLockDemo2();

	DeadLock() {
		new Thread(this).start();
		demo1.foo(demo2);//main thread
	}

	@Override
	public void run() {
		demo2.bar(demo1);//child thread

	}

	public static void main(String[] args) {
		new DeadLock();
	}

}

class DeadLockDemo1 {
	public synchronized void foo(DeadLockDemo2 demo2) {
		System.out.println("Thread1 starts execution of foo() method");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		System.out.println("Thread1 trying to call b.last()");
		demo2.last();
	}

	public synchronized void last() {
		System.out.println("inside DeadLockDemo1, this is last()method");
	}

}

class DeadLockDemo2 {
	public synchronized void bar(DeadLockDemo1 demo1) {
		System.out.println("Thread2 starts execution of bar() method");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		System.out.println("Thread2 trying to call a.last()");
		demo1.last();
	}

	public synchronized void last() {
		System.out.println("inside DeadLockDemo2, this is last() method");
	}

}