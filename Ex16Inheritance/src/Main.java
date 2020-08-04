
public class Main {
	public static void main(String[] args) {
		
		//개략적인 상속의 개념 알아보기
		
		Robot r=new Robot();
		r.move();
		r.attack();
		
		FlyRobot fr=new FlyRobot();
		
		fr.move();
		fr.attack();
		fr.fly();
		
		
		
		SwimmingRobot sr= new SwimmingRobot();
		sr.name="aaa";
		sr.HP=100;
		sr.move();
		sr.attack();
		
		sr.duckFoot=2;
		sr.swimming();
		
	}
}
