
public class Student {
	
	//연관있는 데이터를 저장할 수 있는 변수를 정의
	//Field = 멤버변수
	
	String name;
	int kor;
	int eng;
	double aver;
	
	//기능을 설계
	//예 ) 화면에 aaa라는 글씨를 출력해주는 기능! (function->method)
	void show() {
		//aaa글씨 출력코드 실행문
		System.out.println("aaa");
	}
	
	void output() {
		System.out.println("이름: "+name);
		System.out.println("국어: "+kor);
		System.out.println("영어: "+eng);
		System.out.println("평균: "+aver);
		System.out.println("-------------------");
		
		
		
		
		
	}
	
	
	//평균계산기능 만들기!
	
	void calAverage() {
		
		aver=(double)(kor+eng)/2;
		
	}

}
