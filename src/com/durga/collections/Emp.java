package com.durga.collections;

public class Emp {
	
	private String name;
	private String age;
	public String getName() {
		return name;
	}
	public Emp(String name, int age) {
		super();
		this.name = name;
		this.age = String.valueOf(age);
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", age=" + age + "]";
	}
	
	
	

}
