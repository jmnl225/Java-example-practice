
public class SwimmingRobot extends Robot {
	
	//새로운 기능만 추가하면 댐
	
	void swimmint() {
		System.out.println("음파!");
	}
	
	
	//오버라이드 override
	void move() {
		System.out.println("첨벙첨벙");
	}


	@Override //annotation: 강제주석
	void attack() {
		// TODO Auto-generated method stub
		System.out.println("어뢰 발사");
	}
	
	
	
	
	
	
	
}
