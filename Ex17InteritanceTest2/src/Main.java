
public class Main {
	public static void main(String[] args) {
		
		//상속받은 클래스의 관계를 지칭
		//c++ : base - derived
		
		
		
		Second s= new Second();
		s.a= 10; //상속받은 클래스의 멤버변수를 내것처럼 사용
		s.b= 20;
		
		System.out.println("a: "+s.a);
		System.out.println("b: "+s.b);
		System.out.println();
		
		//객체지향의 모티브: 객체의 멤버제어는 객체 스스로 해라!
		//-> 출력기능을 왜 내가 하지? 객체가 해!
		
		s.showFirst();
		System.out.println("b: "+s.b);
		System.out.println();
		
		
		//b도 Second가 하게하자!
		
		s.showFirst();
		s.showSecond();
		System.out.println();
		
		
		//? 이러면 그냥 Second에서 모두를 출력하지?
		
		s.show();
		System.out.println();
		
		
		//이런식이면 멤버값 입력도 메소드로 처리하자!
		
		s.setMembers(100,200);
		s.show();
		System.out.println();
		
		
		//이러고 보니.
		//객체를 생성하면서 값을 대입하는 게 낫지않어?
		//생성자 메소드를 이용하자!
		
		
//		Second s2= new Second(8, 3);
//		s2.show();
		
		
		//생성자 전!! 접근제한자의 영향에 대한 연습
		
		 
		
		
		
	}

}
