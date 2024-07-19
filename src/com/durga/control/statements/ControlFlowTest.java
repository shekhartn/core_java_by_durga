package com.durga.control.statements;

import java.util.Random;

public class ControlFlowTest {

	public static void main(String[] args) {

		String name="Shekhar";
		switch (name) {
		case "Ramesh":System.out.println("Ramesh");
		case "Shekhar":System.out.println("Shekhar");break;
		case "Karthik":System.out.println("Karthik");
		default: System.out.println("Hanmanthu");
		}
		
		int number=new Random().ints(10, 20).findFirst().getAsInt();
		//iterative statement
		System.out.println(number);
//		while(number<20) {
//			System.out.println(number);
//			number++;
//		}
		
		System.out.println("Default Number::"+number);
		do {
			System.out.println(number);
			number++;
		}
		while(number<20);
		
		//do;while(true);
		
		//Unreachable code
		//while(true) {}
		/*
		 * do { System.out.println("Hii"); while(false) {System.out.println("Hello");}
		 * }while(false);
		 */
		
		//Valid statement
		/*
		 * int a = 10, b = 20; do { System.out.println("Hello.........."); } while (a <
		 * 20);
		 */
		 
		do {
			int i=10;
			//System.out.println("Hii");
		} while (false);//It won't work next statement with true
		//System.out.println("Hello");
		
		//It won't work
		/*
		 * do int i=5; while(true);
		 */
		
		//FOR LOOP
		int x=0;
		for(System.out.println("Hi");x<3;x++) {
			System.out.println("Hello");
		}
		//Infinite loop
		/*
		 * for(System.out.println("Hi..");;System.out.println("Hey..")) {
		 * System.out.println("Hello.."); }
		 */
		
		//for(;;)System.out.println("Hey"); //Valid statement
		
		/*
		 * final int a=10,b=20; for(int i=0;a<b;i++) { System.out.println("Hey..."); }
		 */
		//System.out.println("Hi");//This won't execute with final 
		
		//for each loop
		int[][] k= {{10,20,70,90,55},{60,30,40,50,100},{11,22,73,94,56}}; 
		/*
		 * for(int
		 * i=0;i<k.length;i++) { for(int j=0;j<k[i].length;j++) {
		 * System.out.print(k[i][j]+"\t"); } System.out.println(); }
		 */
		
		for(int[] i:k) {
			for(int y:i) {
				System.out.print(y+"\t");  
			}
			System.out.println();
		}
		
		//break
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(i==j)break;
				System.out.print(i+ "\t"+j);
			}
			System.out.println();
		}
		 
		for(int i=0;i<100;i++) {
			if(i%2==0)continue;
			System.out.print(i+"\t");
		}
		
		
	}

}
