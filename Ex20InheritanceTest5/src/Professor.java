
public class Professor extends Person {
	
	private String subject = "";
	
	public Professor() {
		// TODO Auto-generated constructor stub
	}
	
	//생성자 오버로딩
	public Professor(String name, int age, String subject) {
		super(name, age);
		this.subject= subject;
	}
	
	//오버라이드
	@Override
	public void show() {
		// TODO Auto-generated method stub
		super.show();
		System.out.println("subject: "+ subject);
	}
	
	

}
