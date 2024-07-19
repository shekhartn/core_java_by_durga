package com.durga.collections;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class ListTest {

	public static void main(String[] args) {
		
		ArrayList listObjs=new ArrayList();
		listObjs.add("Shekhar");
		
		listObjs.add(new Integer(10));
		listObjs.add(new Object());
		listObjs.add("Karthik");
		
		listObjs.add(new Emp("Hanmanthu",50));
		listObjs.add(new Emp("Pavithra",30));
		
		System.out.println("Array List::"+listObjs);
		
		//listObjs.remove(10);//IndexOutOfBoundsException: Index 10 out of bounds for length 6
		listObjs.remove(4);
		//System.out.println(listObjs);
		
		ListIterator listIterator =listObjs.listIterator();
		while(listIterator.hasNext()) {
			System.out.print(listIterator.next()+" ");
			if(listIterator.nextIndex()==3) {
				listIterator.add("Rameesh");
			}
		}
		System.out.println();
		Vector vectarObjs=new Vector();
		vectarObjs.add("Shekhar");
		vectarObjs.add("Ramesh");
		vectarObjs.add("Karthik");
		System.out.println("Vector Objects::"+vectarObjs);
		
		System.out.println();
		Stack stackObjs=new Stack();
		stackObjs.add("Shekhar1");
		stackObjs.add("Ramesh1");
		stackObjs.add("Karthik1");
		System.out.println("Vector Objects::"+stackObjs);
		
		
		
	}

}
