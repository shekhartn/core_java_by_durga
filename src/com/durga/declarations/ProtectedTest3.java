package com.durga.declarations;

import com.durga.access_modifiers.ProtectedTest1;

public class ProtectedTest3 extends ProtectedTest1{

	public static void main(String[] args) {
		ProtectedTest1 pt1=new ProtectedTest1();
		//pt1.method1(); //It can't be accessed
		
		ProtectedTest1 pt2=new ProtectedTest3();
		//pt2.method1(); //It can't be accessed
		ProtectedTest3 pt3=(ProtectedTest3) pt2;
		pt3.method1(); //It can be accessed
		
	}
}
