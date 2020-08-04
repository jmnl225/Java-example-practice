
public class Third {
	
	//멤버변수 = field
	
	int a;
	
	//멤버 함수 = method
	
	void show() {
		System.out.println("Third Show!");
		
		//method 안에 class를 정의
		//내장클래스 (local class) = 지역클래스. 밖에서는 인지가 안 됨.
		class Nice{
			int n;
			void aaa() {}
		}
		
		Nice n=new Nice();
		n.aaa();
		
		Test tt= new Test();
		tt.show();
		
		
	}//show method end.
	

	//클래스 안에 또 다른 클래스 선언 가능
	//inner 클래스
	//이너클래스는 이너클래스를 감싸는 아우터클래스만 사용할 수 있음
	
	class Hello{
		
	}
	
	
	

} // Third class end.





//하나의 .java 문서 안에 여러개의 class
//단, 하나의 문서안에 public class는 오직 하나여야함. 1개~!
//.java문서명은 public class와 같은 이름이여야함 (순서는 상관없음


class Test{
	
	void show() {
		System.out.println("Test Show!");
	}
	
}