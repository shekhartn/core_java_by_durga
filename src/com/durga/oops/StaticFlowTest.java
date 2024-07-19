package com.durga.oops;

public class StaticFlowTest {
	static int x=10;//1 7
	static {//2 
		m1(); //8
		System.out.println("First static block");//10
	}

	public static void main(String[] args) {//3
		m1(); //13
		System.out.println("Main Method"); //15
		
	}

	public static void m1() {//4 
		System.out.println(x+"\t"+y);//9 14
	}
	static {//5 
		System.out.println("Second static block");//11
	}
	static int y=20;//6 //12
}


