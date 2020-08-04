

//이 Animal이 객체가 되지 않도록 막고싶다면
//이 클래스를 '추상 클래스'로 만들어야한다.

public abstract class Animal {
	
	//오버라이드용으로 만드는 메소드: 내용이 없음
	
	void say() {}
	
	//혹은, 모든 동물의 공통기능
	
	void sleep() {
		System.out.println("zzZ");
	}
	
}
