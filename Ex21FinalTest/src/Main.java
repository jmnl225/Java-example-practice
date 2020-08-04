
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 지역변수에 final 키워드를 붙이면 상수화된 변수가 된다
		
		final int a=10;
		
//		a=20; //a는 상수여서 변경불가
		
		
		
		//특이점!!
		final int b;
		b=10; //값을 처음 넣었을 때 상수화 됨.
//		b=20; //error.
		
		
		//멤버변수에도 final 키워드 적용 가능
		//알아보기 위해 Test 클래스 설계
		
		//final Method
		Test t= new Test();
		t.show();
		//final method는 오버라이드를 할 수 없다.
		
		
		//final class는 사용에는 문제 없음. 
		//단, 상속되지 않는다.
		
		
		
		
	}

}
