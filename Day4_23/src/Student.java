
public class Student {
	
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	
	
	int getTotal(){
		return kor+eng+math;
	}
	
	
	float getAverage() {
		float Ave=(int)(getTotal()/ 3f * 10 + 0.5f) / 10f;

		return Ave;
	}
	
	
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name=name;
		this.ban=ban;
		this.no=no;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	
	public Student() {
		
	}
	
	
	public String info() {
		return name
				+", "+ban
				+", "+no
				+", "+kor
				+", "+eng
				+", "+math
				+", "+getTotal()
				+", "+getAverage();
	}
	

}


