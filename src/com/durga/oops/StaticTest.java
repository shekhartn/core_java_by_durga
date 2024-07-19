package com.durga.oops;
//Read indirectly write only state
public class StaticTest{
	//static int x=10;
	//creating without main 1
	/*
	 * static { System.out.println(x); System.exit(0); }
	 */
	//static int x=10;//It won't work
	
	//creating without main 2
//	static int x=m1();
//	static int m1() {
//		System.out.println("Printing without main method");
//		System.exit(0);
//		return 10;
//	}
	//creating without main 3
//	static StaticTest x=new StaticTest();
//	StaticTest() {
//		System.out.println("Printing without main method from constructor loading");
//		System.exit(0);
//	}
	//creating without main 4
	static StaticTest x=new StaticTest();
	{
		System.out.println("instance block without main method");
		System.exit(0);
	}
	
}