
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Robot r= new Robot();
		r.move();
		r.attack();
		System.out.println();
		
		FlyRobot fr= new FlyRobot();
		fr.move();		//오버라이드 : 새로 만들어진 메소드로 출력
		fr.attack();
		fr.fly();
		System.out.println();
		
		SwimmingRobot sr= new SwimmingRobot();
		sr.move();		//오버라이드된 메소드 호출
		sr.attack();
		sr.swimmint();
		System.out.println();
		
		//지금까지 본 오버라이드는 메소드의 내용을 완전히 다르게 작성하는 경우.
		
		//하지만, 기존기능을 그대로 쓰고 일부만 추가작성!
		Second s= new Second();
		s.show();
		
		

	}

}
