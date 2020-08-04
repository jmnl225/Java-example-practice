
public class SynchronizedTest {
	public static void main(String[] args) {
		//비동기 == 동시에
		
		//계좌 객체 생성
		Account acc= new Account();
		
		//acc계좌에 100원 입금
//		acc.add(100);
		
		
		//acc계좌에 입금하고싶은 고객1
		TestThread t1= new TestThread(acc);
		
		
		//acc계좌에 입금하고싶은 고객2
		TestThread t2= new TestThread(acc);
		
		
		//비슷한 시점에 둘 다 100원을 입금 실행
		t1.start();
		t2.start();
		
	}
	
	

}


//은행계좌 클래스

class Account{
	
	int money= 0;
	
	//입금기능
	//동기화 처리를 하지 않으면 여러 스레드가 이 메소드를 동시에 실행시켜
	//잘못된 결과를 얻을 수 있음.
	
	//동기화 처리 방법
	//방법 1) 메소드에 동기화 처리 [ synchronized ]
	//하나의 스레드가 이 메소드를 실행중이면 다른 스레드는 잠시 대기함
	
//	synchronized void add(int n) {
//		String name= Thread.currentThread().getName(); //현재 이 코드를 실행하는 Threa의 이름이 나옴
//		
//		
//		System.out.println(name+ ": 입금작업을 시작합니다.");
//		System.out.println(name+ ": 현재 잔액: "+ money);
//		
//		money+=n;
//		
//		//처리시간이 걸리도록
//		
//		for(int i=0; i<200000000L; i++) {
//			String s= "."; //아무작업이나 시도
//		}
//		
//		System.out.println(name+ ": 입금 후 잔액: "+money);
//		System.out.println();
//	}
//	
//}
	
	//방법2) 동기화 블럭 사용
	
	void add(int n) {
		String name= Thread.currentThread().getName(); //현재 이 코드를 실행하는 Threa의 이름이 나옴
		
		
		System.out.println(name+ ": 입금작업을 시작합니다.");
		
		//이후부터만 동기화 처리: 파라미터로 동기화 할 객체 지정
		synchronized (this) {
			System.out.println(name+ ": 현재 잔액: "+ money);
			
			money+=n;
			
			//처리시간이 걸리도록
			
			for(int i=0; i<200000000L; i++) {
				String s= "."; //아무작업이나 시도
			}
			
			System.out.println(name+ ": 입금 후 잔액: "+money);
			System.out.println();
		}
		
	}
	
}


//입금하고싶은 Thread 클래스

class TestThread extends Thread{
	
	Account acc; //위에서 만든 계좌객체 참조
	
	String name; //고객 이름
	
	public TestThread(Account acc) {
		this.acc= acc;
//		this.name= name;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//100원을 입금하는 작업
		acc.add(100);
	}
	
}










