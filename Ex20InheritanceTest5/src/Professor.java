
public class Professor extends Person {
	
	private String subject = "";
	
	public Professor() {
		// TODO Auto-generated constructor stub
	}
	
	//������ �����ε�
	public Professor(String name, int age, String subject) {
		super(name, age);
		this.subject= subject;
	}
	
	//�������̵�
	@Override
	public void show() {
		// TODO Auto-generated method stub
		super.show();
		System.out.println("subject: "+ subject);
	}
	
	

}
