
public class Test {
	
	final int num=20; //�ʵ� = ������� -> final �������
//	final int age; //error. final ��������� �ݵ�� �����ϸ鼭 ����� �ʱ�ȭ�� �Ǿ��־���Ѵ�.
	// ��������� �ȵ�
	
	void aaa() {
//		num=30; //num�� ����� �� ��
		
		final int melon;
		bbb(10);
		
	}
	
	void bbb(final int k) {
//		k=30; //error. 
		System.out.println( k );
	}
	
	//�޼ҵ忡 final ���̱�
	//= final method
	
	final void show() {
		System.out.println("Test!!");
	}
	
	
}
