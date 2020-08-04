import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
		// 객체 지향 프로그래밍(OOP Object Oriented Programing) : 객체 위주로 프로그래밍을 한다.
		//객체? 고유한 기능(동작:함수)과 값(데이터)를 가진 녀석 (멤버 변수와 함수(=method)를 갖고있는  것)
		
		//- Random : 임의의 값을 만들어내는 능력을 가진 녀석
		//- Scanner: 키보드의 입력을 받아들이는 능력(System.in) 을 자료형에 맞게 넣어줌
		//- String: 문자열을 관리하는 능력을 가진 녀석
		// 위의 Random, Scanner, String 이라는 객체의 능력을 구분하는 명칭 = Class
		
		//즉, 객체의 종류를 class라고 부름( 마치like 변수의 종류를 자료형이라 하듯)
		//JAVA에서는 이런 클래스를 기능별로 약 4000개
		
		
		//이 클래스를 사용하려면 반드 시 객체를 만들어서 사용해야함
		//Random객체 생성하려면
		Random rnd= new Random();
		int n= rnd.nextInt(6);
		
		System.out.println(n);
		
		//JAVA는 이런 객체들을 필요할때 불러서 사용하는 방식으로 프로그래밍
		//다시 말해, 4000여개의 클래스를 얼마나 적재적소에 사용하느냐가 중요
		
		//이 클래스는 Java System API(Application interface) or Java System Library
		
		
		
		//하지만! 개발자가 원하는 모든 기능 X
		
		//Ex) 게임 캐릭터가 공격
		//자바의 4000클래스 중에 이동과 공격기능 클래스는 없음
		
		//프로그래머가 이 고유한 기능을 가진 클래스ㅡㄹ 새로 만들 수 있어야함
		
		
		//프로그래머가 만드는 클래스 - 사용자정의 자료형
		
//		class Robot{
//			void move() {}
//			void attack() {}
//		}
		
		//본인이 만든 클래스를 사용하려면 객체를 만들어서 사용
//		Robot r = new Robot();
		
		
		
		//사용자 정의 클래스를 만드는 방법
		
		//사용방법: 클래스를 만들고, 객체를 생성해서 사용해야 함.
		
		
		
		
		// 클래스를 새로 만드는 위치 4가지: 
		//1. 별도의 .java문서에 class 정의
		//2. 같은 .java문서 안에 여러개의 class를 정의
		//3. 다른 class안에 class를 설계(작성
		//4. method 안에서 클래스를 설계
		
		
		Second s=new Second();
		s.a=10;
		s.show();
		
		Third t= new Third();
		t.show();
		
		Test test=new Test();
		test.show();
		
		//Third의 이너클래스 Hello를 객체 생성할 수 없음
		// Third.Hello h= new Third.Hello(); //error
		
	}

}
