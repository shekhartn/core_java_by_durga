package com.durga.enhances.threads;

public class ThreadGroupTest {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
		ThreadGroup pg = new ThreadGroup("Parent Group");
		System.out.println(pg.getParent().getName());
		ThreadGroup cg = new ThreadGroup(pg, "Child Group");
		System.out.println(cg.getParent().getName());

		// priorities
		ThreadGroup g1 = new ThreadGroup("tg");
		Thread t1 = new Thread(g1, "Thread 1");
		Thread t2 = new Thread(g1, "Thread 2");
		g1.setMaxPriority(3);
		Thread t3 = new Thread(g1, "Thread 3");
		System.out.println(t1.getPriority());// 5
		System.out.println(t2.getPriority());// 5
		System.out.println(t3.getPriority());// 3

		// methods test
		ThreadGroup pg1 = new ThreadGroup("Parent Group");
		ThreadGroup cg1 = new ThreadGroup(pg1, "Child Group");
		MyThread mt1 = new MyThread(pg1, "Child Thread 1");
		MyThread mt2 = new MyThread(pg1, "Child Thread 2");
		mt1.start();
		mt2.start();
		System.out.println(pg1.activeCount());
		System.out.println(pg1.activeGroupCount());
		pg1.list();
		Thread.sleep(5000);
		System.out.println(pg.activeCount());
		pg1.list();
	}

}

class MyThread extends Thread {
	MyThread(ThreadGroup g, String name) {
		super(g, name);
	}

	public void run() {
		System.out.println("Child Thread");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
	}
}
