
public class Third {
	
	//������� = field
	
	int a;
	
	//��� �Լ� = method
	
	void show() {
		System.out.println("Third Show!");
		
		//method �ȿ� class�� ����
		//����Ŭ���� (local class) = ����Ŭ����. �ۿ����� ������ �� ��.
		class Nice{
			int n;
			void aaa() {}
		}
		
		Nice n=new Nice();
		n.aaa();
		
		Test tt= new Test();
		tt.show();
		
		
	}//show method end.
	

	//Ŭ���� �ȿ� �� �ٸ� Ŭ���� ���� ����
	//inner Ŭ����
	//�̳�Ŭ������ �̳�Ŭ������ ���δ� �ƿ���Ŭ������ ����� �� ����
	
	class Hello{
		
	}
	
	
	

} // Third class end.





//�ϳ��� .java ���� �ȿ� �������� class
//��, �ϳ��� �����ȿ� public class�� ���� �ϳ�������. 1��~!
//.java�������� public class�� ���� �̸��̿����� (������ �������


class Test{
	
	void show() {
		System.out.println("Test Show!");
	}
	
}