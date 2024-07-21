package com.durga.collections;

import java.util.TreeSet;

public class SortingTest {

	public static void main(String[] args) {
		/* Comparable
		 * It is meant for Default Natural Sorting Order
		 * It is available in java.lang package
		 *  */
		System.out.println("A".compareTo("Z")); //-25
		System.out.println("Z".compareTo("K")); //15
		System.out.println("Z".compareTo("Z")); //0
		//System.out.println("Z".compareTo(null)); //RE: java.lang.NullPointerException
		
		/* Comparator
		 * It is meant for Customized Sorting Order
		 * It is available in java.util package
		 * It contains 2 Methods compare() and equals()
		 *  */
		TreeSet ts=new TreeSet<>((o1,o2)->(Integer)o1<(Integer)o2?+1:(Integer)o1>(Integer)o2?-1:0);
		ts.add(5);
		ts.add(51);
		ts.add(15);
		ts.add(52);
		ts.add(25);
		ts.add(53);
		ts.add(57);
		ts.add(95);
		ts.add(65);
		System.out.println(ts);
		
		//List of names and sorting order is reverse of alphabet
		TreeSet<String> t = new TreeSet<>((s1,s2)->-s1.compareTo(s2));
		t.add("Roja");
		t.add("Sobha Rani");
		t.add("Raja Kumari");
		t.add("Ganga Bhavani");
		t.add("Ramulamma");
		System.out.println(t);
		
		//list of strings & sorting order is increasing length
		TreeSet<String> ts1 = new TreeSet<>((s1,s2)->s1.length()<s2.length()?-1:s1.length()>s2.length()?+1:0);
		ts1.add("bbb");
		ts1.add("a");
		ts1.add("ccc");
		ts1.add("dd");
		ts1.add("eeee");
		ts1.add("kl");
		System.out.println(ts1);//[a, dd, bbb, eeee]
		
		//Employee id default sorting & name is customized sorting in ascending order
		Employee e1 = new Employee("Nag", 100);
		Employee e2 = new Employee("Bala", 200);
		Employee e3 = new Employee("Chiru", 50);
		Employee e4 = new Employee("Venki", 150);
		Employee e5 = new Employee("Nag", 100);
		TreeSet ts2 = new TreeSet();
		ts2.add(e1);
		ts2.add(e2);
		ts2.add(e3);
		ts2.add(e4);
		ts2.add(e5);
		System.out.println(ts2);
		
		TreeSet<Employee> ts3 = new TreeSet<>((emp1,emp2)->emp1.getName().compareTo(emp2.getName()));
		ts3.add(e1);
		ts3.add(e2);
		ts3.add(e3);
		ts3.add(e4);
		ts3.add(e5);
		System.out.println(ts3);
		
		
	}

}
