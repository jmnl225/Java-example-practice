
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p=new Person();
		p.setMembers("Sam", 20);
		p.show();
		
		Person p2=new Person();
		p2.setMembers("Robin", 21);
		
		//��ü�� ���� �� �׻� �ʵ尪�� �����ϴ� �޼ҵ� ȣ��
		//�Ź� ��ü ���� ���� �ٿ� �޼ҵ带 ȣ�� -> ��..
		
		//������ ��ü ���� �� �޼ҵ� �� �� ȣ�� �� �Ŷ��,
		//ó�� ��ü �����Ҷ�(new)�� ��, �޼ҵ尡 ȣ�� �ǵ����ϸ�!?
		//new ������ �޼ҵ� �۾�!
		
		//��ü�� ������ �� �ڵ����� ȣ��Ǵ� �޼ҵ�!!!������!!!
		
		//���� Ȯ���� ����~
		
		First f=new First(); //�� ��, ������ �޼ҵ� ȣ���!
		
		//�����ڿ� ���� �����ϰ� �ʹٸ�.
		
		First f3= new First(10);
		
		
		Person p3= new Person("Hong", 30);
		
	
		
		
		
		
	}

}
