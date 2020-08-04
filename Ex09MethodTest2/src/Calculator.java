
//기능만 있는 클래스도 있다

public class Calculator {
	
	//덧셈기능 메소드 만들기
	
	int add(int x, int y) {
		return x+y;
	}
	
	//뺄셈기능
	
	int subtract(int x, int y) {
		return x-y;
	}
	
	//곱셈
	
	int multiply(int x, int y) {
		return x*y;
	}
	
	//나눗셈
	
	int divide(int x, int y) {
		return x/y;
	}
	
	//모두 정수형 계산기능. -> 실수형 계산기능 추가
	//기능은 같고 자료형이 다를 때
	//메소드의 이름을 다르게 주면 나중에 사용할 때 번거롭잖아
	//그리고 내 뒷자리남자 주겨버려
	//이름은 같게쓰고 파라미터를 다르게 사용하는 메소드 생성 가능!!!!!!!!!!!!!!!!!!!!!!!!
	//오버로딩(Over Loading)
	double add(double x, double y) {
		double sum= x+y;
		return sum;
	}
	
	double subtract(double x, double y) {
		return x-y;
	}
	
	double multiply(double x, double y) {
		return x*y;
	}
	
	double divide(double x, double y) {
		return x/y;
	}
	
	
	//문자열을 숫자로 변환하여 덧셈하는 기능!
	int add(String s1, String s2) {
		int n1=Integer.parseInt(s1);
		int n2=Integer.parseInt(s2);
		return n1+n2;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
