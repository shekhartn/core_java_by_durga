package com.durga.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

/*Sometimes we can create Exception object explicitly and we can hand over to the JVM manually by using throw keyword.
 * 
 * 
 * */
public class ThrowTest {

	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		// System.out.println(10/0);//In this case creation of ArithmeticException
		// object and handover to the jvm will be
		// performed automatically by the main() method.
		/*
		 * In this case we are creating exception object explicitly and hand over to the
		 * JVM manually. Note: In general we can use throw keyword for customized
		 * exceptions but not for predefined exceptions.
		 * 
		 * We can use throw keyword only for Throwable types otherwise we will get
		 * compile time error saying incomputable types.
		 * 
		 * 
		 */
		// throw new ArithmeticException("Customized exception:: 1/zero");
		// throw null;//NullPointerException

		/*
		 * In our program if there is any chance of raising checked exception then
		 * compulsory we should handle either by try catch or by throws keyword
		 * otherwise the code won't compile. We can use throws keyword to delegate the
		 * responsibility of exception handling to the caller method. Then caller method
		 * is responsible to handle that exception.
		 * 
		 * "throws" keyword required only checked exceptions. Usage of throws for
		 * unchecked exception there is no use. "throws" keyword required only to
		 * convince complier. Usage of throws keyword doesn't prevent abnormal
		 * termination of the program.Hence recommended to use try-catch over throws
		 * keyword.
		 * 
		 * We can use throws keyword only for constructors and methods but not for classes.
		 */
		PrintWriter out = new PrintWriter("abc.txt");
		out.println("hello");
		
		doStuff();//throws handling
		
		//We can't handle fully checked exceptions if there no raise of exception in try block. This rule is applicable only for checked exceptions
		try {
			System.out.println("Hello");
			PrintWriter out1 = new PrintWriter("abc.txt");
		}
		catch(IOException e) {}
		
		/*
		 * Exception handling keywords summary: 
		 * 1. try: To maintain risky code. 
		 * 2.catch: To maintain handling code. 
		 * 3. finally: To maintain cleanup code. 
		 * 4.throw: To hand over our created exception object to the JVM manually.
		 * 5.throws: To delegate responsibility of exception handling to the caller method.
		 */
	}

	public static void doStuff() throws InterruptedException {
		doMoreStuff();
		Thread.sleep(5000);
		System.out.println("doStuff");
	}

	public static void doMoreStuff() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("doMoreStuff");
	}

}
