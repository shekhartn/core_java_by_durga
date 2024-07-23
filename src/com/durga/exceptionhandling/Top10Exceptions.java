package com.durga.exceptionhandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Top10Exceptions {
	// static int i=10/0;
	static {
		String s = null;
		// System.out.println(s.length());
	}

	public static void main(String[] args) {
		// ArrayIndexOutOfBoundsException
		int[] x = new int[10];
		System.out.println(x[0]);// valid
		// System.out.println(x[100]);//AIOOBE
		// System.out.println(x[-100]);//AIOOBE

		// NullPointerException:
		// StackOverFlowError
		// methodOne();

		/*
		 * NoClassDefFoundError It is the child class of Error and hence it is
		 * unchecked. JVM will raise this error automatically whenever it is unable to
		 * find required .class file. Example: java Test If Test.class is not available.
		 * Then we will get NoClassDefFound error.
		 */
		/*
		 * ClassCastException It is the child class of RuntimeException and hence it is
		 * unchecked. Raised automatically by the JVM whenever we are trying to type
		 * cast parent object to child
		 */
		/*
		 * ExceptionInInitializerError It is the child class of Error and it is
		 * unchecked. Raised automatically by the JVM, if any exception occurs while
		 * performing static variable initialization and static block execution.
		 */

		/*
		 * IllegalArgumentException It is the child class of RuntimeException and hence
		 * it is unchecked. Raised explicitly by the programmer (or) by the APIdeveloper
		 * to indicate that a method has been invoked with inappropriate argument.
		 */
		Thread t = new Thread();
		t.setPriority(10);// valid
		// t.setPriority(100);//invalid

		/*
		 * NumberFormatException: It is the child class of IllegalArgumentException and
		 * hence is unchecked. Raised explicitly by the programmer or by the API
		 * developer to indicate that we are attempting to convert string to the number.
		 * But the string is not properly formatted.
		 */
		int i = Integer.parseInt("10");
		System.out.println(i);
		// int j=Integer.parseInt("ten");//NumberFormatException

		/*
		 * IllegalStateException It is the child class of RuntimeException and hence it
		 * is unchecked. Raised explicitly by the programmer or by the API developer to
		 * indicate that a method has been invoked at inappropriate time.
		 */
//		System.out.println(session.getId());
//		session.invalidate();
//		System.out.println(session.getId()); // illgalstateException

		/*
		 * AssertionError: It is the child class of Error and hence it is
		 * unchecked.Raised explicitly by the programmer or by API developer to indicate
		 * thatAssert statement fails.
		 */
		assert (false);

		// try with resources
		try (BufferedReader br = new BufferedReader(new FileReader("abc.txt"))) {
			// br=new BufferedReader(new FileReader("abc.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		/*
		 * multi catch block The main advantage of multi catch block is we can write a
		 * single catch block , which can handle multiple different exceptions In multi
		 * catch block, there should not be any relation between Exception types(either
		 * child to parent Or parent to child Or same type , otherwise we will get
		 * Compile time error )
		 */
		try {
			System.out.println("multi catch block");
			new BufferedReader(new FileReader("abc.txt"));
		} catch (ArithmeticException | NullPointerException e) {
			e.printStackTrace();
		} catch (ClassCastException | IOException e) {
			System.out.println(e.getMessage());
		}
		/*
		 * Exception Propagation Within a method if an exception raised and if that
		 * method doesn't handle that exception, then Exception object will be
		 * propagated to the caller then caller method is responsible to handle that
		 * exceptions. This process is called Exception Propagation.
		 */

		/*
		 * Rethrowing an Exception : To convert the one exception type to another
		 * exception type , we can use rethrowing exception concept.
		 */
		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {
			throw new NullPointerException();
		}
	}

	public static void methodOne() {
		methodTwo();
	}

	public static void methodTwo() {
		methodOne();
	}

}
