package com.ruby.java.ch16;


import java.util.concurrent.*;

public class Test09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExecutorService threadpool1= Executors.newFixedThreadPool(10);
		ExecutorService threadpool2= Executors.newCachedThreadPool();
		
		
		threadpool1.execute(new Task());
		threadpool1.execute(()->{
			for(int i=0; i<10; i++) {
				System.out.println("스레드 작업2");
			}
		});
		
		threadpool1.shutdown();
		threadpool2.shutdown();
		
		
	}

} // main end.



class Task implements Runnable{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=0; i<10; i++) {
			System.out.println("스레드 작업 1");
		}
		
		
	}
}



