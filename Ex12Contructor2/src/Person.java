
public class Person {
	
	//�ʵ�
	
	private String name;
	private int age;
	
	//��ü�� ���� / new�� �� �� �ڵ����� ȣ��Ǵ� �޼ҵ� = ������: constructor
	
	public Person(String name, int age){ //��������� ���� �ʱ�ȭ
		this.name=name;
		this.age=age;
		System.out.println("Person ��ü ����: String, int");
	}
	//������ �����ε�
	public Person(){
		
		this("�͸�", 0);  //������ �ٸ� �����ڸ� ȣ���ϱ� 
		//�ݵ�� ù��° �����̾����!!!!!!!!!!!!!

		System.out.println("Person ��ü ����");
		//this.name="�͸�";
		//this.age=0;
		//�Ű������� ���޹޾� ��������� �־��ִ� �� ���� �����ڸ� �̿��ϸ�..!?
		

		
		
		
	}

}
