package com.durga.basics.threads;

public class ThreadJoinTest {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * join test
		 * 
		 * If a Thread wants to wait until completing some other Thread then we should go for join.
		 */
		VanueFixingThreadTest vanueThread=new VanueFixingThreadTest();
		CardsPrintingThreadTest printingThread=new CardsPrintingThreadTest();
		printingThread.vanueThread=vanueThread;
		CardsDistributionThreadTest distributionThread=new CardsDistributionThreadTest();
		distributionThread.printingThread=printingThread;
		distributionThread.start();
		printingThread.start();
		vanueThread.start();
		
		//sleep test
		System.out.println("M");
		Thread.sleep(3000);
		System.out.println("E");
		Thread.sleep(3000);
		System.out.println("G");
		Thread.sleep(3000);
		System.out.println("A");
		
		
	}

}
class VanueFixingThreadTest extends Thread{
	public void run() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Venue Confirmation");
	}
}
class CardsPrintingThreadTest extends Thread{
	static VanueFixingThreadTest vanueThread=null;
	public void run() {
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			vanueThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Cards printing");
	}
}
class CardsDistributionThreadTest extends Thread{
	static CardsPrintingThreadTest printingThread=null;
	public void run() {
		try {
			printingThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Cards distribution");
	}
}