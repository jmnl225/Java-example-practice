
public class LocalclassTest {
	
	int g=10; //�������
	
	//����޼ҵ�
	
	void aaa() {
		
		int m=20; //��������
		
		
		//local class(����Ŭ����)
		//�޼ҵ� �ȿ� class�� ����
		class AAA{
			int a;
			void show() {
				System.out.println("AAA Show" +a);
				System.out.println("AAA show" +g); //�޼ҵ带 �����ִ� Ŭ���� ���g�� ����� �� �� ����
				System.out.println( m ); //���� ������ ��� �Ұ�. ��!!!! final ������ �� >< *********************
			}
		}
		//����Ŭ������ ����� ����(�޼ҵ�)�ȿ����� ���!
		
		AAA obj= new AAA();
		obj.show();
		
		
		//���� Ŭ���� �������:
		//1. ����Ŭ������ �޼ҵ� �ȿ��� 1ȸ������ ��� ����ϴ� ��ü�� �ʿ��Ҷ�
		//2. ���߿� ��� '�͸�Ŭ����'�� ���� �� �� ����Ŭ���� ���� ���
		
		
		
	}
	

	void bbb{
		// aaa()�޼ҵ� �ȿ� �ִ� ����Ŭ���� AAA�� �ν��� �� ����
		AAA obj= new AAA(); //error
	}
	

}
