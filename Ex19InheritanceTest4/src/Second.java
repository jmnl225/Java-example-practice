
public class Second extends First {
	
	//�̹� First�� a������ ����.
	
	private int b;
	
	//��±���� ������ �ʾƵ� �̹� First�� show()�� �ִ� ����
	//first �� ��±���� ������ ���� ����!
	//method override
	public void show() {
//		System.out.println(); //error: a�� �����̺�
//		show(); //���ȣ��
		//�θ�Ŭ������ ��Ī�ϴ� Ű���� super
		
		super.show();
		System.out.println("b: "+ b);
	}
	
	
	
}
