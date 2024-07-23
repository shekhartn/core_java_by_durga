package com.durga.exceptionhandling;

/*Sometimes we can create our own exception to meet our programming requirements. 
Such type of exceptions are called customized exceptions (user defined exceptions).

1. InSufficientFundsException
2. TooYoungException
3. TooOldException

*/
public class CustomizedExceptionTest {

	public static void main(String[] args) {
		int age = Integer.parseInt(args[0]);
		if (age > 60) {
			throw new TooOldException("u r age already crossed....no chance of getting married");
		} else if (age < 18) {
			throw new TooYoungException("please wait some more time.... u will get best match");
		} else {
			System.out.println("you will get match details soon by e-mail");
		}
	}

}

class TooYoungException extends RuntimeException {
	TooYoungException(String s) {
		super(s);
	}
}

class TooOldException extends RuntimeException {
	TooOldException(String s) {
		super(s);
	}
}
