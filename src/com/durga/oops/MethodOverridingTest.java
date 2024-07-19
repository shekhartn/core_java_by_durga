package com.durga.oops;

public class MethodOverridingTest {
	
	int x=888;
	static int y=111;
	
	void method() {
		System.out.println("parent method");
	}
	//private 
	
	private int method(int x) {
		System.out.println("priavte parent method int");
		return x;
	}
	Object method(float x) {
		System.out.println("parent method float return object");
	return new Object();
	}
	void method(String x) {
		System.out.println("parent method string");
	}
	void method(Object x) {
		System.out.println("method object");
	}
	void method(StringBuffer x) {
		System.out.println("method StringBuffer");
	}
	
	static void method(int i,int j) {
		System.out.println("parent static");
	}
	 void method(int... j) {
		System.out.println("parent var arg");
	}
	
	public static void main(String[] args) {
		MethodOverridingTest mot1=new Test1();
		Test1 mot2=new Test1();
		MethodOverridingTest mot3=new MethodOverridingTest();
		
		mot1.method();
		mot1.method(10f);
		
		System.out.println();
		mot1.method(10);
		mot2.method(10);//We can't access private from outside the class
		mot2.method(10f);
		
		System.out.println();
		//static
		mot1.method(0, 0);
		mot2.method(0, 0);
		
		System.out.println();
		//var arg method
		mot1.method(new int[] {1,2,3});
		mot2.method(new int[] {1,2,3});
		mot3.method(new int[] {1,2,3});
		
		System.out.println();
		System.out.println(mot1.x);
		System.out.println(mot1.y);
		System.out.println();
		System.out.println(mot2.x);
		System.out.println(mot2.y);
		System.out.println();
		System.out.println(mot3.x);
		System.out.println(mot3.y);
		System.out.println();

	}

}

 class Test1 extends MethodOverridingTest{
	 
	 int x=999;
	 static int y=222;
	 
	void method() {
		System.out.println("child method");
	}
	
	private int method(int x) {
		System.out.println("priavte child method int");
		return x;
	}
	String method(float x) {//This won't applicable for primitives
		System.out.println("child method float return String");
	return "Shekhar T";
	}
	
	//abstract method(String s);//We can restrict parent method overriding here
	static void method(int i,int j) {
		System.out.println("child static");
	}
	
//	void method(int... j) {
//		System.out.println("child var arg");
//	}
	void method(int[] j) {
		System.out.println("child var arg");
	}
	
}
