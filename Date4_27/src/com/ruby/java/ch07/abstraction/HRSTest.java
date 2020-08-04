package com.ruby.java.ch07.abstraction;

abstract class Employee{
	String name;
	int salary;
	
	public abstract void calcSalary();
	public abstract void calcBonus();
	
}


class Salesman extends Employee{
	
	int annual_sales;
	
	public void calcSalary() {
		System.out.println("Saleman 급여= 기본급+판매수당");
	}
	
	public void calcBonus() {
		System.out.println("Salesman 보너스= 기본급*12*4");
	}
	
}

class Consultant extends Employee{
	
	int num_project;
	
	public void calcSalary() {
		System.out.println("Consultant 급여= 기본급+컨설팅 특별수당");
	}
	
	public void calcBonus() {
		System.out.println("Consultant 보너스= 기본급*12*2");
	}
}

abstract class Manager extends Employee{
	
	int num_team;
	
	public void calcSalary() {
		System.out.println("Director 보너스= 기본급*12*6");
	}
}

class Director extends Manager{
	public void calcBonus() {
		System.out.println("Director 보너스= 기본급*12*6");
	}
}



public class HRSTest {
	
	public static void calcTax(Employee e) {
		System.out.println("소득세를 계산합니다.");
		// 인자로 전달된 인스턴스의 소득세 계산
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Salesman s= new Salesman();
		Consultant c= new Consultant();
		Director d= new Director();
		
//		calcTax(s);
//		calcTax(c);
//		calcTax(d);
		
		System.out.println(s.toString());
		System.out.println(c.toString());
		System.out.println(d.toString());
		
		Salesman s2 = s;
		System.out.println(s2.toString());
		
		if(s.equals(s2)) {
			System.out.println("동일한 객체입니다.");
		}else {
			System.out.println("서로 다른 객체입니다.");
		}
		
		
		
		
		
	}

}
