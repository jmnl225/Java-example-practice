
public class Student extends Person {
	
	//�̹� name, age�� ������ ����
	private String major;
	
	public Student() {
		super();
		major="";
	}
	
	public Student(String name, int age, String major) {
		super(name, age);
		this.major=major;
	}
	
	
	//�������̵�
	public void show() {
		super.show();
		System.out.println("mojor: "+ major);
	}
	
	
}
