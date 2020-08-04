
public class ThreadControlTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//타이어 조립하는 직원 객체 생성
		
		CThread t= new CThread();
		t.start();
		
		
		//3초 후 휴식 (Thread의 일시정지)
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		
		
//		t.wait(); //이렇게 하는것도 stop처럼 비권장
		//일시정지여부를 가진 변수 isWait을 true로 변경
		t.isWait= true;
		
		
		//3초 후에 이어하기 (Resume)
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		
		t.resumeThread();
		
//		t.notify();
		
		
		//3초 후 퇴근. (Thread 종료 = run 메소드 종료)
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		
		//Thread, 타이어 조립 직원에게 작업 멈추기 명령!
		
//		t.stop();//deprecated된 메소드, 사용을 권장하지 않음
		//스레드의 반복작업을 강제로 멈춰서 자원관리가 안 됨. 중간에 끊김.
		
		//Thread는 run()메소드가 종료되면 퇴근
		//다시 start를 해도 일하지 않음! -> Thread는 일회용.
		//즉, Thread의 작업실행은 1회용
		
		//while문이 멈추면 run()메소드의 작업이 끝남
		//while문을 멈추는 방법
		//while문의 반복 조건에 boolean 변수를 사용하여 변수값을 변경
		
		t.isRun= false;
		
	}

}

//타이어를 조립 작업 수행하는 스레드클래스 정의
class CThread extends Thread{
	
	boolean isRun= true;
	boolean isWait= false;
	
	@Override
	public void run() {
		//타이어 4개를 조립하는 작업 - 반복수행
		while(isRun) {
			System.out.println("1번 타이어 조립");
			System.out.println("2번 타이어 조립");
			System.out.println("3번 타이어 조립");
			System.out.println("4번 타이어 조립");
			System.out.println();
			
			//휴식인가? - 일시정지인가?
			
			if(isWait) {
				try {
					synchronized (this) {
						wait();
					}
				} catch (InterruptedException e) {} //이 스레드를 일시정지
			}
			
			
			
			//1초 대기
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			
		}// while end.
		
		System.out.println("CThread 퇴근");
		
	}// run method end.
	
	
	//이어하는 기능 메소드
	
	void resumeThread() {
		
		isWait= false; //휴식기능 종료
		
		synchronized (this) {
			this.notify();
		}
		
	}
	
	
}// CThread class end.