import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ������ copy�ϴ� ���α׷�
		
		// ���������� ��ο� ���ϸ�.Ȯ����!
		String srcPath= "D:/files/aaa.txt";
		
		
		try {
			//���������� �о���� ���� �������ε� ���� - ���Ӵ޾��� �غ���
			FileInputStream fis= new FileInputStream(srcPath);
			
			//�о�� �����͸� ������ ������ ��ο� ���ϸ�����
			File path= new File("D:/copy");//��θ� ����
			if( !path.isDirectory() ) path.mkdirs(); //������ ������
			
			//��ο� ���ϸ��� ������ ���ο� File��ü ����
			File file= new File(path, "bbb.txt");
			
			//������ ���� ���ϰ� ����� OutputStream ����
			FileOutputStream fos= new FileOutputStream(file);
			
			//�������Ͽ��� 1byte�� �о���鼭 ��ٷ� 1byte�� ī���� ���Ͽ� ����
			while(true) {
				byte b= (byte)fis.read();//1byte �б�
				if(b == -1) break;
				
				fos.write(b); //������ �о�� 1byte�� ����
			}
			
			//���Ͼ��� Stream�� �����Ͱ� �ɷ����� �� �����Ƿ� �о��
			fos.flush();
			
			//������� ���� �� ������...
			//�������� ��Ʈ�� �ݱ�..
			fis.close();
			fos.close();
			
			System.out.println("���簡 �Ϸ�Ǿ����ϴ�.");
			
		} catch (FileNotFoundException e) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		} catch (IOException e) {
			System.out.println("�����߿� ������ �߻��߽��ϴ�.");
		}
		

	}

}
