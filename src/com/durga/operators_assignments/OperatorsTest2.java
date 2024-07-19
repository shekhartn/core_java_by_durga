package com.durga.operators_assignments;

public class OperatorsTest2 {

	public static void main(String[] args) {
		int x=140;
		byte y=(byte)x;
		short z=(short)x;
		System.out.println(y);
		System.out.println(z);
		
		//Simple & Chained Assignment operators
		int a,b,c,d,e;
		a=b=c=d=e=20;
		System.out.println(a+" "+b+" "+c+" "+d+" "+e);
		System.out.println(a+b+c+d+e);
		
		//Chained Assignment operators /=,%=,+=,-=,&=,!=,^=,>>=,<<=,>>>=
		
		a+=b-=c*=d/=e%=200;
		System.out.println(a+" "+b+" "+c+" "+d+" "+e);
		
		//Conditional Operator ? :
		int g=(10>20)?30:((40>50)?60:70);
		System.out.println(g);
		
		/* 
		 *  1. Unary operators: [] , x++ , x-- , ++x , --x , ~ , ! , new , <type> 
			2. Arithmetic operators : * , / , % , + , - . 
			3. Shift operators : >> , >>> , << .
			4. Comparision operators : <, <=,>,>=, instanceof.
			5. Equality operators: == , != 
			6. Bitwise operators: & , ^ , | .
			7. Short circuit operators: && , || .
			8. Conditional operator: (?:)
			9. Assignment operators: += , -= , *= , /= , %= . . .
		 *  */
		
		System.out.println(m1(1)+m1(2)*m1(3)/m1(4)*m1(5)+m1(6));
	}
	
	public static int m1(int i) {
		System.out.println(i);
		return i;
		}

}
