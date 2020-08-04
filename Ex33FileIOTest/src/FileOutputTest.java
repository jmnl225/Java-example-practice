import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//5/7
		//����ڷκ��� ���ڿ��� �Է¹޾� ������ ���Ͽ� �����ϴ� ���α׷�
		
		Scanner scan= new Scanner(System.in);
		System.out.println("������ ������ �Է�: ");
		String data= scan.next();
		
		
		//������ ���ϰ��� �������ε�(Stream)�� ������ִ� ���Ӵ� ��ü(File) ����
		//�����ڷ� ������ �ε带 ������ ��ġ�� �����������
		//��, ���� ���� ��ġ ���� �� ���ϸ�.������ ����!
		//Ư���� ��ũ�� ��ġ��θ� �������� ������ �� .java������ �ִ� ������Ʈ ����
		
		
		File file= new File("aaa.txt");
		
		//############### ���� ������ġ ���� #################
		
		
		//���� ������Ʈ ���� �ȿ� Ư�� ���� �ȿ� ��������
		//����� ���й��� (������ / )
		//Windows���� �������� \�Ǵ�  ������ / ��� ��� ����
		//Linux, Mac ������ �����ø� ����
		
//		file= new File("kkk\\aaa.txt"); // �������ô� "" �ȿ��� Ư�����ڷ� �����ϹǷ� ����Ϸ��� �������� 2���� ��� 1���� �ν�
		file= new File("kkk/aaa.txt"); //kk��� ���� �ȿ� ���� ����
		
		//������ ������ �ڵ����� �������� ������ ������ �ʴ´�
		
		//���α׷����� kkk������ ������ ��. �� ����
		//���������� File��ü ����
		File path= new File("KKK");
		if(!path.isDirectory()){ //�� ������ ���°�?
			//���ٸ� ���丮�� ������ (make directory)
			path.mkdirs(); //���������� �ִٸ� �Ѳ����� �����
		}
		
		//������ ���� ��ο� ���ϸ�.Ȯ���ڱ��� ������ File��ü�� ���� ����
		file = new File(path, "aaa.txt"); //path�� ��ο� ���ϸ��� ���յ�.
		
		//�� ������Ʈ ������ �ƴ� Ư�� ��ġ�� �ٷ� �����ϱ�..
		file= new File("D:/aaa.txt");
		
		//Ư�� �������� �����ϰ� �ʹٸ�?
		//���� ��θ����� �� file��ü �����
		path= new File("D:/files/kkk");
		if(!path.isDirectory()) path.mkdirs();
		
		//�� ��ο� ���ϸ��� ������ File ��ü ���� ����
		file= new File(path, "hello.txt");
		
		//#################################
		
		
		//���� ��ü�� ���� ������ġ�� �����͸� ������ ���� �������ε� (stream ) ����
		
		//OutputStream�߿��� File�� �����͸� �����ϴ� �뵵�� File output stream
		
		try {
			//���� "aaa.txt"������ ���ٸ� OutputStream�� �ڵ����� �� ������ ����
			//���� "aaa.txt"������ �ִٸ� �� ������ ���� �ȿ� �����͸� ����
			//�⺻������ FileOutputStream�� ���� �����͸� �����
//			FileOutputStream fos= new FileOutputStream(file);
			
			//����, ����Ⱑ �ƴ϶� �̾���̱⸦ �ϰ�ʹٸ�
			FileOutputStream fos= new FileOutputStream(file, true); // �ι�° �Ķ����
			
			//��Ʈ���� ���� �����͸� ���Ͽ� �ۼ�(������)
			// fos.write(65); �ѹ��� 1 byte���� �����͸� ���� �� ����
			
//			fos.write(65);
			//�빮�� 'A'�ۼ�
			
			//1byte�� �����͸� �������� ���ڿ��������� ��� �����
			//���ڿ� (String) ��ü�� ������ ���� byte[]�� ��ȯ�ϴ� ����� ����
			
			byte[] bytes= data.getBytes(); // String ->byte[]
			fos.write(bytes); // ����Ʈ�迭�� ������
			fos.flush(); // ��Ʈ���� �ִ� �����͸� �о�� ���
			
			//������ ������ ������ ������ ��Ʈ���� �� �̻� �ʿ����� �����Ƿ�
			//��Ʈ���� �ݾ���� ��
			
			fos.close();
			
			//������� Ŀ���� �Դٸ� ������ �� �Ǿ��ٴ� ��
			System.out.println("���� ���� �Ϸ�");
			
		} catch (FileNotFoundException e) {
			System.out.println("������ �������� ����");
		} catch (IOException e1) {
			System.out.println("���� �۾� �� ");
		}

		
	}

}
