
public class RunnableTest {
	public static void main(String[] args) {
		
		//Thread를 만드는 2가지 방법
		//1. Thread class 상속 (extends) 한 클래스를 정의하여 사용
		//2. Runnable 인터페이스를 구현한(implements) 클래스를 정의하여 사용
		
		//Person이면서 Thread인 객체 생성
		PersonThread pt= new PersonThread();
		pt.name= "Sam";
		pt.age= 20;
		
		//본인의 이름, 나이를 1초마다 출력해주는 기능 실행
		//Thread를 실행시키는 명령
//		pt.start(); //에러: Runnable에는 start메소드가 없음
		
//		pt.run(); //절대안됨!!!!!!! 되는 것 처럼 보이지만
		//run을 직접 호출하면 별도의 Thread가 하는 것이 아니라 Main이 하게됨
		
		
		//Runnable은 스스로 실행하는 명령 X
		//다른 Thread 클래스 객체의 도움을 받아야 함.
		
		Thread t= new Thread(pt); //생성자에 Runnable을 전달하면 이 스레드가 대신 Start 해줌
		t.start(); // 생성자로 받은 Runnable 객체의 run()을 대신 실행
		
		System.out.println("aaa"); //Main Thread가 실행
		
		
		//Runnable을 사용하는 좀 다른 모습
		//Runnable을 상속받는 클래스를 정의하면서 객체 생성
		//익명 클래스
		Runnable r=new PersonThread() {
			@Override
			public void run() {
				for(int i=0; i<100; i++) {
					System.out.println("딸기우유먹고싶다 생딸기");
				}
			}
		};
		
		Thread t2= new Thread(r);
		t2.start(); //위 익명클래스에서 만든 run()기능이 실행
		
		//위 익명클래스를 더 줄여서 작성
		
		Thread t3= new Thread(new Runnable() {
			public void run() {
				System.out.println("익명클래스 사용");
			}
		});
		t3.start();
		
		//무한 반복
		while(true) {
			System.out.println("kkk");
			
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				System.out.println("인터럽트 발생!");
				break;
			}
		}
		
		//무한반복 종료2번째 방볍
		
		while(true) {
			System.out.println("kkk");
			
			//혹시 인터럽트( .interraupt 메소드가 호출 되어있눈가?
		}
		
		
	}

}

// Person의 멤버 능력을 갖고 있으면서 Thread의 능력도 있었으면 하는 클래스
class PersonThread extends Person implements Runnable{
	//Runnable 인터페이스의 추상메소드 (abstract)인 run()을 override를 해야만 함
		
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<5; i++) {
			System.out.println(name+ " ,"+ age);
			
			//1초 대기
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
		
	}
}



class Person{
	String name;
	int age;
}