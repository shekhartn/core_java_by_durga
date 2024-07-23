package com.durga.basics.threads;

public class ThreadTest {

	public static void main(String[] args) throws InterruptedException {
		//get & set thread names
		MyThread t=new MyThread();
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(9);
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(t.getName());//Thread-0
		Thread.currentThread().setName("Shekhar Thread");
		System.out.println(Thread.currentThread().getName());//Shekhar Thread
		
		//get & set priority of thread & default priority highrachy
		System.out.println(Thread.currentThread().getPriority());
		for(int i=1;i<=5;i++) {
			MyThreadTest1 thread=new MyThreadTest1();
			//thread.setName("Thread-"+i);
			//thread.setPriority(i);//if We are not setting priority default priority will be applicable of main thread
			thread.start();
			//Thread.sleep(500);
		}
		
		
		
		
		
	}
	

	
}
class MyThreadTest1 extends Thread
{
	public void run() {
		System.out.println("Thread Name:"+this.getName());
		System.out.println("Thread Priority:"+this.getPriority());
//		try {
//			//Thread.sleep(500);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
	}
}