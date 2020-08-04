package com.ruby.java.ch16;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Food f= new Food();
		Phone p = new Phone();
		f.setPriority(Thread.MAX_PRIORITY);
		p.setPriority(Thread.MIN_PRIORITY);
		
		f.start();
		p.start();
		
		
		
	}

}
