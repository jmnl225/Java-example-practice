
public class Main {
	public static void main(String[] args) {
		
		//static ���������� �������� �ʴ´�
		
		//static int a; // ���������� static�� ����� �� ����!
		
		Test t1=new Test(10, 20);
		Test t2=new Test(30, 50);
		Test t3=new Test(70, 90);
		
		t1.a=100;
		System.out.println(t1.a);
		System.out.println(t2.a);
		System.out.println(t3.a);
		System.out.println();
		
		//static ������ TextŬ���� ��ü ������ ������� 1�� �̹Ƿ� �����ϸ� ��� ������ ����
		t1.b= 200;
		System.out.println(t1.b);
		System.out.println(t2.b);
		System.out.println(t3.b);
		System.out.println();
		
		//static ������ ��ü���� �������� �ʰ�, �� Ŭ������ �ϳ��� ����
		//��ü��. �� ���� ǥ����� �̻�
		//�׷��� static ������ ��ü��. ��� 
		//class��. �� ��ȣ!!
		
		Test.b= 500;
		System.out.println(Test.b);
		System.out.println();

		
		//static�� ����ϴ� ����
		//� Ŭ������ ��ü�� ���� ����� Ȯ���ϰ� ������
		
		
		
		new First();new First();new First();new First();new First();new First();
		
		//staticŰ����� �޼ҵ忡�� ���� ����
		
		t1.aaa(); //�Ϲ� �޼ҵ� ȣ��
		//Test.aaa(); //�Ϲ� �޼ҵ�� Ŭ������. ���� ����
		
		//t1.show(); //����� ������ �� �� ��
		Test.show(); // Ŭ������ �޼ҵ�
		
		//Ŭ���� �޼ҵ��� Ư¡�� ��ü ���� ���̵� ����� �� �ִ�!
		
		
		aaa.obj.show();
		
		//�׷�����!
		System.out.println();
		
		//aaa.obj.kkk(); //static�� ��ü�� �ȴ�!
		//aaa.bbb.kkk(); //aaaŬ���� �ȿ� bbbŬ������ �����ϴ� �� �ƴϹǷ� ����!!!
		
		bbb.kkk();
		
		System.out.println(Test.MAX);
		
		
		
	}
}
