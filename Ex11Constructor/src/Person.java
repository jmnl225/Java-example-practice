
public class Person {
	
	//��������� private
	private String name;
	private int age;
	
	//Person��ü�� ������ �� �ڵ����� �� �� ȣ��Ǵ� �޼ҵ�= �� �� ��!!!!!!!
	//�����ڸ� ���鶧 ���� �����ڴ�  public�� ����!
	Person(String name, int age){
		this.name= name;
		this.age= age;
		
		System.out.println("Person ��ü ����: String, int");
	}
	
	//������ �����ε��� �ʿ���!!!!
	
	Person(){
		System.out.println("Person ��ü ����!");
		this.name= "�͸�";
		this.age =20;
	}
	
	
	
	
	
	
	
	
	
	//����� ���� ���
	public void setMembers(String name, int age) {
		this.name= name;
		this.age= age;
	}
	
	public void show() {
		System.out.println("name: "+name);
		System.out.println("age: "+age);
		System.out.println();
		
		
		
		
		
		
		
		
		
		
	}
	
}
