package com.durga.collections;

class Employee implements Comparable<Employee> {
	private String name;
	private int eid;

	Employee(String name, int eid) {
		this.name = name;
		this.eid = eid;
	}
	
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getEid() {
		return eid;
	}



	public void setEid(int eid) {
		this.eid = eid;
	}



	public String toString() {
		return name + "-----" + eid;
	}

	@Override
	public int compareTo(Employee e) {
		return eid < e.eid ? -1 : eid > e.eid ? +1 : 0;
	}
}