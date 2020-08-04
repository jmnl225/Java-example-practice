
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		First f = new First(); // 제대로 된 casting: 참조변수가 메소드를 잡는다.
		Second s= new Second(); //제대로 된 casting
		
		//다른 자료형(class)은 참조가 불가능. 하지만 예외가 있다!
		
		
		f= new Second();
		//부모 참조변수는 자식객체를 참조할 수 있음 (왜? 자식객체는 반드시 부모객체의 멤버를 갖고있음) -> 업캐스팅
		
		//s= new First(); 
		//자식 참조변수가 부모객체를 참조하는 것은 불가능 (왜? 부모객체에는 자식참조변수의 기능을 모두 갖고있지 않음 -> 다운캐스팅
		
		//부모가 자식을 참조하더라도..
		//자식 객체의 고유 멤버는 사용할 수 없음!!
		
		f.a=10;
		f.showFirst();
		//f.shwSecond(); //error. 자신의 참조변수/메소드 사용이 안됨
		
		//이런 상황에도 무조건 Second의 기능을 쓰고싷다면?
		//Second 참조변수가 필요함
		Second s2;
		
		//참조변수의 주소복사 error(왜?  자식 참조변수가  벼농샤. ㄴ->디
		s2= (Second)f; //f는 업캐스팅으로 현재 Second를 가리키고 있음
		
		
		System.out.println("==========================");
		
		
		First f5= new Second(); //업캐스팅(부모참조변수가 자식을 가리킴)
		f5.a=10;
		f5.showFirst();
		//f5.b=100; //error. 자식 고유 멤버
		f5.show(); // 오버라이드된 Second의 메소드가 실행됨
		
		// 이 기술이 어떨때 유용한가?
		// 부모참조변수 하나로 자식객체를 모두 제어하고 싶을때 사용
		First obj;
		obj= new First();
		obj.show();
		
		obj=new Second();
		obj.show();
		
		//First를 상속한 Test 클래스가 있다면
		obj=new Test(); //업캐스팅: 부모가 자식참조
		obj.show();
		
		
		//계층상속관계도 가능함 [조부모 참조변수 -> 손주 참조 ]
		obj= new Third();
		obj.show();
		
		//이렇게 obj.show 는 같지만 결과가 다르게 나타나는 기술= 다형성
		
		
	}

}
