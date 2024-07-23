package com.durga.exceptionhandling;

/*Exception: An unwanted unexpected event that disturbs normal flow of the program is called exception.
 * The main objective of exception handling is graceful (normal) termination of the program.
 * Exception handling doesn't mean repairing an exception. We have to define alternative way to continue rest of the program normally. This way of defining alternative isnothing but exception handling.
 *
 * 
 * Throwable acts as a root for exception hierarchy. 
 * Throwable class contains the following two child classes(Exception,Errors)
 * 
 * Exception:Most of the cases exceptions are caused by our program and these are recoverable.
 * Error:Most of the cases errors are not caused by our program these are due to lack of system resources and these are non-recoverable.
 * Error Ex :If OutOfMemoryError occurs being a programmer we can't do anything the program will be terminated abnormally.System Admin or Server Admin is responsible to raise/increase heap memory.
 * */
public class Test {

	//default exception handler
	public static void main(String[] args) {//in this case main hand overs default exception handler for handling
		doStuff();
	}

	public static void doStuff() {
		doMoreStuff();
	}

	public static void doMoreStuff() {
		System.out.println(10 / 0);//exception is not handled 
	}

}
