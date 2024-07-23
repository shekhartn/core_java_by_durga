package com.durga.basics.threads;

public class ThreadStopTest extends Thread {

	@Override
	public void run() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
		}
		for(int i=0;i<10;i++) {
			if(i==5) {this.stop();}
			System.out.println("i="+(i+1));
		}
	}

	public static void main(String[] args) {
		new ThreadStopTest().start();
	}

}
