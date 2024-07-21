package com.durga.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		/* 
		 * Set(I)-->HashSet-->LinkkedHashSet
		 * Set(I)..>SortedSet..>NavigatableSet-->TreeSet
		 * 
		 *  */
		
		/* HashSet 
		 * The Underlying Data Structure is Hashtable.
		 * Insertion Order is Not Preserved.
		 * */
		HashSet h = new HashSet();
		h.add("B");
		h.add("C");
		h.add("D");
		h.add("Z");
		h.add(null);
		h.add(10);
		System.out.println(h.add("Z")); //false
		System.out.println(h); //[null, D, B, C, 10, Z]
		
		/* LinkedHashSet 
		 * The Underlying Data Structure is Hashtable & LinkedList
		 * Insertion Order will be Preserved.
		 * */
		LinkedHashSet lhs=new LinkedHashSet<>();
		lhs.add("C");
		lhs.add("C");
		lhs.add("A");
		lhs.add("Z");
		lhs.add("K");
		lhs.add(null);
		lhs.add(10);
		System.out.println(lhs);
		
		/* TreeSet 
		 * The Underlying Data Structure is Balanced Tree.
		 * Insertion Order is Not Preserved and it is Based on Some Sorting Order.
		 * Heterogeneous Objects are Not Allowed. If we are trying to Insert we will get Runtime Exception Saying ClassCastException.
		 * Duplicate Objects are Not allowed.
		 * null Insertion is Possible (Only Once). For Non- Empty TreeSet if we are trying to Insert null we will get NullPointerException.
		 * Implements Serializable and Cloneable Interfaces but Not RandomAccess Interface.
		 * */
		TreeSet t = new TreeSet();
		//t.add(null);//null Insertion is Possible only here
		t.add("A");
		t.add("a");
		t.add("B");
		t.add("Z");
		t.add("L");
		//t.add(new Integer(10));//ClassCastException
		//t.add(null);//RE: Exception in thread "main" java.lang.NullPointerException
		System.out.println(t); //[A, B, L, Z, a]
		
		/*
		 * If we are Depending on Default Natural Sorting Order Compulsory Objects should be Homogeneous and Comparable. Otherwise we will get RE:ClassCastException. 
		 *  An object is said to be Comparable if and only if corresponding class implements Comparable interface. 
		 *  All Wrapper Classes,String &StringBuffer Class Already Implements Comparable Interface. But StringBuffer Classdoesn't Implement Comparable Interface.  Hence we are ClassCastException inthe below Example.
		 */
		TreeSet ts = new TreeSet();
		ts.add(new StringBuffer("S"));
		ts.add(new StringBuffer("Z"));
		ts.add(new StringBuffer("L"));
		ts.add(new StringBuffer("B"));
		System.out.println(ts);
		
		

	}

}
