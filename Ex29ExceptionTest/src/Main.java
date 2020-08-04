import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. Error(����)		: ���� �Ұ�
		// 2. Exception(����)	: ���� ��(Run Time) ������ �߻�
		
		// Exception ��:
		// 1) ����ڰ� �߸��� �����͸� �Է��ϴ� ���
		// 2) ������ �����̳� ����� �߸��� ���
		// 3) ��Ʈ��ũ�� �ϵ���� ����
		// 4) ������ ������ ����(�𵵽� ����) virus: �ذ��� �����
		
		
		System.out.println("����ó���� ���� �˾ƺ��ô�!");
		
		
		// ���ܻ�Ȳ�� ���� Ȯ��
//		int k=0;
//		System.out.println( 10/k );
		//���ܰ� �߻��ϴ� ���α׷��� �� ��ġ���� ���� �����
		//�� ����ڵ��� ���α׷� ����߿� ���ܻ�Ȳ�� �߻��ϴ��� ���� �ٿ�Ǵ� �� ���ٴ� 
		//�� �۾��� �� �ϰ� ������ �۾����� �״�� �����ϱ� �����
		
		//[����ó��] ��� ����� ���ܰ� �� ������ �ϴ� ���� �ƴ�!
		//��, ���ܰ� �߻��ϴ��� �� �۾��� �� �ϰ� �ٸ� �۾��� �����ϵ��� ���� = ����ó��
		
		// 0 ���������� ���: if������ �ذ�
		// ������! �������Ӱ��� ���� ������ �ٿ�θ� �̸� if������ �ľ��ϴ� ���� �Ұ���
		//�׷��� ������ �õ��غ��� ���ܰ� �߻��ϸ� �����ϴ� ����� �ʿ�
		
		//����ó�� ���� : � �۾��� �õ�(try)�ϰ� ���� ���ܰ� �߻��ϸ� ���α׷��� �ٿ���� �ʵ��� �ϴ°� 
		
		
		//1) 0���� ������
		
		int a=2;
		try {
			System.out.println("���: "+10/a); // ���ܹ߻��� �����
		}catch(ArithmeticException e) {
			System.out.println("*Exception*");
			//���޹��� �Ķ���� e �� ���������� �����ִ� ��ü
			System.out.println(e.toString());
		}
		System.out.println();
	
		
		//2) �迭�� �ε�����ȣ ��� ����
		int[] arr= new int[5];
		
		try {
			for(int i=0; i<=5; i++) {
				System.out.println(arr[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception!");
		}
		System.out.println();
		
		//3) null ���������� ��ü�� �޼ҵ� ���
		String s= null;
		try {
			System.out.println(s.length());
		}catch(NullPointerException e) {
			System.out.println("Exception: ���������� ����Ű�� ���� ����");
		}
		System.out.println();
		
		
		//4) �߸��� �����͸� �Է�!
		Scanner scan= new Scanner(System.in);
//		int n;
//		try {
//			n=scan.nextInt();
//			System.out.println("n: "+ n); //������ �߻����� �ʾ������� ���!
//		}catch(InputMismatchException e) {
//			System.out.println("Exception! ������ �Է��ϼ���.");
//		}
		
		
		//5) ���ڰ� �ƴѰ��� ���ڷ� �����ϰ��� �Ҷ�
//		String str= scan.next(); //���ڿ��Է�
		
		try {
//			int num = (Integer.parseInt(str));
//			System.out.println( num );
		}catch(NumberFormatException e) {
			System.out.println("Exception: ���ڰ� �ƴ϶� ��ȯ �Ұ�");
		}
		
		
		//** ����! ����ó���� ���α׷��� �ٿ���� �ʵ��� �ϴ� ���� **
		
		//���ܰ� �ѹ��� ������ �߻��ϴ� ���..
		//��) �� ���� �Է¹޾� �� ���� �������ϴ� ���
		//����ó���� ��ø����
		
		int c, d;
		
//		try {
//			c= scan.nextInt();
//			d= scan.nextInt();
//			try {
//				System.out.println("������ ��� : "+ c/d);
//				}catch(ArithmeticException e) {
//					System.out.println("Exception: 0 ������");
//				}
//				
//		}catch(InputMismatchException e) {
//			System.out.println("Exception: ������ �Է� ����");
//		}
		
		
		// ��Ƽ catch : ������ �� ������ ����+������
		
//		try {
//			c= scan.nextInt();
//			d= scan.nextInt();
//			
//			System.out.println("������: "+ c/d);
//		}catch(InputMismatchException e) {
//			System.out.println("Exception: ������ ����");
//		}catch(ArithmeticException e) {
//			System.out.println("Exception: 0 ������ �Ұ�");
//		}
		
		
		//��Ƽ catch�� ���������� ���� -> ��� �� ���� ó���ϴ� ���� ����
		// ��, ��� ���ܻ�Ȳ���� ó���� ������ Ư���� �ٸ��� �ʴٸ�..
		
		//��Ƽcatch: ��� Exception Ŭ������ �θ��������� ���
		
//		try {
//			c= scan.nextInt();
//			d= scan.nextInt();
//			
//			System.out.println("������: "+ c/d);
//		}catch( Exception e) { //� ������ Exception�� �� ���� �� �ִ� �Ű�����
//			System.out.println("����~~~~~!!!");
//		}
		
		
		
		//finally ���� - ���ܰ� �߻��ϵ� ���ϵ� ������ ����Ǵ� ����
		int x= 0;
		try {
			System.out.println(10/x);
			System.out.println("��� ����!");
		}catch(Exception e) {
			System.out.println("��� ����!");
		}finally {
			//�� �������װ��� ������� ������ ����
			System.out.println("fianlly!!!");
		}
		
		
		// ..?? �׷��� finally�� ���
		//������ try-catch{} �ۿ� ���� ������ �����.
		// �ǹ̰� �����
		// -> finally�� ���ٸ� try �ȿ��ִ� �ڵ�ʹ� ������� �ڵ带 ��ٰ� ����
		
		//finally�� ���� �� ���� ��� ū ���̴� ������, finally�� �ڵ尡 try���� ����Ǿ������� ��Ÿ���� ���� ����
		
		//finally�� ���ԵǸ� catch���� ���� ����
		try {
			
		}finally {}
		
		
		//������ �ӤӤӤӤӤӤӤӤӤӤӤӤӤӤӤӤӤӤӤӤӤӤӤӤӤӤӤӤӤӤӤӤӤӤӤӤ�
		
		//1. Checked Exception		:����ó���� �� �ϸ� �������� ���� ����
		//2. unchuked Exception
		
		//��Ʈ��ũ �۾�
//		
//		try {
//		URL url new URL("http://www.naver.com")
//		}catch(MalformedURLException)
		

		
		//���� �����
		File file= new File("D://aaa.txt")
		
		try {
			FileInputStream fis= new FileInputStream(file);
			
			System.out.println("���� ���� ����");
		}catch(FileNotFoundException e) {
			System.out.println(""+"�������ӽ���! : ���Ͼ���");
		}
		
		
		
		//�� ����?
		System.out.println();
		System.out.println("¹��!!");
		
		
		
	}

}
