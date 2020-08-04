
public class Main {
	public static void main(String[] args) {
	
		//어떤 대학의 정보제공앱 제작- 회원가입 가능
		// 회원종류: 일반회원, 학생, 교수, 근로학생
		
		
		//1. 일반회원: 이름, 나이
		//2. 학	  생: 이름, 나이, 전공
		//3. 교	  수: 이름, 나이, 연구과제
		//4. 근로학생: 이름, 나이, 전공, 업무
		
		
		
		//1. 일반회원
		
		Person p=new Person("Sam", 23);
		p.show();
		System.out.println();
		
		//2. 학생
		
		Student st= new Student("Robin", 20, "android");
		st.show();
		System.out.println();
		
		//3. 교수
		
		Professor pro= new Professor("Lee", 50, "mobile optimizition");
		pro.show();
		System.out.println();
		
		//4. 근로학생
		
		AlbaStudent alba= new AlbaStudent ("Hong", 23, "web", "PC management");
		alba.show();
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
