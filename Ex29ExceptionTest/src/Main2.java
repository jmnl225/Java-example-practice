import java.net.MalformedURLException;
import java.net.URL;

public class Main2 {
	
	public static void main(String[] args) {
		
		
		// throws: 예외 떠넘기기
		
		try {
		int x = divide(10, 5);
		System.out.println( x );
		}catch(ArithmeticException e) {
			System.out.println("나눗셈 불가");
		}
		
		
		
		//폭탄 떠넘기기:
		
		try {
			aaa();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		
		
	
	}

	//아무문제 없어보이지만
	//0 나눗셈 문제가 생길 수 있음
	//예외처리 try를 쓰면 잘 될 것 같지만 심각한 문제가 생김
	//즉, 메소드 안에서 발생하는 예외상황을 메소드 안에서는 해결 안됨
	
//	static int divide(int a, int b) {
//		try {
//			return a/b;
//		}catch(ArithmeticException e) {
//			System.out.println("Exception: 0 나눗셈 불가");
//			return ?; //여기에 쓸 값이 없음
//		}
//	}
		
	
	//throws
	//예외를 이 메소드 안에서 해결하지 않고 그 메소드를 호출하는 곳으로 던짐!
	
	static int divide(int a, int b) throws ArithmeticException {
		return a/b;
	}
	
	//폭탄떠넘기기 가능 : 예외를 던지고 던지고 던짐
	
	static void aaa() throws MalformedURLException {
		bbb();
		System.out.println("aaa");
	}
	
	static void bbb() throws MalformedURLException, Exception {// 여러개 던지기가 가능
		URL url= new URL("http://www.naver.com");
		ccc(); // Exception을 던지면 무조건 예외처리를 해야함
	}
	
	static void ccc() throws Exception{
		
	}
	
	
}// main end.
