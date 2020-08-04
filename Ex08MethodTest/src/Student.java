
public class Student {

	String name;
	int kor;
	int eng;
	
	//멤버 함수 - 메소드
	//멤버변수의 값을 출력해주는 기능
	
	void show() {
		System.out.println("이름:  "+ name);
		System.out.println("국어:  "+ kor);
		System.out.println("영어:  "+ eng);
		System.out.println();
	}
	
	
	//필드에 값을 대입하는 메소드
	
	void setMembers(String name, int kor, int eng) {
		//매개변수와 멤버변수는 서로 다른 변수
		//매개변수의 값을 멤버변수에 대입
		
		this.name=name; //this. 이라는 참조변수를 사용하면 멤버변수를 지칭
		this.kor=kor;
		this.eng=eng;
				
	}//setMembers end.
	
	
	//멤버변수별 값을 대입하는 기능함수
	
	void setNames(String name) {
		this.name=name;
	}
	
	void setKor(int kor){
		this.kor=kor;
	}
	
	void setEng(int eng) {
		
		if(eng<0 || eng>100) {
			System.out.println("잘못된 값 입력입니다.");
			return; //함수종료
		}
		this.eng=eng;
	}
	
	
	//총점을 계산하는 기능
	int calTotal() {
		int total=this.eng+this.kor;
		return total;
	}
	
	
	
	//평균 계산해서 리턴해주는 기능함수(메소드)
	
	double calAverage() {
		double aver=(double)(kor+eng)/2;
		return aver;
	}
	
	//하나의 메소드에서 다른 메소드를 호출하자
	
	double calAverage2() {
		double aver= (double)calTotal()/2;
		return aver;
	}
	
	
}
