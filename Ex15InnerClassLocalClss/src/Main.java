
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//일반적인 클래스는 객체생성이 쉬움
		Test t= new Test();
		
		//Test 클래스의 이너클래스인 Nice사용
//		Nice n; //인식불가!
		
		//아우터 클래스 명을 사용하면 인식됨.
//		Test.Nice n;
		
		//인식은 되더라도 객체 생성은 불가!
//		Test.Nice n2= new Test.Nice(); //객체생성 안댐~!
		
		
		//외부에서 이너클래스를 꼭 사용하고 싶다면?
		// -> 아우터 객체에게 만들어달라고 부탁하자. 허락을 받아야함!
		
		Test.Nice n2=t.makeInnerClassObject();
		n2.k=50;
		n2.aaa();
		
		
		//개발자들이 정말 싫어하는 코드/ 표기문법!!
//		Test.Nice n3= t.new Nice();
//		n3.aaa();
		
		
		
		Test t2= new Test(); //아우터객체를 만들었다고 이너객체가 자동으로 생성되지 않음!
		
		//static 이너클래스는 아우터없이 객체생성 가능!
		 First.Hello h=new First.Hello();
		
		
		
	}

}
