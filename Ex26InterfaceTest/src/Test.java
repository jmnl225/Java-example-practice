
//�������̽��� �����ϴ� ���: Ŭ������ �����ϴ� ����� ���� ���
//interface == abstract class �� ����� ����
//new�� �̿��ؼ� ��ü���� �Ұ�!

public interface Test {
	
	//interface�� Ư¡��:
	//1. �������̽� {}�ȿ����� �ν��Ͻ�����, static ����, �ν��Ͻ� �޼ҵ带 ���� �� ����. ��� �ʵ� �߿����� final�� ����
	//2. �������̽� �ȿ����� abstract method, static method�� ��� ����
	//3. �������̽��� ����� ��� ���������ڰ� public�� ����
	//4. �������̽��� ���(�޼ҵ�) ������ �ϼ����� ���� ���赵���̹Ƿ� �׳� ����� �� ����. �ݵ�� ����� �����ؾ߸� ��� ����
	//5. �������̽��� ����Ϸ��� ���ο� Ŭ������ �����ϸ鼭 ����� �����ؾ���.
	//6. �������̽��� ������ ������ ��Ӱ����̱⿡ Up casting�� �ȴ�.
	//7. �������̽��� �̳�Ŭ������ ���� �� ����
	//8. �������̽��� ���߱����� ������ ex) AAA, BBB �������̽� -> Sample Ŭ�������� ����
	//9. �������̽��� �ٸ� �������̽��� ��ӹ��� �� ���� // KKK�������̽��� ����� SSS�������̽�
	
	
	
	// �������̽��� ���� �ٸ� Ŭ������ ���� �̸��� �޼ҵ带 ����ϱ� ���� �������
	
	// 1.�Ϲ����� ������� �Ұ�
//	int a;
//	static b;
	
	//final ����� ��� ����!
	final int a=10;	//�ڵ� public static
	int b=20; 		//�ڵ� public static final�� �ٲ�: ����� �ʱ�ȭ�� ���� ��
	
	//3. ���������ڴ� public�� ����
//	private static final int c=100;
//	protected static final int d=50;
	public static final int e=50;
	
	
	//�ν��Ͻ��޼ҵ� �Ұ� 
//	void show() {
//		
//	} 
	
	
	// 2. �߻�޼ҵ�: �̸��� �ְ� ����� ����(implements)�Ǿ����� ���� �޼ҵ�
	abstract void aaa();
	void bbb();		//�ڵ� public abstract
	//static �޼ҵ� (JDK 1.8�������� ����)
	static void ccc() {
		System.out.println("Hello, ccc");
	}
	
	
	
	// inner class: �ڵ� public static
	
	class Hello{
		void show() {
			System.out.println("Show inner Class!");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}// Test interface end.
