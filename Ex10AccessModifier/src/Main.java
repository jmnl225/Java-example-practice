import member.Person;

public class Main {
	
	public static void main(String[] args) {
		
		
		//���� �������� 4���� ����(���� ��->��)
		//1. private	: ���� class ���ο����� ���ٰ���
		//2. default	: ���� ��Ű�� �ȿ����� �ܺο��� .�����ڷ� ���ٰ��� 
		//3. protected	: ���� ��Ű�� �ȿ����� �ܺο��� .�����ڷ� ���ٰ���, �ٸ� ��Ű������ ��Ӱ���� ���ٰ���
		//4. public 	: ����������� .�����ڸ� ���� ��� ���� ����!
		
		//���� ��Ű���� Ŭ���� ��ü ����
		First f= new First();
		//f.a=10; //error. private�� �ܺο��� ��� �Ұ�
		f.b=20; //default : ���� ��Ű�� ��� ����
		f.c=30; 
		f.d=40;
		//���� ��Ű�� �������� private�� �����ϰ� ��� ��� ��� ����
		
		
		
		//�ٸ� ��Ű�� Ŭ���� ��ü ���� [�ٸ� ��Ű���� ĳ������. ]
		aaa.Second s= new aaa.Second();
		//s.a= 10; //error - private�� �ܺο��� ���ٺҰ�
		//s.b= 20; //error - �ٸ� ��Ű���� default�� ���ٺҰ�
		//s.c= 30; //error - �ٸ� ��Ű���� default�� ���ٺҰ�, ��ӵ� �ƴ�
		s.d= 40;
		
		//s.aaa();//error - default ���� ���� �޼ҵ嵵 ���� �Ұ�
		
		s.bbb();
		
		//�ٸ� ��Ű���� default class�� ��ü ������ �Ұ���
		//aaa.Test t;
		
		
		
		//�������� ���� ��Ģ
		//��� ������ private
		//��� �޼ҵ�� public
		
		//ex) �� ����� ���� ����: �̸�, ����, ����
		
		Person p= new Person();
		
		//������ ���еǾ������� ���е� �ʵ忡 ���� �������ִ� ����� �ʿ�
		
		p.setMembers("Jully", 32, "Korea");
		
		p.show();

		
		//�̸��� �����ϰ� �ʹٸ�?
		//p.name="aaa"; //error- private
		//����� �ϳ��� �����ϴ� ��� �޼ҵ� �ʿ�.
		
		//��������� �����ϴ� set XXX() �Լ��� �ʿ�
		
		p.setAge(15);
		p.setName("Jun");
		
		//����� 1�� ����ϱ�.
		//ex) ���̰� 20�� �̸��ΰ�?
		
		//if(p.age<20) {//age�� private �̶� �ȴ�! 
		//	System.out.println("�̼�����!");
		//}
		
		
		//age���� �������ִ� �޼ҵ�!
		
		if(p.getAge() < 20) {
			System.out.println("���� �� �԰� ��!");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
