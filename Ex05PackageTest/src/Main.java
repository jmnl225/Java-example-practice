//다른 패키지의 클래스를 편하게 사용하고 싶다면! import~!
import aaa.Student;

//aaa패키지 안에 있ㄴ는 모든 클래스를 한번에 import하기!

import aaa.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//class생성 + 객체생성 및 사용
		
		Test t= new Test();
		t.a=10; //멤버변수 사용
		t.show(); //멤버 함수의 사용
		
		//같은 이름을 가진 클래스를 만들면 문제가 생김~!
		//해결책! package!!
		//실제 폴더 구분을 통해 같은 이름의 class가 존재할 수 있음
		
		//[이름, 국어, 영어] 데이터 저장 객체
		
		aaa.Student stu=new aaa.Student();
		//다른 package의 class는 [패키지명.클래스]를 해야 인식
		
		//멤버변수 field
		stu.name="sam";
		stu.kor=70;
		stu.eng=50;
		
		//[이름, 국어, 영어] 데이터 저장 객체 더 만들기!
		//매번 패키지명 작성 ㅠ
		//패키지명을 생략하는 방법!!! = import
		
		aaa.Student stu2=new Student();
		Student stu3=new Student();
		
		
		//java system API 클래스 사용시 import가 필요했지!
		//즉, Java system API 클래스는 모두 패키지가 적용된 상태
		
		
		java.util.Random rnd;
		
		//java.util이 패키지 이름!
		//aaa.Student처럼 편하게 사용하기 위해 import를 했던 거임!
		
		
		//[이름, 나이, 주소]를 저장하는 Student 객체 생성
		bbb.Student s1= new bbb.Student(); //이미 Student가 있으므로 import로 간략한 사용이 불가능~!
		s1.name="robin";
		//s1.age=20; //접근 제한자 문제로 사용불가
		
		
		//패키지명 권장사항
		//가급적 패키지명은 적어도 2단어 이상으로 만들것!!!!!
		//그리고 두 단어 사이에 .표기
		//ex) mrhi.java / kakao.map
		//ex)google.api.android
		//소속-카테고리-기능 순
		
		mrhi.dev.World w=new mrhi.dev.World();
		
		
		
		//디폴트 패키지는 다른 패키지에서 사용 못함. 
		//그래서 실무에선 디폴트패키지를 사용하지 않음!!

	}

}
