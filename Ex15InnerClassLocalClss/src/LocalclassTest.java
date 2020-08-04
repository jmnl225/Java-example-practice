
public class LocalclassTest {
	
	int g=10; //멤버변수
	
	//멤버메소드
	
	void aaa() {
		
		int m=20; //지역변수
		
		
		//local class(지역클래스)
		//메소드 안에 class를 선언
		class AAA{
			int a;
			void show() {
				System.out.println("AAA Show" +a);
				System.out.println("AAA show" +g); //메소드를 갖고있는 클래스 멤버g를 맘대로 쓸 수 있음
				System.out.println( m ); //지역 변수는 사용 불가. 단!!!! final 변수는 됨 >< *********************
			}
		}
		//지역클래스는 선언된 지역(메소드)안에서만 사용!
		
		AAA obj= new AAA();
		obj.show();
		
		
		//지역 클래스 사용이유:
		//1. 지역클래스를 메소드 안에서 1회용으로 잠깐 사용하는 객체가 필요할때
		//2. 나중에 배울 '익명클래스'란 것을 쓸 때 지역클래스 문법 사용
		
		
		
	}
	

	void bbb{
		// aaa()메소드 안에 있는 지역클래스 AAA를 인식할 수 없음
		AAA obj= new AAA(); //error
	}
	

}
