
public class FlyRobot extends Robot {
	
	//이미 move와 attack 기능을 보유한 상태!
	
	//새로운 기능만 추가하면 됨
	
	void fly() {
		System.out.println("파닥파닥~");
	}
	
	
	//상속받은 기능이 맘에 안 들 수 있잖아!
	//이걸 개선하는 기법이 필요!
	//메소드의 오버 라이딩! Override - 상속받은 메소드와 같은 형태인 메소드
	
	void move() {//
		System.out.println("슈웅");
	}
	
	void attack() {
		System.out.println("미사일발사!");
	}
	
	
	
}
