package com.durga.exceptionhandling;

import java.io.FileNotFoundException;

public class TryCatchTest {

	public static void main(String[] args) {

		// Without try catch
		// System.out.println("statement1");
		// System.out.println(10 / 0);// risky code
		// System.out.println("statement3");// this statement won't be executed

		// With try catch
//		System.out.println("statement1");
//		try {
//			System.out.println(10 / 0);// risky code
//		} catch (ArithmeticException e) {
//			System.out.println(10 / 2);// Handling code
//		}
//		System.out.println("statement3");

		// With try catch
		System.out.println("statement1");
		try {
			System.out.println("statement2");
			System.out.println("statement3");
			System.out.println(10 / 0);// risky code
			System.out.println("statement4");
		} catch (ArithmeticException e) {// If try with multiple catch blocks present then order of catch blocks is very
											// important. It should be from child to parent by mistake if we are taking
											// from parent to child then we will get Compile time error saying
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println(10 / 2);// Handling code
		} catch (Exception e) {
			System.out.println("default Exception");
		} finally {
			System.out.println("finally block clean up code");
		}
		System.out.println("statement5");

		// finally test
		try {
			System.out.println("try block executed");
			// System.out.println(10 / 0);
		} catch (NullPointerException e) {
			System.out.println("catch block executed");
		} finally {
			System.out.println("finally block executed");
		}

		/*
		 * return Vs finally: Even though return statement present in try or catch
		 * blocks first finally will be executed and after that only return
		 * statementwill be considered. i.efinally block dominates return statement.
		 */
		try {
			System.out.println("try block executed");
			// return;
		} catch (ArithmeticException e) {
			System.out.println("catch block executed");
		} finally {
			System.out.println("finally block executed");
		}

		System.out.println("finally return::" + m1());

		/*
		 * finally vs System.exit(0): There is only one situation where the finally
		 * block won't be executed is whenever we are using System.exit(0) method. When
		 * ever we are using System.exit(0) then JVM itself will be shutdown , in this
		 * case finally block won't be executed.
		 */
		try {
			System.out.println("try");
			//System.exit(0);
		} catch (ArithmeticException e) {
			System.out.println("catch block executed");
		} finally {
			System.out.println("finally block executed");
		}

		// nested try-catch-finally
		try {
			System.out.println("stmt-1");
			System.out.println("stmt-2");
			System.out.println("stmt-3");
			try {
				System.out.println("stmt-4");
				System.out.println("stmt-5");
				System.out.println(10/0);
				System.out.println("stmt-6");
			} catch (Exception e) {
				System.out.println("stmt-7");
			} finally {
				System.out.println("stmt-8");
			}
			System.out.println("stmt-9");
		} catch (ArithmeticException e) {
			System.out.println("stmt-10");
		} finally {
			System.out.println("stmt-11");
		}
		System.out.println("stmt-12");

	}

	@SuppressWarnings("finally")
	private static int m1() {
		try {
			System.out.println(10 / 0);
			return 777;
		} catch (ArithmeticException e) {
			return 888;
		} finally {
			return 999;
		}
	}
}
