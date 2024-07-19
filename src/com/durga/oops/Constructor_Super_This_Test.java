package com.durga.oops;

public class Constructor_Super_This_Test {

	public static void main(String[] args) {

		TestD test=new TestD();
		System.out.println(test.y);
		TestA a=(TestA)test;
		TestB b=(TestB)test;
		TestC c=(TestC)test;
		System.out.println(a.y);
		System.out.println(b.y);
		System.out.println(c.y);
	}

}
class TestA{
	int x,y=16;
	TestA(){
		this(10);
		System.out.println("TestA");
		//super(); or this(10)//This should be always first statement
	}
	TestA(int i){//There should be no args constructor if we declare this
		super();
		this.x=13;
		System.out.println(x+"\t"+i+"\t"+this.y);
	}
}
class TestB extends TestA{
	int y=20;
	TestB(){
		this(12);
}
	TestB(int x){
		super(x);
		//super.y=this.y;
	}
}
class TestC extends TestB{
	TestC(){
		//super(10);//It won't execute if indirect parent
	}
}
class TestD extends TestC{
	TestD(){}
}
