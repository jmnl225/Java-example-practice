

public class JoinTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JThread t= new JThread();
		t.start();
		
		//Thread는 동시에 하는 거지만,
		//위 JThread의 작업(run 메소드)가 종료될 때 까지
		//다른 스레드의 작업을 기다리는 명령 -> block
		try {
		t.join();
		}catch (InterruptedException e1) {}
		
		//즉, join은 thread가 동시에 작업하는 기능을 없앰
		
		
		//메인 Thread에서 다른 작업을 수행
		for(int i=0; i<10; i++) {
			System.out.println("Main");
			
			try {
				Thread.sleep(500);
			}catch(Exception e) {}
			
			
			
		}
		
		
		
	}

}

class JThread extends Thread{
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("aaa");
			
			try {
				Thread.sleep(500);
			}catch(Exception e) {}
		}
		
		
	}
}