package com.durga.arrays;

public class ArraysTest {
	int x;
	
	byte[] m=new byte[10];
	short[] n=new short[10];
	
	int[] a=new int[3];
	int[] l=new int[3];
	
	int b[];
	int []c;
	int[] d=new int[]{1,2,3};
	int[] []k=new int[][]{{1,2,3},{3,4,5}};
	int[] e[],f[];
	
	int[] []g,h[];
	int[] []i,j;

	public static void main(String[] args) {
		ArraysTest at=new ArraysTest();
		at.a[0]=10;
		System.out.println("A:"+at.a);
		
		at.a=at.l;
		at.l=at.a;
		
		//at.m=at.n;//vice versa won't work
		//at.a=at.n;
		
		Number[] number=new Number[10];
		number=new Integer[2];//This won't work in primitive arrays
		number=new Double[10];
		number[5]=new Integer(2);
		
		
		
		
	}

}
