
public class Main {
	public static void main(String[] args) {
		
		//�������̽� interface [�߻�޼ҵ常 ���� �߻�Ŭ����]
		//Test t= new Test; error
		
		//Test �������̽��� ����Ϸ��� Test�������̽��� ������ ���ο� Ŭ������ ����� �̸� ��ü�� �����Ͽ� ���
		
		First f= new First();
		f.aaa();
		f.bbb();
		
		//Second�� Test�������̽��� �����ߴٸ�
		//�� Ŭ������ �ݵ�� aaa()��  bbb()�� �����Ŷ� Ȯ�Ű���!
		Second s= new Second();
		s.aaa();
		s.bbb();
		
		System.out.println();
		
		//6. Test ���������� �ڽİ�ü���� First�� Second�� ��������
		Test t= null;
		t= new First(); //��ĳ����: �������̽� �׽�Ʈ ���������� Ŭ���� ��ü ����
		t.aaa(); //���������� ���� �����ϴ� ��ü�� �������̵� �޼ҵ尡 �ߵ�
		t.bbb(); 
		
		t= new Second(); //��ĳ����
		t.aaa();
		t.bbb();
		
		//interface: ���� �ٸ��� ��������ֱ� ����. (�԰��� ������)
		
		System.out.println();
		
		//7. �̳�Ŭ������ �ܺο��� �׳� �νĵ��� �ʴ´�. -> �ƿ��͸� ���� ���
		//���� �̳�Ŭ������ �ν��� �Ǵ��� ��ü������ �� ��! = �ƿ���Ŭ������ ��밡��!
		//������ STATIC �̳�Ŭ������ �ƿ��;��� ��ٷ� ���� ����
		Test.Hello h= new Test.Hello();
		h.show();
		
		
		//8. ���߱���: AAA, BBB�� ������ Sample class
		Sample k=new Sample();
		k.aaa();
		k.bbb();
		k.ccc();
		
		
		
		
	}

}// Main class end.
