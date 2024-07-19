package com.durga.access_modifiers;
// Java program to demonstrate transient keyword 
// Filename Test.java 
import java.io.*; 
class TransientTest implements Serializable 
{ 
	// Normal variables 
	int i = 10, j = 20; 

	// Transient variables 
	transient int k = 30; 

	// Use of transient has no impact here 
	transient static int l = 40; 
	transient final int m = 50; 

	public static void main(String[] args) throws Exception 
	{ 
		TransientTest input = new TransientTest(); 

		// serialization 
		FileOutputStream fos = new FileOutputStream("transient.txt"); 
		ObjectOutputStream oos = new ObjectOutputStream(fos); 
		oos.writeObject(input); 

		// de-serialization 
		FileInputStream fis = new FileInputStream("transient.txt"); 
		ObjectInputStream ois = new ObjectInputStream(fis); 
		TransientTest output = (TransientTest)ois.readObject(); 
		System.out.println("i = " + output.i); 
		System.out.println("j = " + output.j); 
		System.out.println("k = " + output.k); 
		System.out.println("l = " + output.l); 
		System.out.println("m = " + output.m); 
	} 
} 
