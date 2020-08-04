import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// �о�� ������ ���ϸ��� ���� ���Ӵް�ü ����
		File file= new File("aaa.txt");
		
		//���ϰ� ������ �������ε�(Stream) ����		
		//�� �߿����� �����͸� �о���� InputStream ����
		//�� �߿����� File������ ������� FileInputStream ����
		
		try {
			//fis�� ������ �������� ������ ���ܹ߻�!! �ڵ����� ��������� ����.
			FileInputStream fis= new FileInputStream(file);
			
			//��Ʈ���� ���� �о����...
//			byte b= (byte)fis.read(); //1byte�� �о����
//			while( b != -1 ) {
//				//System.out.println(b);//�ƽ�Ű���� ����
//				System.out.println( (char)b );
//				b= (byte)fis.read(); //���� ����Ʈ�� �о����								
//			}
			
			// �� ��ĺ��ٴ� �ѹ��� �о�ͼ� byte[] �� �޴� ���� �� ������
			//�б�����, �о�� �����͵��� ������ �� byte[]�� �غ��� ���ƾ� ��
			byte[] bytes= new byte[1024]; // �� �����ִ� ũ��� ����� ���� [1024byte==1KB]
			fis.read(bytes); //���޵� �� �迭�� �����͵��� �о�ͼ� �־���
			
			//�о�� byte�迭�� String���� ��ȯ�Ͽ� ���
			// byte[] -> String ��ȯ
			String s= new String(bytes);//�����ڿ� ���޵� byte�迭�� ���ڿ���ü�� ����
			System.out.println(s);
			
			//������� Ŀ���� �Դٸ�..�бⰡ ������ ���̹Ƿ�..
			System.out.println("���Ϸε尡 �Ϸ�Ǿ����ϴ�.");
			
			//������ �бⰡ �������� ��Ʈ���� �ʿ�����Ƿ� �ݾƾ� ��.
			fis.close();			
			
		} catch (FileNotFoundException e) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		} catch (IOException e) {
			System.out.println("�б���� �� ������ �߻��Ͽ����ϴ�.");
		}

	}

}
