package com.durga.access_modifiers;
// Java Program to demonstrate the 

public class VolatileTest {
	static volatile int MY_INT = 0;

	public static void main(String[] args) {
		new ChangeListener().start();
		new ChangeMaker().start();
	}

}

class ChangeListener extends Thread {
	@Override
	public void run() {
		int local_value = VolatileTest.MY_INT;
		while (local_value < 5) {
			if (local_value != VolatileTest.MY_INT) {
				System.out.println("Got Change for MY_INT : {0}" + VolatileTest.MY_INT);
				local_value = VolatileTest.MY_INT;
			}
		}
	}
}

class ChangeMaker extends Thread {
	@Override
	public void run() {
		int local_value = VolatileTest.MY_INT;
		while (VolatileTest.MY_INT < 5) {
			System.out.println("Incrementing MY_INT to {0}" + (local_value + 1));
			VolatileTest.MY_INT = ++local_value;
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
