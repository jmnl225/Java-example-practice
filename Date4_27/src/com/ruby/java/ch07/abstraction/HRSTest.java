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

abstract class Manager extends Employee{
	
	int num_team;
	
	public void calcSalary() {
		System.out.println("Director ���ʽ�= �⺻��*12*6");
	}
}

class Director extends Manager{
	public void calcBonus() {
		System.out.println("Director ���ʽ�= �⺻��*12*6");
	}
}



public class HRSTest {
	
	public static void calcTax(Employee e) {
		System.out.println("�ҵ漼�� ����մϴ�.");
		// ���ڷ� ���޵� �ν��Ͻ��� �ҵ漼 ���
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
			System.out.println("������ ��ü�Դϴ�.");
		}else {
			System.out.println("���� �ٸ� ��ü�Դϴ�.");
		}
		
		
		
		
		
	}

}
