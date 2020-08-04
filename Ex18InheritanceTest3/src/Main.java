
public class Main {
	static public void main(String[] args) {
		
		Second s= new Second();
		s.show();
		
		//파라미터를 통해서 값을 전달 객체 생성
		Second s2= new Second(10, 20);
		s2.show();
		
		
		
		Second s3= new Second(50, 60);
		s3.show();
		
		
		//상속의 상속도 가능! (조부모-부모-자식)
		//Second를 상속받은 Third 클래스
		Third t= new Third();
		
		
		System.out.println();
		
		//상속에 사용되었던 First class를 또 다른 class가 상속해도 됨!
		//상속은 1회용이 아니다ㅏㅏㅏ~~~ 
		Test test= new Test();
		System.out.println();
		
		
		//여러개의 클래스 상속받기: java에서는 불가능!
		
		
		
		//상속을 사용할 때 고려할 점:
		//상속받은 기능이 마음에 안 들 때!
		
		
		
		
	}
}
