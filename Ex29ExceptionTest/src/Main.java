import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. Error(오류)		: 실행 불가
		// 2. Exception(예외)	: 실행 중(Run Time) 문제가 발생
		
		// Exception 예:
		// 1) 사용자가 잘못된 데이터를 입력하는 경우
		// 2) 개발자 로직이나 계산이 잘못된 경우
		// 3) 네트워크나 하드웨어 오류
		// 4) 악의적 과부하 공격(디도스 공격) virus: 해결이 어려움
		
		
		System.out.println("예외처리에 대해 알아봅시다!");
		
		
		// 예외상황에 대한 확인
//		int k=0;
//		System.out.println( 10/k );
		//예외가 발생하는 프로그램은 그 위치에서 강제 종료됨
		//앱 사용자들은 프로그램 사용중에 예외상황이 발생하더라도 앱이 다운되는 것 보다는 
		//그 작업만 안 하고 나머지 작업들은 그대로 수행하길 희망함
		
		//[예외처리] 라는 기술은 예외가 안 나도록 하는 것이 아님!
		//단, 예외가 발생하더라도 그 작업만 안 하고 다른 작업이 수행하도록 조절 = 예외처리
		
		// 0 나눗셈같은 경우: if문으로 해결
		// 하지만! 서버접속같은 경우는 서버의 다운여부를 미리 if문으로 파악하는 것이 불가능
		//그래서 무조건 시도해보고 예외가 발생하면 대응하는 방법이 필요
		
		//예외처리 문법 : 어떤 작업을 시도(try)하고 만약 예외가 발생하면 프로그램이 다운되지 않도록 하는것 
		
		
		//1) 0으로 나눗셈
		
		int a=2;
		try {
			System.out.println("결과: "+10/a); // 예외발생이 예상됨
		}catch(ArithmeticException e) {
			System.out.println("*Exception*");
			//전달받은 파라미터 e 는 예외정보를 갖고있는 객체
			System.out.println(e.toString());
		}
		System.out.println();
	
		
		//2) 배열의 인덱스번호 사용 오류
		int[] arr= new int[5];
		
		try {
			for(int i=0; i<=5; i++) {
				System.out.println(arr[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception!");
		}
		System.out.println();
		
		//3) null 참조변수로 객체의 메소드 사용
		String s= null;
		try {
			System.out.println(s.length());
		}catch(NullPointerException e) {
			System.out.println("Exception: 참조변수가 가리키는 곳이 없음");
		}
		System.out.println();
		
		
		//4) 잘못된 데이터를 입력!
		Scanner scan= new Scanner(System.in);
//		int n;
//		try {
//			n=scan.nextInt();
//			System.out.println("n: "+ n); //에러가 발생하지 않았을때만 출력!
//		}catch(InputMismatchException e) {
//			System.out.println("Exception! 정수를 입력하세요.");
//		}
		
		
		//5) 숫자가 아닌값을 숫자로 변경하고자 할때
//		String str= scan.next(); //문자열입력
		
		try {
//			int num = (Integer.parseInt(str));
//			System.out.println( num );
		}catch(NumberFormatException e) {
			System.out.println("Exception: 숫자가 아니라서 변환 불가");
		}
		
		
		//** 정리! 예외처리는 프로그램이 다운되지 않도록 하는 문법 **
		
		//예외가 한번에 여러개 발생하는 경우..
		//예) 두 수를 입력받아 두 수를 나눗셈하는 경우
		//예외처리를 중첩으로
		
		int c, d;
		
//		try {
//			c= scan.nextInt();
//			d= scan.nextInt();
//			try {
//				System.out.println("나눗셈 결과 : "+ c/d);
//				}catch(ArithmeticException e) {
//					System.out.println("Exception: 0 나눗셈");
//				}
//				
//		}catch(InputMismatchException e) {
//			System.out.println("Exception: 정수만 입력 가능");
//		}
		
		
		// 멀티 catch : 문법이 더 간결해 보임+가독성
		
//		try {
//			c= scan.nextInt();
//			d= scan.nextInt();
//			
//			System.out.println("나눗셈: "+ c/d);
//		}catch(InputMismatchException e) {
//			System.out.println("Exception: 정수만 가능");
//		}catch(ArithmeticException e) {
//			System.out.println("Exception: 0 나눗셈 불가");
//		}
		
		
		//멀티 catch는 갯수제한이 없음 -> 몇개든 한 번에 처리하는 것이 가능
		// 단, 모든 예외상황에서 처리할 내용이 특별히 다르지 않다면..
		
		//멀티catch: 모든 Exception 클래스의 부모참조변수 사용
		
//		try {
//			c= scan.nextInt();
//			d= scan.nextInt();
//			
//			System.out.println("나눗셈: "+ c/d);
//		}catch( Exception e) { //어떤 종류의 Exception도 다 받을 수 있는 매개변수
//			System.out.println("에러~~~~~!!!");
//		}
		
		
		
		//finally 문법 - 예외가 발생하든 안하든 무조건 실행되는 영역
		int x= 0;
		try {
			System.out.println(10/x);
			System.out.println("계산 성공!");
		}catch(Exception e) {
			System.out.println("계산 실패!");
		}finally {
			//위 에러사항과는 상관없이 무조건 실행
			System.out.println("fianlly!!!");
		}
		
		
		// ..?? 그런데 finally가 없어도
		//어차피 try-catch{} 밖에 쓰면 무조건 실행됨.
		// 의미가 없어보임
		// -> finally가 없다면 try 안에있는 코드와는 상관없는 코드를 썼다고 생각
		
		//finally를 쓰든 안 쓰든 사실 큰 차이는 없지만, finally의 코드가 try문과 연결되어있음을 나타내기 위해 존재
		
		//finally를 쓰게되면 catch문을 생각 가능
		try {
			
		}finally {}
		
		
		//에외의 ㅣㅣㅣㅣㅣㅣㅣㅣㅣㅣㅣㅣㅣㅣㅣㅣㅣㅣㅣㅣㅣㅣㅣㅣㅣㅣㅣㅣㅣㅣㅣㅣㅣㅣㅣㅣㅣ
		
		//1. Checked Exception		:예외처리를 안 하면 실행조차 하지 않음
		//2. unchuked Exception
		
		//네트워크 작업
//		
//		try {
//		URL url new URL("http://www.naver.com")
//		}catch(MalformedURLException)
		

		
		//파일 입출력
		File file= new File("D://aaa.txt")
		
		try {
			FileInputStream fis= new FileInputStream(file);
			
			System.out.println("파일 접속 성공");
		}catch(FileNotFoundException e) {
			System.out.println(""+"파일접속실패! : 파일없음");
		}
		
		
		
		//이 줄은?
		System.out.println();
		System.out.println("쨔란!!");
		
		
		
	}

}
