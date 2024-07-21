package com.durga.collections;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.RandomAccess;
import java.util.Stack;
import java.util.Vector;
//List orders preserved & duplicate allowed
public class ListTest {

	public static void main(String[] args) {
		//List->ArrayList &List-->LinkedList && List-->Vector-->Stack
		
		/* implements Serializable, Cloneable& RandomAccess & it is non synchronized
		 * It is used for retrievable purpose
		 *  */
		List al = new ArrayList();
		al.add("A");
		al.add(10);
		al.add("A");
		al.add(null);
		System.out.println(al); //[A, 10, A, null]
		al.remove(2);
		System.out.println(al); //[A, 10, null]
		al.add(2,"M");
		al.add("N");
		System.out.println(al); //[A, 10, M, null, N]
		
		/* implements Serializable, Cloneable
		 * It is used for frequent insertion & deletion purpose
		 *  Data Structure is Double LinkedList
		 *  */
		LinkedList ll = new LinkedList();
		ll.add("Durga");
		ll.add(30);
		ll.add(null);
		ll.add("Durga");
		ll.set(0, "Software");
		ll.add(0,"Venky");
		ll.removeLast();
		ll.addFirst("CCC");
		System.out.println(ll); //[CCC, Venky, Software, 30, null]
		
		
		/* implements Serializable, Cloneable& RandomAccess
		 * it is synchronized
		 * It is used for retrievable purpose
		 * The Underlying Data Structure is Resizable Array ORGrowable Array.
		 *  */
		Vector vector = new Vector();
		System.out.println(vector.capacity()); //10
		for(int i = 1; i<=10; i++) {
			vector.addElement(i);
		}
		System.out.println(vector.capacity()); //10
		vector.addElement("A");
		System.out.println(vector.capacity()); //20
		System.out.println(vector); //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, A]
		
		Stack stack = new Stack();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		System.out.println(stack); //[A, B, C]
		System.out.println(stack.search("A")); //3
		System.out.println(stack.search("Z")); //-1
		stack.pop();
		System.out.println(stack); //[A, B]
		
		System.out.println(al instanceof Serializable); //true
		System.out.println(ll instanceof Cloneable); //true
		System.out.println(al instanceof RandomAccess); //true
		System.out.println(ll instanceof RandomAccess); //false
		System.out.println(vector instanceof RandomAccess); //false
		
		//Making array list as synchronized 
		List list=Collections.synchronizedList(al);
		
		
		
		
		
		
		
	}

}
