
public class Variable {
		//자바의 변수 구분(종류) [멤버변수, 지역변수, 매개변수, 정적(static)변수]
	
	//class {}영역 안에 선언된 변수: 멤버변수
	//선언된 {}안에서는 어디서든 인식가능
	int a; //멤버변수의 특징: 기본적으로 0으로 자동초기화.
	double b; //0.0
	boolean c; // false
	String s; //null
	
	void aaa() {
		System.out.println(a);
		a=10; //멤버변수
		k=50; //멤버변수는 메소드보다 빨리 생성됨
		
		bbb(); //멤버 메소드끼리 호출순서 상관없음
		
		int m; //지역변수: 메소드{} 안에 만들어진 변수 - 선언된 메소드 안에서만 인식
		System.out.println(m);// error. 지역변수는 자동초기화가 안됨. = 쓰레기값
		
		h=50; //error. 지역변수는 반드시 순서대로
		int h;
		
	}
	
	void bbb() {
		a=20; //인식이 됨!
		
		m=100; // error. aaa() 메소드의 지역변수 m은 바로 인식 불가
		x=50; //ccc의 매개변수는 지역변수라 인식불가.
	}
	
	int k; //클래스 안에서 변수 선언 순서는 상관이 없다
	
	
	
	void ccc(int x) { //x: 매개변수: 메소드 ()안에 선언된 지역변수
		
		
	}
	
	
	
	
	
	
}

class Nice{
	
	a=10; //error. 다른 클래스의 멤버 변수는 인식이 불가능.
	
}