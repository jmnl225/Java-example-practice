
public class Main {
	public static void main(String[] args) {
		
		//��ӹ��� Ŭ������ ���踦 ��Ī
		//c++ : base - derived
		
		
		
		Second s= new Second();
		s.a= 10; //��ӹ��� Ŭ������ ��������� ����ó�� ���
		s.b= 20;
		
		System.out.println("a: "+s.a);
		System.out.println("b: "+s.b);
		System.out.println();
		
		//��ü������ ��Ƽ��: ��ü�� �������� ��ü ������ �ض�!
		//-> ��±���� �� ���� ����? ��ü�� ��!
		
		s.showFirst();
		System.out.println("b: "+s.b);
		System.out.println();
		
		
		//b�� Second�� �ϰ�����!
		
		s.showFirst();
		s.showSecond();
		System.out.println();
		
		
		//? �̷��� �׳� Second���� ��θ� �������?
		
		s.show();
		System.out.println();
		
		
		//�̷����̸� ����� �Էµ� �޼ҵ�� ó������!
		
		s.setMembers(100,200);
		s.show();
		System.out.println();
		
		
		//�̷��� ����.
		//��ü�� �����ϸ鼭 ���� �����ϴ� �� �����ʾ�?
		//������ �޼ҵ带 �̿�����!
		
		
//		Second s2= new Second(8, 3);
//		s2.show();
		
		
		//������ ��!! ������������ ���⿡ ���� ����
		
		 
		
		
		
	}

}
