package com.durga.access_modifiers;


public class InterfaceTest implements Interface3,Interface1,Interface2{

	public static void main(String[] args) {
		//System.out.println(name);
		System.out.println(Interface3.name);
		System.out.println(Interface2.name);
		System.out.println(Interface1.name);
	}

	@Override
	public void m2(String x) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String m3() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2(long x) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2(int x) {
		// TODO Auto-generated method stub
		
	}

}
 interface Interface1{
	 String name="Shekhar";
	 void m1();
	 void m2(int x);
	// int m3();
 }
 
 interface Interface2{
	 String name="Karthik";
	 void m1();
	 void m2(String x);
	 String m3();
 }
 
 interface Interface3 {//extends Interface2,Interface1{//We can't extent interface1 as return types are different m3()
	 String name="Ramesh";
	 void m1();
	 void m2(long x);
	 //Object m3(); //return type shouldn't be different
 }