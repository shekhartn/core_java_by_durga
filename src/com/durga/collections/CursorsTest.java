package com.durga.collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class CursorsTest {

	public static void main(String[] args) {
		//Enumarable -->It is applicable only for legacy classes
		Vector vector=new Vector();
		for (int i = 0; i<10;i++) {
			vector.add(i+1);
		}
		System.out.println(vector);
		Enumeration elements=vector.elements();
		while(elements.hasMoreElements()) {
			System.out.println(elements.nextElement());
		}
		System.out.println(vector);
		
		
		/* Iterator 
		 * We can Apply Iterator Concept for any Collection Object. Hence it is Universal Cursor.
		 * We can Able to Perform Both Read and Remove Operations.
		 * */
		LinkedList ll = new LinkedList();
		ll.add("Durga");
		ll.add(30);
		ll.add(null);
		ll.add("Durga");
		ll.set(0, "Software");
		ll.add(0,"Venky");
		ll.removeLast();
		ll.addFirst("CCC");
		
		System.out.println(ll);
		Iterator iterator=ll.iterator();
		while(iterator.hasNext()) {
			//System.out.println(iterator.next());
			if("CCC".equals(iterator.next())) {
				iterator.remove();
			}
		}
		System.out.println(ll);
		
		ArrayList l = new ArrayList();
		for (int i=0; i<=10; i++) {
		l.add(i);
		}
		System.out.println(l);
		Iterator itr = l.iterator();
		while(itr.hasNext()) {
		Integer I = (Integer)itr.next();
		if(I%2 == 0)
		System.out.println(I);
		else
		itr.remove();
		}
		System.out.println(l);
		
		/* ListIterator
		 * ListIterator is the Child Interface of Iterator.
		 * By using ListIterator we can Move Either to the Forward Direction OR to the Backward Direction. That is it is a Bi-Directional Cursor.
		 * By using ListIterator we can Able to Perform Addition of New Objects andReplacing existing Objects. In Addition to Read and Remove Operations.
		 *  */
		LinkedList linkedList = new LinkedList();
		linkedList.add("Baala");
		linkedList.add("Venki");
		linkedList.add("Chiru");
		linkedList.add("Naag");
		System.out.println(linkedList);
		ListIterator ltr = linkedList.listIterator();
		while(ltr.hasNext()) {
		String s = (String)ltr.next();
		if(s.equals("Venki"))
		ltr.remove();
		if(s.equals("Naag"))
		ltr.add("Chaitu");
		if(s.equals("Chiru"))
		ltr.add("Charan");
		}
		System.out.println(linkedList);
		
		while(ltr.hasPrevious()) {
			String s = (String)ltr.previous();
			if(s.equals("Charan"))
			ltr.remove();
			if(s.equals("Naag"))
			ltr.add("Shekhar");
			if(s.equals("Baala"))
			ltr.add("Ramesh");
			}
		System.out.println(linkedList);
		
	}

}
