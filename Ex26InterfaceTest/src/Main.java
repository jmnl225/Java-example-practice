
public class Main {
	public static void main(String[] args) {
		
		//인터페이스 interface [추상메소드만 가진 추상클래스]
		//Test t= new Test; error
		
		//Test 인터페이스를 사용하려면 Test인터페이스를 구현한 새로운 클래스를 만들고 이를 객체로 생성하여 사용
		
		First f= new First();
		f.aaa();
		f.bbb();
		
		//Second가 Test인터페이스를 구현했다면
		//이 클래스는 반드시 aaa()와  bbb()가 있을거라 확신가능!
		Second s= new Second();
		s.aaa();
		s.bbb();
		
		System.out.println();
		
		//6. Test 참조변수로 자식객체들인 First와 Second를 참조가능
		Test t= null;
		t= new First(); //업캐스팅: 인터페이스 테스트 참조변수가 클래스 객체 생성
		t.aaa(); //참조변수가 실제 참조하는 객체의 오버라이드 메소드가 발동
		t.bbb(); 
		
		t= new Second(); //업캐스팅
		t.aaa();
		t.bbb();
		
		//interface: 서로 다른걸 연결시켜주기 위함. (규격을 맞춰줌)
		
		System.out.println();
		
		//7. 이너클래스는 외부에서 그냥 인식되지 않는다. -> 아우터명 쓰고 사용
		//원래 이너클래스는 인식이 되더라도 객체생성이 안 됨! = 아우터클래스만 사용가능!
		//하지만 STATIC 이너클래스는 아우터없이 곧바로 생성 가능
		Test.Hello h= new Test.Hello();
		h.show();
		
		
		//8. 다중구현: AAA, BBB를 구현한 Sample class
		Sample k=new Sample();
		k.aaa();
		k.bbb();
		k.ccc();
		
		
		
		
	}

}// Main class end.
