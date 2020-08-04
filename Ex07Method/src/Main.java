import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		//학생 성적 관리 프로그램
		//이름, 국어, 영어 평균

		String name;
		int kor;
		int eng;
		double aver;
		
		name="sam";
		kor=70;
		eng=80;
		
		aver=(double)(kor+eng)/2;
		
		
		//학생이 여러명이면? -> 변수명에 문제발생
		//변수 여러개 한번에 관리 - 배열
		//배열을 같은 자료형만 묶을 수 있음
		
		//자료형끼리 묶는 방식은 학생 데이터가 분산되어있어 안좋음
		//연관있는 데이터끼리 묶음 (=class) , 관리가 효과적.
		
		//연관있는 데이터끼리 묶음을 설계하는 class 정의
		//새로운 클래스 정의! 별도의 .java문서에 만드는 것을 권장
		
		
		
		//새로 설계된 Student클래스로 객체를 생성
		
		
		Student stu= new Student();
		stu.name="sam";
		stu.kor=70;
		stu.eng=80;
		stu.aver=(double)(stu.kor+stu.eng)/2;
		
		Student stu2= new Student();
		stu2.name="Robin";
		stu2.kor=40;
		stu2.eng=45;
		stu2.aver=(double)(stu2.kor+stu2.eng)/2;

		
		//화면 출력
		//System.out.println(stu); //객체정보
		System.out.println("이름: "+stu.name);
		System.out.println("국어: "+stu.kor);
		System.out.println("영어: "+stu.eng);
		System.out.println("평균: "+stu.aver);
		System.out.println();
		
		System.out.println("이름: "+stu2.name);
		System.out.println("국어: "+stu2.kor);
		System.out.println("영어: "+stu2.eng);
		System.out.println("평균: "+stu2.aver);
		
		
		//객체 멤버값 변경
		int ko=10;
		stu.kor=ko;
		
		System.out.println("변경된 kor값: "+stu.kor);
		System.out.println();
		
		
		
		
		//멤버의 값 데이터를 키보드로 입력받을 수도 있음.
		
		//키보드 입력기능을 가진 객체 생성
		Scanner scan=new Scanner(System.in);
		
		Student stu3=new Student();
		stu3.name=scan.next();
		stu3.kor=scan.nextInt();
		stu3.eng=scan.nextInt();
		stu3.aver=(double)(stu3.kor+stu3.eng)/2;
		
//		System.out.println("이름: "+stu3.name);
//		System.out.println("국어: "+stu3.kor);
//		System.out.println("영어: "+stu3.eng);
//		System.out.println("평균: "+stu3.aver);
//		
		//이런 식으로 값을 출력하는 방식
		//즉 객체에게 특정한 동작을 수행할 수 있는 기능을 줄 수 있다면~? (method)
		
		
		//java 에서는 class안에 특정 동작(기능)을 수행하는 코드를 작성할 수 있음
		//이런 특정 코드가 작성된 지역을 함수라고 부른다. 
		//METHOD
		
		stu3.show(); //메소드 호출
		
		//객체의 데이터 출력을 내가 일일히 하지 않고
		//객체의 출력기능을 이용해서 편하게 사용 가능
		
		stu3.output();
		
		Student stu4=new Student();
		stu4.name="Choi";
		stu4.kor=80;
		stu4.eng=63;
		//평균을 계산하는 기능도 만들자!
		stu4.calAverage();
		
		stu4.output();
		
		//멤버변수에 값을 대입하는 것도!?
		//특정 기능을 실행하면서 데이터를 전달! (=파라미터)
		
		//TODO: 내일 수업은 입력기능 만들기!
		
	}

}
