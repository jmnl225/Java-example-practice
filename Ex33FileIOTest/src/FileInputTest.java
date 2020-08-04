import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest {
	public static void main(String[] args) {
		
		//�о�� ������ ���ϸ��� ���� ���Ӵ� ��ü ����
		File file= new File("aaa.txt");
		
		
		//���ϰ� ������ �������ε� (Stream)
		//�� �߿����� �����͸� �о���� InputStream ����
		//�� �߿����� File ������ ������� FileInputStream ����
		
		
		try {
			//fis�� ������ �������� ������ ���ܹ߻�! **�ڵ����� ��������� �ʽ��ϴ�.**
			FileInputStream fis= new FileInputStream(file);
			
			byte b=(byte)fis.read(); //1byte�� �о����
			
			//��Ʈ���� ���� �о����
			/*while( b != -1 ) { //�ƽ�Ű���� �ƴ� �� �̻� ���� ���� ������ -1�� ������
//				System.out.println(b); //�ƽ�Ű���� ����
				System.out.println((char)b);
				b= (byte)fis.read(); //���� ����Ʈ �� �о����
			}*/
			
			//�� ��ĺ��ٴ� �ѹ��� �о�ͼ� byte[] �� �޴� ���� �� ����
			//�б� ���� �о� �� �����͵��� ������ ��  byte[]�迭�� �غ�
			
			byte[] bytes= new byte[1024]; // �� �����ִ� ũ��� ����� ���� [1024 byte= 1KB]
			fis.read(bytes); //���޵� �� �迭�� �����͵��� �о�ͼ� �־���
			
			//�о�� �� byte[] �迭�� String���� ��ȯ�Ͽ� ���
			//byte[] -> String ��ȯ
			String s= new String(bytes); //�����ڿ� ���޵� byte�� ���ڿ��� ��ȯ
			
			System.out.println(s);
			
			//Ŀ���� ������� �Դٸ� �б� ����
			
			System.out.println("���� �ε� �Ϸ�.");
			
			//������ �бⰡ �������� ��Ʈ���� �ʿ� �����Ƿ� �ݾƾ� �Ѵ�!
			
			fis.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		} catch (IOException e) {
			System.out.println("�д� ���� �� ������ �߻��Ͽ����ϴ�.");
		}
		
		//��Ʈ���� ���� �о����...
		
		
	}

}
