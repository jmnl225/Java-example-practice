
public class Second extends First {
	
	private int b;
	
	//constructor �޼ҵ�
	public Second() {
//		super(); �̹� �������� //�� ������ �ڵ����� �θ�ü ����
		//����!!!!!! �θ�ü�� ������ �Ķ���Ͱ� ���� �޼ҵ�� �ʼ�!!!!!!!!!!!!!!!!!!!!!!!!!
		System.out.println("Second ��ü ����");
	}
	
	
	//������ �޼ҵ� �����ε�
	public Second(int a, int b) {
//		super.a= a; // super�� �ᵵ a �� private�̶� �ȵ�
		//�θ��� ��������� set()�޼ҵ带 ������� �ʰ�
		//�θ� new �� �� ���� ��������!
		//�̹� �θ�� ����������� �θ�����ڸ� ȣ������!
		
//		First(10); //?? C++ ����
		
		super(a); //�θ������ ����� ȣ�� : super�� �׻� ���� ���� �־���Ѵ�. **************************
		this.b=b;
		System.out.println("Second ��ü ���� int int");
		
	}
	
	public void show() {
		showFirst();
		System.out.println("b: "+ b);
		System.out.println();
	}
	
	
	
	
	
}
