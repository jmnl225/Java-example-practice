import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
		// ��ü ���� ���α׷���(OOP Object Oriented Programing) : ��ü ���ַ� ���α׷����� �Ѵ�.
		//��ü? ������ ���(����:�Լ�)�� ��(������)�� ���� �༮ (��� ������ �Լ�(=method)�� �����ִ�  ��)
		
		//- Random : ������ ���� ������ �ɷ��� ���� �༮
		//- Scanner: Ű������ �Է��� �޾Ƶ��̴� �ɷ�(System.in) �� �ڷ����� �°� �־���
		//- String: ���ڿ��� �����ϴ� �ɷ��� ���� �༮
		// ���� Random, Scanner, String �̶�� ��ü�� �ɷ��� �����ϴ� ��Ī = Class
		
		//��, ��ü�� ������ class��� �θ�( ��ġlike ������ ������ �ڷ����̶� �ϵ�)
		//JAVA������ �̷� Ŭ������ ��ɺ��� �� 4000��
		
		
		//�� Ŭ������ ����Ϸ��� �ݵ� �� ��ü�� ���� ����ؾ���
		//Random��ü �����Ϸ���
		Random rnd= new Random();
		int n= rnd.nextInt(6);
		
		System.out.println(n);
		
		//JAVA�� �̷� ��ü���� �ʿ��Ҷ� �ҷ��� ����ϴ� ������� ���α׷���
		//�ٽ� ����, 4000������ Ŭ������ �󸶳� �������ҿ� ����ϴ��İ� �߿�
		
		//�� Ŭ������ Java System API(Application interface) or Java System Library
		
		
		
		//������! �����ڰ� ���ϴ� ��� ��� X
		
		//Ex) ���� ĳ���Ͱ� ����
		//�ڹ��� 4000Ŭ���� �߿� �̵��� ���ݱ�� Ŭ������ ����
		
		//���α׷��Ӱ� �� ������ ����� ���� Ŭ�����Ѥ� ���� ���� �� �־����
		
		
		//���α׷��Ӱ� ����� Ŭ���� - ��������� �ڷ���
		
//		class Robot{
//			void move() {}
//			void attack() {}
//		}
		
		//������ ���� Ŭ������ ����Ϸ��� ��ü�� ���� ���
//		Robot r = new Robot();
		
		
		
		//����� ���� Ŭ������ ����� ���
		
		//�����: Ŭ������ �����, ��ü�� �����ؼ� ����ؾ� ��.
		
		
		
		
		// Ŭ������ ���� ����� ��ġ 4����: 
		//1. ������ .java������ class ����
		//2. ���� .java���� �ȿ� �������� class�� ����
		//3. �ٸ� class�ȿ� class�� ����(�ۼ�
		//4. method �ȿ��� Ŭ������ ����
		
		
		Second s=new Second();
		s.a=10;
		s.show();
		
		Third t= new Third();
		t.show();
		
		Test test=new Test();
		test.show();
		
		//Third�� �̳�Ŭ���� Hello�� ��ü ������ �� ����
		// Third.Hello h= new Third.Hello(); //error
		
	}

}
