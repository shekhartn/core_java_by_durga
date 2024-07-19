package com.durga.oops;

public class InstanceFlowTest {
	int x=10;//3 9
	{//4
		m1();//10
		System.out.println("First Instance block");//12
	}
	InstanceFlowTest(){//5
		System.out.println("Constructor block");//15
	}

	public static void main(String[] args) {//1
		new InstanceFlowTest();//2
		System.out.println();
		new InstanceFlowTest();
		
		System.out.println("Main method"); //16
	}
	void m1() {//6
		System.out.println(x+"\t"+y);//11
	}
	{//7
		System.out.println("Second Instance block");//13
	}
	int y=20;//8 14

}
