
public class Car {
	
	Person p; //�ٸ� Ŭ������ ��������� ����!
	int model; //�𵨹�ȣ
	
	
	
	//��� ���
	void show() {
		
		System.out.println("model: "+model);
		p.show(); //�̹� person�� ��±�ɿ� �Ӥ����°�?
		
	}
	
	
	//��� �Է�
	void setMembers(int model, Person p) {
		this.model=model;
		this.p=p;
		
	}//��... �̰� �� �ƴѵ� ��?
	
	//����Է� �����ε�
	void setMembers(int model, String name, int age) {
		this.model= model;
//		this.p.name= name;	//error
//		this.p.age= age;	//error
		//Person p ���������� ��ü�� �� ����!!!!!!!!
		//����Ʈ�� ����Ű�� ��ü�� ����!!!!!!!!!
		//�Է��� �� �� �� ~!~!!!! 
		this.p= new Person();
		this.p.name= name;
		this.p.age= age;
	}
	
	
	//������!!!
	public Car(int model, String name, int age) {
		this.model= model;
//		this.p.name		
//		this.p = new Person();
//		this.p.setMembers("Chanel, 66");
		this.p = new Person(name, age);
	}
	
	//������ �޼ҵ� �����ε�
	public Car() {
		this.model= 0;
		this.p= new Person();
	}
		
}
	
	//�������� \\\�Ĥ�
	
	
	
	

