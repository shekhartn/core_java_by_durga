package com.durga;

public class VariablesTest {
	
	String name1="Shekhar";//instance variables or object level variables or attributes
	
	static String name2="Suresh"; //Static variables
	static String qualification="Farmer"; 
	
	int[] a;
	
	
	public void action(int i) {
		//For the local variables JVM won't provide any default values compulsory we should perform initialization explicitly before using that variable.
		String s="user";//Local variable/temporary/automatic/stack variables
		i=i+10;
		System.out.println(i);
	}
	
	public static void varArgMethod(int... a) {
		int total=0;
		for(int i=0;i<a.length;i++) {
			total= total+a[i];
		}
		System.out.println("The Sum::"+total);
	}
	public static void varArgMethod1(int...a) {
	}
	public static void varArgMethod2(int ...a) {
	}
	public static void varArgMethod3(int[] ...a) {
	}
	public static void varArgMethod4(int k,int[] ...a) {
	}
	public static void varArgMethod5(int[][] ...a) {
	}

	public static void main(String[] args) {
		String name3="Ramesh";//local variables
		
		VariablesTest vt=new VariablesTest();
		int i=10;
		vt.action(i);
		System.out.println(i);
		System.out.println(vt.qualification);// static variables can be accessed with object references also
		
		String qualification="Software Engineer";//if static and local variable is declared with name, local variable overrides static otherwise static variable prints
		System.out.println(qualification);
		System.out.println(VariablesTest.qualification);
		
		System.out.println(name2);
		System.out.println(name3);
		
		int x;//
		x=15;//it break line number 38 if it is commented
		for (int i1=0;i1<10;i1++) {
			x=10;
		}
		System.out.println(x);//value should be initiated explicitly
		
		
		
		//arrays test
		System.out.println(vt.a);//null
		//System.out.println(vt.a[0]);//Null pointer exceptio
		
		int[] k=new int[5];
		System.out.println(k[0]);
		
		//var-arg method
		varArgMethod(10,20,30);
		varArgMethod(10,20,30,40);
		varArgMethod3(new int[]{10,20,30,40});
		varArgMethod3(new int[] {10,20,30,40});
		
		

	}

}
