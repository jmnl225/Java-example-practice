
//�߻�Ŭ����: new�� �̿��� ��ü������ �Ұ���
// - �׳� ����ϴ� ���� �ƴ϶� �ݵ�� ����ؼ� ���


abstract public class Test {
	
	int a; //�ν��Ͻ� ����
	static int b=10; //static ����[Ŭ��������]
	
	//�����ڸ޼ҵ� ����
	public Test() {
		System.out.println("Test ��ü����");
	}
	
	
	
	
	
	//�ν��Ͻ� �޼ҵ� 
	void show() {
		System.out.println("Show!");
	}
	
	//�߻�޼ҵ�
	abstract void aaa();
	
//	abstract void bbb() {} //����� ������ϱ⿡ {}����� �Ұ�
	abstract void bbb();
	
	//static�� abstract�� �Բ��� �� ����!!!!!!!!
	
//	static abstract void ccc();
	
	//static �޼ҵ�
	static void ccc() {
		System.out.println("Test class static method");
	}
	
	
}
