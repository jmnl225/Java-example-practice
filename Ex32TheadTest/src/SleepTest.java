
public class SleepTest {
	public static void main(String[] args) {
		
		SThread t = new SThread();
		t.start(); // run메소드 자동실행 - 10초 후 "Hello" 출력
		
		//자는 Thread 깨우기
		t.interrupt();
		
	}
	
}


class SThread extends Thread{
	
	@Override
	public void run() {
		//10초 후에 "Hello" 출력
		
		//10초 대기
		try {
			Thread.sleep(10000);
			// sleep중에 interrupt()가 걸리면 예외
		}catch (InterruptedException e) {
			System.out.println("자는데 왜 깨워!");
		}
		
		System.out.println("Hello");
	}
	
}
