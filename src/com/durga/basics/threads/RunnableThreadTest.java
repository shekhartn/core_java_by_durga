package com.durga.basics.threads;

public class RunnableThreadTest {

	public static void main(String[] args) {
		MyRunnable runnable=new MyRunnable();
		Thread thread=new Thread(runnable);
		thread.start();
		
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Main Thread::"+(i+1));
		}
	}

}
class MyRunnable implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Child Thread::"+(i+1));
		}
	}
	
}