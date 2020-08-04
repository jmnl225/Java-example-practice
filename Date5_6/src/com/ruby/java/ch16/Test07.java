package com.ruby.java.ch16;

public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Phone calling = new Phone();
		calling.start();
		
		try {
			calling.join();
		}catch(InterruptedException e) {}
		
		for(int i=1; i<=1000; i++) {
			System.out.println("À½½Ä ¸Ô±â: "+i);
		}
		
	}

}
