
public class Main {
	static public void main(String[] args) {
		
		Second s= new Second();
		s.show();
		
		//�Ķ���͸� ���ؼ� ���� ���� ��ü ����
		Second s2= new Second(10, 20);
		s2.show();
		
		
		
		Second s3= new Second(50, 60);
		s3.show();
		
		
		//����� ��ӵ� ����! (���θ�-�θ�-�ڽ�)
		//Second�� ��ӹ��� Third Ŭ����
		Third t= new Third();
		
		
		System.out.println();
		
		//��ӿ� ���Ǿ��� First class�� �� �ٸ� class�� ����ص� ��!
		//����� 1ȸ���� �ƴϴ٤�����~~~ 
		Test test= new Test();
		System.out.println();
		
		
		//�������� Ŭ���� ��ӹޱ�: java������ �Ұ���!
		
		
		
		//����� ����� �� ����� ��:
		//��ӹ��� ����� ������ �� �� ��!
		
		
		
		
	}
}
