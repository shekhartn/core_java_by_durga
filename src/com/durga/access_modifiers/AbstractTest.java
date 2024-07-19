package com.durga.access_modifiers;

public abstract class AbstractTest {// classes must be an abstract class to define abstract methods
	abstract void method1();

	abstract void method2();

	abstract void method3();

	public static void main(String[] args) {
		// AbstractTest at=new AbstractTest() ; //abstract classes can't be initiated
		AbstractTest at=new Child();
		at.method1();
	}
}

	abstract class Child1 extends AbstractTest {

		@Override
		void method1() {
			System.out.println("Child1 method1");
		}

	}

	abstract class Child2 extends Child1 {

		@Override
		void method2() {
			System.out.println("Child2 method2");

		}

	}

	abstract class Child3 extends Child2 {

		@Override
		void method3() {
			System.out.println("Child3 method3");

		}
	}
class Child extends Child3{}

