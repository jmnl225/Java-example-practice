

public class DeamonThreadTest {
	public static void main(String[] args) {
		
		
		DThread t= new DThread();
		t.setDaemon(true); //데몬스레드로 설정 = Main Thread가 종료되면 같이 자동 종료 됨!
		t.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {}
		
		
		System.out.println("메인종료 = 사장 퇴근");
		
	}

}


class DThread extends Thread{
	
	@Override
	public void run() {
		while(true) {
			System.out.println("Hello");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			
		}
	}
	
}



