package com.durga.operators_assignments;

public class OperatorsTest1 {

	public static void main(String[] args) {

		//INCREMENTAL  & DECREMENTAL OPERATORS ++,--
		byte a=10;
		System.out.println(a++);
		//System.out.println(++(a++));//Nesting won't work
		System.out.println(++a);
		System.out.println(a--);
		System.out.println(--a);
		byte b=20;
		b=(byte)(b+1);//It won't work without type case
		System.out.println(b);
		b++;
		System.out.println(b);
		//byte c=(byte))a+b;//it won't work
		int c=a+b;
		System.out.println(c);
		double d=10.55;
		d++;
		System.out.println(d);
		char e='g';
		System.out.println(++e);
		System.out.println((int)++e);
		
		//ARITHMETIC OPERATORS +,-,/,%
		/* byte + byte=byte
		 * byte + short=short
		 * short + int=int
		 * int + long =long
		 * long + float=float */
		int f=10;
		//System.out.println(f/0);//ArithmeticException: / by zero
		//System.out.println(0/0);//ArithmeticException: / by zero
		
		float g=10.55f;
		System.out.println(f/0.0); //Infinity
		System.out.println(0/0.0); //NaN
		System.out.println(-0/0.0); //NaN
		
		//Nan test
		int h=10;
		System.out.println(h>Float.NaN);
		System.out.println(h<Float.NaN);
		System.out.println(h==Float.NaN);
		System.out.println(h!=Float.NaN);
		
		//String concatination operaters
		int i=10,j=20,k=30;
		String l="Shekhar";
		System.out.println(i+j+k+l);
		System.out.println(i+j+l+k);
		System.out.println(i+l+j+k);
		System.out.println(l+i+j+k);
		
		//Relational Operators >,<,>=,<=
		int m=10,n=20;
		System.out.println(m>n);
		//System.out.println(10<20<30);//Nesting won't work
		
		//Equalility Operators ==,!=
		System.out.println(10==10);
		System.out.println('a'==10);
		System.out.println(12.3==14.7);
		System.out.println(true!=false);
		
		Object o=new Object();
		Thread p=new Thread();
		Thread r=p;
		String q=new String("String");
		
		System.out.println(o==p);
		//System.out.println(p==q);//this won't work
		System.out.println(p==r);
		System.out.println(o==q);
		System.out.println(o==null);
		
		// instanceof operator
		Short s=15;
		System.out.println(s instanceof Short);
		System.out.println(s instanceof Number);
		System.out.println(s instanceof Object);
		
		System.out.println(p instanceof Thread);
		System.out.println(null instanceof Thread);//always gives false
		System.out.println(p instanceof Object);
		System.out.println(p instanceof Runnable);
		o=new Integer(10);
		System.out.println(o instanceof Thread);//Parent to child always gives false
		//System.out.println(p instanceof String); // It won't work
		
		//Bit wise Operators(&,|,^(if both operands different gives true))
		System.out.println(true&true);
		System.out.println(true|false);
		System.out.println(true^true);
		System.out.println(true^false);
		System.out.println(false|false);
		
		System.out.println(4&5);
		System.out.println(5|4);
		System.out.println(5^4);
		
		//Bitwise complement operator ~
		System.out.println(~5);
		//System.out.println(~5true);//It won't be applied boolean
		
		//Boolean complement operator !
		//System.out.println(!5);//It won't be applied integrals
		System.out.println(!true);//false
		
		//Short Circuit Operators &&,||
		int x=10,y=15;
		if (++x < 10 && ++y > 15) { // instead of || using &,&&, | operators
			x++;
		} else {
			y++;
		}
		System.out.println(x+"........"+y);// ||-->12,16 :: |-->12,16 :: &-->11,17 :: &&-->11,16
		
		
		
		
		
		
		
		
	}

}
