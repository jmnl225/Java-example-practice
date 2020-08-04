
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Student객체 생성
		Student stu= new Student();
		stu.name="Sam Smith";
		stu.kor=80;
		stu.eng=70;
		
		
		stu.show();
		
		Student stu2= new Student();
		//값을 일일히 대입하는거 귀찮아~!
		
		stu2.setMembers("robid", 40, 60); //기능을 호출하면서 전달하고자 하는 값을 파라미터에 입력
		stu2.show();
		
		Student stu3= new Student();
		stu3.setMembers("Choi", 50, 60);
		stu3.show();
		
		//멤버변수중에서 하나만 값을 대입하기!
		
		//멤버변수별로 값을 대입하는 기능함수도 필수적으로만듦
		
		stu3.setEng(75);
		stu3.show();
		
		//어떤 학생의 총점을 얻어오고 싶다면!
		//int total=stu3.kor+stu3.eng;
		//System.out.println("총점:  "+total);
		
		
		//총점계산기능도 객체 스스로 갖고있도록!
		
		int total=stu3.calTotal();
		System.out.println("총점:  "+total);
		
		
		//평균출력
		
		double aver= (double)stu3.calTotal()/2;
		System.out.println("평균1:  "+aver);
		
		//평균계산도 객체 스스로 하게 만들자!
		//즉, 평균 계산 기능 추가 
		
		double average=stu3.calAverage();
		System.out.println("평균2:  "+average);
		
		//메소드 안에서 메소드 호출
		aver=stu3.calAverage2();
		System.out.println("평균3:  "+aver);
		
		
		
		//결국
		//객체는 변수+메소드를 가진 것!
		
		//객체 중에서 메소드만 있는 녀석도 존재 -> 많다

	}

}
