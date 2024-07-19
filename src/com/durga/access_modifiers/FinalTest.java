package com.durga.access_modifiers;

public class FinalTest {
	final int x;
	final static int y;
	FinalTest(){
		x=30;
	}
//	{
//		x=10;
//	}
	
	static {
		y=20;
	}
	
	void main() {
		final int x;
		//System.out.println(x);//won't work
		System.out.println("Hello");
	}
	
	static void main1() {
		//System.out.println(x);//Can't be accessed from static
		System.out.println(new FinalTest().x);
	}

	public static void main(String[] args) {
		main1();
	}

}
