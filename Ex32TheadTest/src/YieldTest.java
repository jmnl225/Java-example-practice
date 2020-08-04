
public class YieldTest {
	
	public static void main(String[] args) {
		
		ThreadA t1= new ThreadA();
		ThreadB t2= new ThreadB();
		
		t1.start();
		t2.start();
		
		//5�� �Ŀ� A�� ���� �����ð��� B���� �纸
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {}
		
		t1.isFlag= false;
		
		
		//5�� �� B�� ���� �����ð� �纸
		try {
			Thread.sleep(5000);
		}catch (InterruptedException e1) {}
		
		
	}

}

class ThreadA extends Thread{
	
	boolean isFlag= true;
	
	@Override
	public void run() {
		
		
		
		// TODO Auto-generated method stub
		while(true) {
			
			if(isFlag) {
				System.out.println("AThread running..");
			}else {
				Thread.yield(); //���� cpu�������� �纸
			}
			
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
	}
	
}


class ThreadB extends Thread{
	
	boolean isFlag= true;
	
	@Override
	public void run() {
		
		
		
		// TODO Auto-generated method stub
		while(true) {
			
			if(isFlag) {
				System.out.println("BThread running..");
			}else {
				Thread.yield(); //���� cpu�������� �纸
			}
			
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
	}
	
}