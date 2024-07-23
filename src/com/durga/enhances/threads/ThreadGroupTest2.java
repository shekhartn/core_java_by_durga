package com.durga.enhances.threads;

public class ThreadGroupTest2 {

	public static void main(String[] args) throws InterruptedException {
		// All threads belongs to system group
		ThreadGroup system = Thread.currentThread().getThreadGroup().getParent();
		Thread[] t = new Thread[system.activeCount()];
		system.enumerate(t);
		for (Thread t1 : t) {
			System.out.println(t1.getName() + "-------" + t1.isDaemon());
		}
	}

}
