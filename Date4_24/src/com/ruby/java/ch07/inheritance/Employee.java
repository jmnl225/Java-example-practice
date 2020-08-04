package com.ruby.java.ch07.inheritance;

public class Employee extends Person {
	
	private String dept;
	
	
	public String getDept() {
		return dept;
	}
	
	public void setDept(String dept) {
		this.dept= dept;
	}
	
	
	public String toString() {
		return this.getName()+ " : " + this.getAge() +" : "+ dept;
	}
	
	
	public Employee(String name, int age, String dept) {
		super.setName(name);
		super.setAge(age);
		this.dept= dept;
		System.out.println("Employee(name, age, dept) ������ ����");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	/*
	private String name;
	private int age;
	private String dept;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name= name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age= age;
	}
	
	public String getDept() {
		return dept;
	}
	
	public void setDept(String dept) {
		this.dept= dept;
	}
	*/
	
	
	
	
	
	

}
