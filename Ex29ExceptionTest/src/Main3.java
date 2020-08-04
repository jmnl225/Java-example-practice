
public class Main3 {
	
	public static void main(String[] args) {
		
		//throw: 코드를 통해서 예외를 강제로 발동 != throws
		
		try {
			System.out.println("aaa");
			//억지로 예외발동!
			throw new Exception(); //예외객체를 만들어서 강제 던지기
			
			//System.out.println("bbb"); //예외가 아닌데도 만들었기에 이 코드가 실행이 안 됨
			
		}catch(Exception e) {
			System.out.println("예외발생!");
		}
		
		//[활용 예]
		
		//메소드에게 뺄셈계산을 해달라고 요구, return된 결과가 음수일 수 있음
		//프로그램에서 음수가 나온다고해서 예외가 발생하진 않음
		// 그러나, 이 앱에서는 음수가 절대 나오지 않도록 하고싶다면!
		// 음수가 나오면 0나눗셈 한 것 처럼 잘못된 연산이라 표기하고싶다면
		// 억지로 음수일 때 예외를 throw하도록 만듦
		
		int n;

		
		try {
		n=aaa(10,3);
		System.out.println("n: "+ n);
		
		n=aaa(10,13);
		System.out.println("n: "+ n);
		
		}catch(Exception e) {
			System.out.println("계산 결과가 음수입니다.");
			System.out.println( e.getMessage() );
		}
		
		
		
		
	}
	
	
	static int aaa(int a, int b) throws Exception {
		if( a<b ) {//음수가 나올 상황
			throw new MyException("Hi ><");
		}
		return a-b;
	}
	
	
	

}//main end.



//나만의 Exception 클래스 설계 가능

class MyException extends Exception{
	//생성자
	public MyException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
		
		
		
	}
}












