package com.durga;

public class MainTest {

	//public static void main(String[] args) {}
	//public static void main(String...args) {}
	public static void main(String...args) {
		System.out.println("MAIN PARENT..........");
		for(String s:args) {
			System.out.println(s);
		}
	}
	//public final static void main(String...s) {} //final
	//public strictfp final static void main(String...s) {}
	//public synchronized final static void main(String...s) {}

}
