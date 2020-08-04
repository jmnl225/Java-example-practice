
//인터페이스를 정의하는 모습: 클래스를 정의하는 모습과 거의 흡사
//interface == abstract class 와 비슷한 문법
//new를 이용해서 객체생성 불가!

public interface Test {
	
	//interface의 특징들:
	//1. 인터페이스 {}안에서는 인스턴스변수, static 변수, 인스턴스 메소드를 가질 수 없음. 멤버 필드 중에서는 final만 가능
	//2. 인터페이스 안에서는 abstract method, static method만 사용 가능
	//3. 인터페이스의 멤버는 모두 접근제한자가 public만 허용됨
	//4. 인터페이스는 기능(메소드) 구현이 완성되지 않은 설계도면이므로 그냥 사용할 순 없다. 반드시 기능을 구현해야만 사용 가능
	//5. 인터페이스를 사용하려면 새로운 클래스를 정의하면서 기능을 구현해야함.
	//6. 인터페이스의 구현도 일종의 상속개념이기에 Up casting이 된다.
	//7. 인터페이스도 이너클래스를 가질 수 있음
	//8. 인터페이스는 다중구현이 가능함 ex) AAA, BBB 인터페이스 -> Sample 클래스에서 구현
	//9. 인터페이스도 다른 인터페이스를 상속받을 수 있음 // KKK인터페이스를 상속한 SSS인터페이스
	
	
	
	// 인터페이스는 서로 다른 클래스가 같은 이름의 메소드를 사용하기 위해 만들어짐
	
	// 1.일반적인 멤버변수 불가
//	int a;
//	static b;
	
	//final 상수는 사용 가능!
	final int a=10;	//자동 public static
	int b=20; 		//자동 public static final로 바뀜: 명시적 초기화를 했을 때
	
	//3. 접근제한자는 public만 가능
//	private static final int c=100;
//	protected static final int d=50;
	public static final int e=50;
	
	
	//인스턴스메소드 불가 
//	void show() {
//		
//	} 
	
	
	// 2. 추상메소드: 이름만 있고 기능이 구현(implements)되어있지 않은 메소드
	abstract void aaa();
	void bbb();		//자동 public abstract
	//static 메소드 (JDK 1.8버전부터 가능)
	static void ccc() {
		System.out.println("Hello, ccc");
	}
	
	
	
	// inner class: 자동 public static
	
	class Hello{
		void show() {
			System.out.println("Show inner Class!");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}// Test interface end.
