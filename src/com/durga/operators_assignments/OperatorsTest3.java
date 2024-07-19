package com.durga.operators_assignments;

public class OperatorsTest3 {

	public static void main(String[] s) throws InstantiationException, IllegalAccessException, ClassNotFoundException {

		// new vs newInstance()
		Object obj=Class.forName(s[0]).newInstance();
		System.out.println(obj.getClass().getName());
		Test test=(Test)obj;
		test.action();

	}

}
