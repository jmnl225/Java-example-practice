package bbb;

import aaa.AAA;

public class BBB extends AAA {// AAA는 다른 패키지의 클래스여서 그냥은 인식이 불가능!
	
	//이미 AAA의 4개 변수를 보유
	
	void show() {
//		System.out.println( a ); // a가 있는건 알지만 private 이여서 사용 불가!
//		System.out.println( b ); // b는 default 다른 패키지의 멤버가 접근 불가!
		System.out.println( c ); // BBB와 AAA가 상속관계여서 가능
		System.out.println( d ); // public
	}
	
	
	
}
