import member.Person;

public class Main {
	
	public static void main(String[] args) {
		
		
		//접근 제한자의 4가지 종류(보안 강->약)
		//1. private	: 본인 class 내부에서만 접근가능
		//2. default	: 같은 패키지 안에서는 외부에서 .연산자로 접근가능 
		//3. protected	: 같은 패키지 안에서는 외부에서 .연산자로 접근가능, 다른 패키지여도 상속관계면 접근가능
		//4. public 	: 어느곳에서나 .연산자를 통해 멤버 접근 가능!
		
		//같은 패키지의 클래스 객체 생성
		First f= new First();
		//f.a=10; //error. private은 외부에서 사용 불가
		f.b=20; //default : 같은 패키지 사용 가능
		f.c=30; 
		f.d=40;
		//같은 패키지 내에서는 private을 제외하고 모든 멤버 사용 가능
		
		
		
		//다른 패키지 클래스 객체 생성 [다른 패키지는 캐피지명. ]
		aaa.Second s= new aaa.Second();
		//s.a= 10; //error - private은 외부에서 접근불가
		//s.b= 20; //error - 다른 패키지의 default는 접근불가
		//s.c= 30; //error - 다른 패키지의 default는 접근불가, 상속도 아님
		s.d= 40;
		
		//s.aaa();//error - default 접근 제한 메소드도 실행 불가
		
		s.bbb();
		
		//다른 패키지의 default class는 객체 생성도 불가함
		//aaa.Test t;
		
		
		
		//접근제한 권장 규칙
		//멤버 변수는 private
		//멤버 메소드는 public
		
		//ex) 앱 사용자 정보 저장: 이름, 나이, 국적
		
		Person p= new Person();
		
		//정보가 은닉되어있으니 은닉된 필드에 값을 대입해주는 기능이 필요
		
		p.setMembers("Jully", 32, "Korea");
		
		p.show();

		
		//이름만 변경하고 싶다면?
		//p.name="aaa"; //error- private
		//멤버값 하나만 변경하는 기능 메소드 필요.
		
		//멤버값별로 세팅하는 set XXX() 함수가 필요
		
		p.setAge(15);
		p.setName("Jun");
		
		//멤버값 1개 사용하기.
		//ex) 나이가 20살 미만인가?
		
		//if(p.age<20) {//age가 private 이라 안댐! 
		//	System.out.println("미성년자!");
		//}
		
		
		//age값만 리턴해주는 메소드!
		
		if(p.getAge() < 20) {
			System.out.println("나이 더 먹고 와!");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
