import java.net.MalformedURLException;
import java.net.URL;

public class Main2 {
	
	public static void main(String[] args) {
		
		
		// throws: ���� ���ѱ��
		
		try {
		int x = divide(10, 5);
		System.out.println( x );
		}catch(ArithmeticException e) {
			System.out.println("������ �Ұ�");
		}
		
		
		
		//��ź ���ѱ��:
		
		try {
			aaa();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		
		
	
	}

	//�ƹ����� ���������
	//0 ������ ������ ���� �� ����
	//����ó�� try�� ���� �� �� �� ������ �ɰ��� ������ ����
	//��, �޼ҵ� �ȿ��� �߻��ϴ� ���ܻ�Ȳ�� �޼ҵ� �ȿ����� �ذ� �ȵ�
	
//	static int divide(int a, int b) {
//		try {
//			return a/b;
//		}catch(ArithmeticException e) {
//			System.out.println("Exception: 0 ������ �Ұ�");
//			return ?; //���⿡ �� ���� ����
//		}
//	}
		
	
	//throws
	//���ܸ� �� �޼ҵ� �ȿ��� �ذ����� �ʰ� �� �޼ҵ带 ȣ���ϴ� ������ ����!
	
	static int divide(int a, int b) throws ArithmeticException {
		return a/b;
	}
	
	//��ź���ѱ�� ���� : ���ܸ� ������ ������ ����
	
	static void aaa() throws MalformedURLException {
		bbb();
		System.out.println("aaa");
	}
	
	static void bbb() throws MalformedURLException, Exception {// ������ �����Ⱑ ����
		URL url= new URL("http://www.naver.com");
		ccc(); // Exception�� ������ ������ ����ó���� �ؾ���
	}
	
	static void ccc() throws Exception{
		
	}
	
	
}// main end.
