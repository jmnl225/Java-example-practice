
public class InitialTest {
	
	//1. �⺻�� �ʱ�ȭ - 0�� �ش��ϴ� ��
	int a=10; //2. ����� �ʱ�ȭ: ���Ը� ����. ������ ���� �ȵȴ�!
	
	//3.1 static �ʱ�ȭ ��
	static
	{
		System.out.println("static �ʱ�ȭ");
	}
	//3.2 �ν��Ͻ� (instance) �ʱ�ȭ ��
	{
		System.out.println("incstance �ʱ�ȭ");
		a=20;
	}
	
	//4. ������ �޼ҵ� - �Ű����� ���޹޾� �ʱ�ȭ
	public InitialTest() {
		a=30;
	}
	
	
	
	
	
	
}
