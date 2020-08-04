
public class First {
	int a=10;
	
	
	//이너클래스
	//아우터객체가 없어도 이너객체를 생성할 수 있는 방법: static
	public static class Hello {
		void show() {
			System.out.println("Hello! Show!");
			
			//이너클래스의 장점: 아우터의 멤버를 맘대로 쓸 수 있음
			//static 이너클래스에서는 아우터의 인스턴스 변수를 사용할 수 없다!
			//왜냐하면, 아우터객체가 만들어지지 않아도 
			// 단, static 변수는 사용 가능 ^^!
			
		}
	}

}
