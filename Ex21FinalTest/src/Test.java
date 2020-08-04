
public class Test {
	
	final int num=20; //필드 = 멤버변수 -> final 멤버변수
//	final int age; //error. final 멤버변수는 반드시 선언하면서 명시적 초기화가 되어있어야한다.
	// 멤버변수는 안됨
	
	void aaa() {
//		num=30; //num이 상수라서 안 됨
		
		final int melon;
		bbb(10);
		
	}
	
	void bbb(final int k) {
//		k=30; //error. 
		System.out.println( k );
	}
	
	//메소드에 final 붙이기
	//= final method
	
	final void show() {
		System.out.println("Test!!");
	}
	
	
}
