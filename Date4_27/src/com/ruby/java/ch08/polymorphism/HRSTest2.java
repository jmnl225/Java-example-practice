package com.ruby.java.ch08.polymorphism;


public class HRSTest2 {
	
	
	public static void calcTax(Employee e) {
		
//		if(e instanceof Salesman) {
//			System.out.println("Salesman �Դϴ�.");
//			System.out.println(((Salesman) e).annual_sales);
//		} else if(e instanceof Manager) {
//			System.out.println("Manager �Դϴ�.");
//			System.out.println(((Manager) e).num_team);
//		} else if(e instanceof Consultant) {
//			System.out.println(((Consultant) e).num_project);
//			System.out.println("Consultant �Դϴ�.");
//		} else {
//			System.out.println("Employee �Դϴ�.");
//		}
		
		
		if (e instanceof Salesman) {
			Salesman s = (Salesman) e;
			s.annual_sales = 6500000;
			System.out.println("Salesman �Դϴ�."+ s.annual_sales);
		}else if (e instanceof Manager) {
			Manager m = (Manager) e;
			m.num_team = 5;
			System.out.println("Manager �Դϴ�." + m.num_team);
		}else if (e instanceof Consultant) {
			Consultant c = (Consultant) e;
			c.num_project = 35;
			System.out.println("Consultant �Դϴ�."+ c.num_project);
		}else {
			System.out.println("Employee �Դϴ�.");
		}
		
		
		
	}
	
	
		public static void main(String[] args) {
			
			
			Salesman s= new Salesman();
			Manager m= new Manager();
			Consultant c= new Consultant();
			
			
			calcTax(s);
			calcTax(m);
			calcTax(c);
			
		}
		
		
	}



abstract class Employee{
	String name;
	int salary;
	
	public abstract void calcSalary();
	public abstract void calcBonus();
	
}


class Salesman extends Employee{
	
	int annual_sales;
	
	public void calcSalary() {
		System.out.println("Saleman �޿�= �⺻��+�Ǹż���");
	}
	
	public void calcBonus() {
		System.out.println("Salesman ���ʽ�= �⺻��*12*4");
	}
	
}

class Consultant extends Employee{
	
	int num_project;
	
	public void calcSalary() {
		System.out.println("Consultant �޿�= �⺻��+������ Ư������");
	}
	
	public void calcBonus() {
		System.out.println("Consultant ���ʽ�= �⺻��*12*2");
	}
}

class Manager extends Employee{
	
	int num_team;
	
	public void calcSalary() {
		System.out.println("Director ���ʽ�= �⺻��*12*6");
	}
	
	public void calcBonus() {
		System.out.println("Manager ���ʽ�= �⺻��*12*6");
	}
}

