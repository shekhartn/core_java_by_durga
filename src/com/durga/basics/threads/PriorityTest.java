package com.durga.basics.threads;

public class PriorityTest {

	public static void main(String[] args) {
		ThreadTest2 thread=new ThreadTest2();
		thread.setPriority(10);
		thread.start();
		for(int i=0;i<10;i++) {
			System.out.println("Main thread:"+(i+1));
		}
	}

}
class ThreadTest2 extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Child thread:"+(i+1));
		}
	}
}