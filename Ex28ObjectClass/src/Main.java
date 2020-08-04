import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Test t= new Test();
		
		//Test 클래스는 명시적으로 아무것도 상속받지 않았지만 이미 자동으로 Object라는 클래스가 상속된 상태
		//그래서 직접 만들지 않은 메소드를 이미 보유
		
		//t.toString();//이런 메소드
		
		//모든 Object 클래스의 주요 메소드
		//1. toString() : 객체를 소개하는 문자열을 리턴해주는 메소드
		//2. equals(Object obj) : 전달받은 obj와 같은 객체인지 여부를 리턴[true, false]
		//3. hashCode() : 객체의 해쉬코드를 반환
		//4. getclass() : 클래스의 정보를 가진 객체를 리턴 [리턴타입 Class]
		//5. wait(), notify(), notifyAll() - 이건 Thread 수업에서 소개
		
		//1) toString() 메소드: 객체를 소개하는 문자열을 리턴
		String s= t.toString();
		System.out.println(s); //[default: 클래스명@해쉬코드]
		
		Test t2= new Test();
		String s2= t2.toString();
		System.out.println(s2);
		
		
		System.out.println(t2); // 참조변수를 출력하면 주소값(해시코드)가 나옴
		
		//System.out.println(); 메소드의 능력: 참조변수를 출력하면 해시코드로 바꿔줌
		
		//예외상황! : String 클래스
		String s3= new String("Hello");
		System.out.println( s3 ); //object의 오버라이드
		//String 의 toString() 메소드는 오버라이드를 해서 기능변경
		
		//연습으로 First클래스를 만들고 toString()을 오버라이드 해보기
		First f= new First();
		System.out.println( f ); //자동으로 .toString() 
		
		//실무에서는 바로 toString을 오버라이드

		System.out.println("---------2--------");
		
		//2) equals(Object obj) : 같은 객체인지 확인하는 메소드
		Test t4= new Test();
		Test t5= new Test();
		System.out.println( t4.equals(t5) );
		
		Test t6= t4;
		
		System.out.println(t4.equals(t6)); //true
		
		//사실 잘 사용 안 함 ㅎ
		System.out.println(t4==t5); //주소끼리 비교
		
		
		
		//이 equals()를 멤버변수의 값 비교로 사용하는 클래스: String 클래스
		String s4= new String("Hello");
		String s5= new String("Hello");
		
		System.out.println(s4==s5); //같은 객체가 아니므로 false
		System.out.println(s4.equals(s5));
		//String 클래스는 equals 메소드의 기능을 멤버변수 값 비교로 변경(오버라이드)
		
		System.out.println("-------3-------");
		
		//3) getClass() : 클래스의 정보를 가진 객체를 리턴
		Test t7= new Test();
		Class a= t7.getClass();
		System.out.println(a.getName());
		System.out.println(a.getSuperclass());
		System.out.println(a.getPackage());
		System.out.println(a.getFields());
		
		//getClass를 줄여서
		Test.class.getName();
		
		
		System.out.println("---------4--------");
		
		//4) hashCode() : 객체의 논리적 주소[자바에서의 객체주소]
		Test t8= new Test();
		int hc= t8.hashCode();
		System.out.println( hc ); //자바에서의 객체주소로 생각해도 무방: 10진수로 출력
		System.out.println(t8.hashCode()); //16진수로 출력
		System.out.println(Integer.toHexString(hc));
		
		
		//Object클래스는 java에 존재하는 모든 클래스의 최상위(root) 클래스
		//모든 클래스의 부모클래스가 됨
		// -> 부모참조변수로 자식을 참조할 수 있으므로 
		// Object참조변수는 모든 객체를 참조하는 것이 가능함 - 만능 참조변수처럼!
		
		Object obj = null;
		obj= new Test(); //업캐스팅
		obj= new Random();
		obj= new String();
		obj= new Scanner(System.in);
		obj= new ArrayList(); //ctr+sht+o
		
		
		
		
	}
}
