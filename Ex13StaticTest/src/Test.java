
public class Test {
	
	public int a; //������� - �ν��Ͻ����� �����ϹǷ� = �ν��Ͻ� ����
	public static int b; //static ������� = class�� �ϳ� �ۿ� ���� ���� = Ŭ��������
	
	//������ �޼ҵ�
	public Test(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	//static method�� ���� - class method��� �θ�
	
	void aaa() {
		System.out.println("aaa");
		System.out.println("a: "+a); 
		System.out.println("b: "+b);
	}//aaa �Ϲ� �޼ҵ� - �ν���Ʈ �޼ҵ��� �θ�
	
	static void show() {
		System.out.println("show");
		//static method�ȿ����� �ν��Ͻ� ������ ����� �� ����!! System.out.println("a: "+a);
		//static method�� ��ü���� ���� ȣ�� �� �� ����
		//���� instance ������ �������� ���� �� �����Ƿ� ������ ��� ����!
		System.out.println("b: "+b);
	}
	
	
	public static final int MAX=10;
	
}
