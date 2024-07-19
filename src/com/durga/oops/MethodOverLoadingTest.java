package com.durga.oops;

public class MethodOverLoadingTest {
	
	void method() {
		System.out.println("method");
	}
	void method(int x) {
		System.out.println("method int");
	}
	void method(float x) {
		System.out.println("method float");
	}
//	void method(String x) {
//		System.out.println("method string");
//	}
	void method(Object x) {
		System.out.println("method object");
	}
//	void method(StringBuffer x) {
//		System.out.println("method StringBuffer");
//	}
	public static void main(String[] args) {
		MethodOverLoadingTest mot=new MethodOverLoadingTest();
		mot.method();
		mot.method(10);
		mot.method((byte)10);
		mot.method(10f);
		//mot.method((double)10.55);
		mot.method(10.55f);
		mot.method("Shekhar");
		mot.method(new Object());
		mot.method(10);
		
		mot.method("Shekhar");
		mot.method(null);
		

	}

}
