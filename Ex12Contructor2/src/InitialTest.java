
public class InitialTest {
	
	//1. 기본값 초기화 - 0에 해당하는 값
	int a=10; //2. 명시적 초기화: 대입만 가능. 연산이 전혀 안된다!
	
	//3.1 static 초기화 블럭
	static
	{
		System.out.println("static 초기화");
	}
	//3.2 인스턴스 (instance) 초기화 블럭
	{
		System.out.println("incstance 초기화");
		a=20;
	}
	
	//4. 생성자 메소드 - 매개변수 전달받아 초기화
	public InitialTest() {
		a=30;
	}
	
	
	
	
	
	
}
