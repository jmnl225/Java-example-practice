
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//thread(스레드) = 동시에 여러작업을 처리하는 기ㅓㅂ
		//1. Process: 실행중인 하나의 자바 프로그램
		//2. thread: 하나의 프로세스 안에서 동작하는 일꾼
			
		// 즉, thread는 작성되어 있는 코드를 읽어서 실행하는 녀석		
		
		
		//동시에 했으면하는 작업이 있다면 ex) 파일 다운로드 하며 음악재생, or 체팅하기...
		
		
		//파일 다운로드 중
		
		//1) 20개 파일 다운로드
//		for (int i=0; i<20; i++) {
//			System.out.println(i+"번째 파일 다운로드 중");
//			
//			//억지로 오래 굴리자
//			(int k=2000000000; k<100000000; k++);
//		}
		
		// 2) 음악재생
	
//	for(int i=0; i<20; i++) {
//		System.out.println(i+"번째 음악 재생");
//		for(int k=0; k<2000000L; k++) {
//		}
//	}
		
			
			//위 두개의 작업을 동시에 실행시키면 더 빠르게 완료.
			
			//기본으로 만들어져있있는 Main thread(사장)외에
			//특정 작업을 아는직원같은 객체가 있다면
			//동시에 여러작업이 가능
			//-> 이 때 사용하는 기술이 바로 thread
		
		
		
		
		// 단, 일반객체와 thread객체는 다르다!
			//객체를 따로 만들었다고 해서 직원 thread가 만들어진 것은 아니다.
			//서로다른 객체 생성
		
//		WorkerA a= new WorkerA();
//		a.work();
//		//파일 다운로드
//		
//		WorkerB b= new WorkerB();
//		b.work();
//		//음악 재생
		
		
		//결국 일반 객체를 생성, 메소드를 실행시키면 MAin thread가 혼자 수행
		//-> 동시에 하는 게 아니다
		
		
		//진짜 main thread 멁ㅎ 작유ㅗㄴ thread객체ㅡ를 생성해보기
		//Thread를 객체로 만들려면 Thread라는 클래스를 상속하는 클래스를 새로 만듦
		//정의하여 객ㄱ체로 생성
		
		AThread a= new AThread();
		//직원에게 작업을 실행하도록 명령- 업무시작!
		//직원Thread에게 업무를 시작핟록 해야함
		
		a.start();
		
		BThread b= new BThread();
		b.start();
		
		//만약 Thread의 동작 우선순위를 주고싶다면
		a.setPriority(0); //우선순위[0~10] 0= 낮음 10= 높음
		
		
		//이 설정도 확실한 것은 아니고, 참고.
		
		//Main Thread도 thread이므로
		//A,B가 특정 작업을 하는 동안 MAin도 다른 직업 수행 가능

		for(int i=100; i<120; i++) {
			System.out.println("매력적이야");
		}
		
		
		
		

	}

}// main end.


//Thread의 능력을 가진 클래스의 정의

class AThread extends Thread {
	//모든 Thread클래스의 작업은 반드시 이 메소드 안에서 해야함
	//Thread 클래스에 있는 run()이라는 메소드를 오버라이드해서 사용함
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		//이 안에 이 Thread가 했으면 하는 작업 코딩. 
		//ex) 파일다운로드 작업
		
		for(int i=0; i<20; i++) {
			 System.out.println(i+"번 음악 재생");
			 
			//1초 대기.. (Thread를 1초간 잠재우기)
			 try {Thread.sleep(1000);
			 }catch(Exception e) {
			 for(int k=0; k<2000000000L; k++) {
				 
			 }
		 }
		
	}
	
}
}

//음악재생을 수행하는 클래스

class BThread extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
		 for(int i=0; i<20; i++) {
			 System.out.println(i+"번 음악 재생");
			 
			 //1초 대기
			 try {
			 Thread.sleep(1000);
			 }catch(Exception e) {}
			 for(int k=0; k<200000000L; k++) {
				 
			 }
		 }
	}
	
}












//일반 클래스

class WorkerA{
	void work() {
		//파일 다운로드 작업
		 for(int i=0; i<20; i++) {
			 System.out.println(i+"번 파일 다운로드 중...");
			 
			 for(int k=0; k<200000000L; k++) {
				 
			 }
		 }
		
	}
}

class WorkerB{
	void work() {
		//음악 재생 작업
		 for(int i=0; i<20; i++) {
			 System.out.println(i+"번 음악 재생");
			 
			 for(int k=0; k<200000000L; k++) {
				 
			 }
		 }
		
	}
} 






