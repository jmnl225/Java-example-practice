
public class Main3 {
	
	public static void main(String[] args) {
		
		//throw: �ڵ带 ���ؼ� ���ܸ� ������ �ߵ� != throws
		
		try {
			System.out.println("aaa");
			//������ ���ܹߵ�!
			throw new Exception(); //���ܰ�ü�� ���� ���� ������
			
			//System.out.println("bbb"); //���ܰ� �ƴѵ��� ������⿡ �� �ڵ尡 ������ �� ��
			
		}catch(Exception e) {
			System.out.println("���ܹ߻�!");
		}
		
		//[Ȱ�� ��]
		
		//�޼ҵ忡�� ��������� �ش޶�� �䱸, return�� ����� ������ �� ����
		//���α׷����� ������ ���´ٰ��ؼ� ���ܰ� �߻����� ����
		// �׷���, �� �ۿ����� ������ ���� ������ �ʵ��� �ϰ�ʹٸ�!
		// ������ ������ 0������ �� �� ó�� �߸��� �����̶� ǥ���ϰ�ʹٸ�
		// ������ ������ �� ���ܸ� throw�ϵ��� ����
		
		int n;

		
		try {
		n=aaa(10,3);
		System.out.println("n: "+ n);
		
		n=aaa(10,13);
		System.out.println("n: "+ n);
		
		}catch(Exception e) {
			System.out.println("��� ����� �����Դϴ�.");
			System.out.println( e.getMessage() );
		}
		
		
		
		
	}
	
	
	static int aaa(int a, int b) throws Exception {
		if( a<b ) {//������ ���� ��Ȳ
			throw new MyException("Hi ><");
		}
		return a-b;
	}
	
	
	

}//main end.



//������ Exception Ŭ���� ���� ����

class MyException extends Exception{
	//������
	public MyException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
		
		
		
	}
}












