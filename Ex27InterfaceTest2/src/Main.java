import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		
		//팀장이 인터페이스를 설계
		
		//티장: Unit 인텊이스 설계
		//팀원1: Marine 클래스 정의 및 구현- 유닛이라면 가져야할 기본 기능 구현
		//팀원2: Tank 클래스 정의 및 구현
		//팀원3: Race 클래스 정의 및  구현
		
		//Marine, Tank, Race는 반드시 attack(), move() 기능이 있음을 확인
		
		
		//팀장은 만들어진 클래스들을 이용해서 게임 프로그램을 작성
		
		
		
		//각 클래스의 참조변수를 사용하지 않고...
		//부모 클래스의 역할인 Unit 인터페이스 참조변수를 이용하여 모든 유닛제어
		
		//Unit[] units= new Unit[200];
		//배열은 갯수가 고정되어있기 때문에 지속적으로 생성과 소멸이 반복되는 게임 프로그래밍에는 적합하지 않음.
		
		//실제 앱을 만들때는 유동적 배열을 더 많이 사용함
		//ArrayList: 유동적 배열 - 마치 기차처럼 객체를 주렁주렁 갖고있음
		
		
		ArrayList<Unit> units= new ArrayList<Unit>();
		//처음 시작: 개수 0개
		
		//요소개수 리턴하는 기능메소드 호출
		int num= units.size();
		System.out.println("유닛개수: "+ num);
		
		//배열에 unit객체들 생성하여 추가
		units.add(new Marine());
		units.add(new Tank());
		units.add(new Marine());
		units.add(new Race());		
		
		System.out.println("유닛개수: "+ units.size());
		System.out.println("\n-----------------------");
		
		//유닛기능 사용하기!
		Unit u=units.get(0); //0번째 위치한 요소하나 얻어옮
		u.attack();
		u.move();
		
		u=units.get(1);
		u.attack();
		u.move();
//		
//		u= units.get(2);
//		u.attack();
//		u.move();
		
		for(int i=0; i<units.size(); i++){
			Unit u2= units.get(i);
			
			u2.move();
			u2.attack();
		}
		
		System.out.println("\n-----------------------\n");
		
		
		//확장된 for each
		for( Unit unit: units) {
			unit.move();
			unit.attack();
		}
		
		
		//Marine과 Tank만 레벨업 기능 발동
		//현재 요소(unit)가 Marine 객체냐?
//		if ( unit instanceof Marine) {
//			Marine m= (Marine)unit;
//			m.levelup();
//		}else if( unit instanceof Tank) {
//			Tank t=(Tank)unit;
//			t.levelup();
//		}
		
		//Marine과 Tank가 모두 Levelupable의 자식이므로...
		Unit unit = null;
		if( unit instanceof Levelupable) {
			Levelupable a= (Levelupable)unit;
			a.levelup();

		}
		
		
	}// main static end.
}// main end.
