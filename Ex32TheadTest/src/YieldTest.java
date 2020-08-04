
public class YieldTest {
	
	public static void main(String[] args) {
		
		ThreadA t1= new ThreadA();
		ThreadB t2= new ThreadB();
		
		t1.start();
		t2.start();
		
		//5초 후에 A가 본인 점유시간을 B에게 양보
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {}
		
		t1.isFlag= false;
		
		
		//5초 후 B가 본인 점유시간 양보
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
				Thread.yield(); //나의 cpu점유율을 양보
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
				Thread.yield(); //나의 cpu점유율을 양보
			}
			
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
	}
	
}