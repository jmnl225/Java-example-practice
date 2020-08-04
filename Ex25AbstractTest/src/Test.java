
//추상클래스: new를 이용한 객체생성이 불가능
// - 그냥 사용하는 것이 아니라 반드시 상속해서 사용


abstract public class Test {
	
	int a; //인스턴스 변수
	static int b=10; //static 변수[클래스변수]
	
	//생성자메소드 존재
	public Test() {
		System.out.println("Test 객체생성");
	}
	
	
	
	
	
	//인스턴스 메소드 
	void show() {
		System.out.println("Show!");
	}
	
	//추상메소드
	abstract void aaa();
	
//	abstract void bbb() {} //기능이 없어야하기에 {}사용이 불가
	abstract void bbb();
	
	//static과 abstract는 함께할 수 없음!!!!!!!!
	
//	static abstract void ccc();
	
	//static 메소드
	static void ccc() {
		System.out.println("Test class static method");
	}
	
	
}
