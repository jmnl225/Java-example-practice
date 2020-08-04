
public class Student extends Person {
	
	//이미 name, age를 보유한 상태
	private String major;
	
	public Student() {
		super();
		major="";
	}
	
	public Student(String name, int age, String major) {
		super(name, age);
		this.major=major;
	}
	
	
	//오버라이드
	public void show() {
		super.show();
		System.out.println("mojor: "+ major);
	}
	
	
}
